package com.mohkhz.flysky_agent.ui.login

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent_support.util.Resource
import com.mohkhz.flysky_agent_support.util.Routes
import com.mohkhz.flysky_agent_support.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "LoginViewModel"

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _uiEvent = Channel<UiEvent> { }
    val uiEvent = _uiEvent.receiveAsFlow()

    var webSite by mutableStateOf("")
        private set

    var number by mutableStateOf("")
        private set

    private val _emptyFieldError = MutableStateFlow<Boolean>(false)
    val emptyFieldError: StateFlow<Boolean> = _emptyFieldError

    private val _loginProgress = MutableStateFlow<Boolean>(false)
    val loginProgress: StateFlow<Boolean> = _loginProgress

    private val _infoDialog = MutableStateFlow<Boolean>(false)
    val infoDialog: StateFlow<Boolean> = _infoDialog

    //    private val _test = MutableStateFlow<BottomSheetScaffoldState>
//    val a = mutableStateOf<>()
    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.OnLoginClick -> {
                if (webSite.isNullOrEmpty() && number.isNullOrEmpty()) {
                    _emptyFieldError.value = true
                } else {
                    _emptyFieldError.value = false
                    _loginProgress.value = true
                    login()
                }
            }
            is LoginEvent.OnInfoClick -> {
                _infoDialog.value = true
            }
            is LoginEvent.OnInfoClose -> {
                _infoDialog.value = false
            }
            is LoginEvent.OnNumberChangeVal -> {
                number = event.value
            }
            is LoginEvent.OnWebSiteChangeVal -> {
                webSite = event.value
            }
            is LoginEvent.GoToHome -> {
                sendUiEvent(UiEvent.Navigate(Routes.HOME_SCREEN + "?uId=${event.user.id}"))
            }
        }
    }

    private fun login() {
        viewModelScope.launch {
            var response = repository.login(webSite, number)

            when (response) {
                is Resource.Error -> {
                    Log.d(TAG, response.message!!)
                    _loginProgress.value = false
                }
                is Resource.Success -> {
                    val result = response.data
                    Log.d(TAG, "${response.data?.status_code}")
                    if (response.data?.status_code.equals("200")) {
                        repository.updateDataStore(website = webSite, phoneNumber = number)
                        onEvent(LoginEvent.GoToHome(response.data?.user!!))
                    } else {
                        _emptyFieldError.value = true //  error to find user
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

}