package com.mohkhz.covid19_compose.ui.Chooser

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent_support.util.Resource
import com.mohkhz.flysky_agent_support.util.Routes
import com.mohkhz.flysky_agent_support.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "ChooserViewModel"

@HiltViewModel
class ChooserViewModel @Inject constructor(private val repo: Repository) : ViewModel() {

    private val _uiEvent = Channel<UiEvent> { }
    var uiEvent = _uiEvent.receiveAsFlow()

    var website: MutableLiveData<String> = MutableLiveData()
    var phoneNumber: MutableLiveData<String> = MutableLiveData()

    private val _loginProgress = MutableStateFlow(false)
    val loginProgress: StateFlow<Boolean> = _loginProgress

    init {
        getData()
    }

    fun onEvent(event: ChooseEvent) {
        when (event) {
            is ChooseEvent.OnHome -> {
                _loginProgress.value = false
                sendUiEvent(UiEvent.Navigate(Routes.HOME_SCREEN + "?uId=${event.userId}"))

            }
            is ChooseEvent.OnLogin -> {
                sendUiEvent(UiEvent.Navigate(Routes.LOGIN_SCREEN))
            }
        }
    }

    fun change(website: String, phoneNumber: String) {
        viewModelScope.launch {
            val response = repo.login(website, phoneNumber)

            /*
            response.let {
                it!!.colle { list ->
                    if (!list.isNullOrEmpty()) {
                        try {
                            if (website.equals(list.get(0).website) && phoneNumber.equals(list.get(0).phoneNumber)) {
                                onEvent(ChooseEvent.OnHome(list.get(0).id!!))
                            } else {
                                onEvent(ChooseEvent.OnLogin)
                            }
                        } catch (e: Exception) {
                            onEvent(ChooseEvent.OnLogin)
                        }
                    }
                }
            }*/

        }
    }

    fun getData() {
        viewModelScope.launch(Dispatchers.IO) {
            repo.readDataStore().collect {
                if (it.contains("null")) {
                    onEvent(ChooseEvent.OnLogin)
                } else {
                    _loginProgress.value = true
                    val a = it.split(":").toTypedArray()
                    website.postValue(a.get(0).removeWhitespaces())
                    phoneNumber.postValue(a.get(1).removeWhitespaces())
                    login()
                }
            }
        }

    }

    private fun login() {
        viewModelScope.launch {
            var response = repo.login(website.value!!, phoneNumber.value!!)

            when (response) {
                is Resource.Error -> {
                    Log.d(TAG, response.message!!)
                }
                is Resource.Success -> {
                    val result = response.data
                    Log.d(TAG, "${response.data?.status_code}")
                    if (response.data?.status_code.equals("200")) {
                        repo.updateDataStore(website.value!!, phoneNumber.value!!)
                        onEvent(ChooseEvent.OnHome(response.data?.user!!.id.toString()))
                    } else {
                        onEvent(ChooseEvent.OnLogin)
                    }

                }
            }
        }

    }

    private fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    private fun String.removeWhitespaces() = replace(" ", "")
}