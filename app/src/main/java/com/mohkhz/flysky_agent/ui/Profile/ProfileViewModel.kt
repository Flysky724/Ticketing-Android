package com.mohkhz.flysky_agent.ui.Profile

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.Resource
import com.mohkhz.flysky_agent_support.util.Routes
import com.mohkhz.flysky_agent_support.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


private const val TAG = "ProfileViewModel"

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repository: Repository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiEvent = Channel<UiEvent> {}
    val uiEvent = _uiEvent.receiveAsFlow()

    private val _user = MutableStateFlow<User>(User())
    val user: Flow<User> = _user

    private val _website = MutableStateFlow("")
    val website: Flow<String> = _website

    private val _userName = MutableStateFlow<Array<String>>(emptyArray())
    val userName: Flow<Array<String>> = _userName

    private val _inProgress = MutableStateFlow(true)
    val inProgress :Flow<Boolean> = _inProgress

    init {
        setUser()
    }

    fun onEvent(event: ProfileEvent) {

        when (event) {
            is ProfileEvent.OnEnterSiteClick -> {
                openLink(event.context)
            }
            is ProfileEvent.OnWhatsAppClick -> {
                openWhatsApp(event.context)
            }
            is ProfileEvent.OnNewAgentClick -> {
                sendUiEvent(UiEvent.Navigate(Routes.NEW_AGENT_SCREEN))
            }
            is ProfileEvent.OnBackClick -> {
                sendUiEvent(UiEvent.PopBackStack)
            }
            is ProfileEvent.OnLogOutClick -> {
                viewModelScope.launch {
                    repository.updateDataStore("", "")
                    sendUiEvent(UiEvent.Navigate(Routes.LOGIN_SCREEN))
                }

            }

        }
    }

    private fun setUser() {

        val uId = savedStateHandle.get<String>("uId")

        if (!uId.isNullOrEmpty())
            viewModelScope.launch(Dispatchers.IO) {
                val result = repository.getUser(uId)

                when (result) {
                    is Resource.Success -> {
                        _user.value = result.data!!.user!!

                        _userName.value = _user.value.getNames()

                        Log.d(TAG, "done , ${result.data.user!!.userName}")
                        _inProgress.value = false
                    }
                    is Resource.Error -> {
                        Log.d(TAG, " error ")
                    }
                }
            }

    }

    private fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    private fun openLink(context: Context) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("http://${_user.value.website}")
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        ContextCompat.startActivity(context, intent, null)
    }

    private fun openWhatsApp(context: Context) {
        val url = "https://api.whatsapp.com/send?phone=${_user.value.phoneNumber}"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        ContextCompat.startActivity(context, intent, null)
    }

    fun setWebsite(address: String): String {
        if (address.isNullOrEmpty())
            return ""
        else {
            val web = address.split(".").toTypedArray()
            Log.d(TAG, "")
            return web[1]
        }
    }

}