package com.mohkhz.flysky_agent.ui.NewAgent

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent_support.util.Resource
import com.mohkhz.flysky_agent_support.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "NewAgentViewModel"

@HiltViewModel
class NewAgentViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _uiEvent = Channel<UiEvent> {}
    val uiEvent = _uiEvent.receiveAsFlow()

    var firstName by mutableStateOf("")
        private set

    var lastName by mutableStateOf("")
        private set

    var phone by mutableStateOf("")
        private set

    var website by mutableStateOf("")
        private set

    private val _emptyError = MutableStateFlow(false)
    val emptyError: Flow<Boolean> = _emptyError

    fun onEvent(event: NewAgentEvent) {
        when (event) {
            is NewAgentEvent.OnAddClick -> {

                _emptyError.value =
                    website.isEmpty() || firstName.isEmpty() || phone.isEmpty() || lastName.isEmpty()

                if (!_emptyError.value) {

                    newAgent({ event.back() })
                }

            }
            is NewAgentEvent.OnAddClick -> {

            }
            is NewAgentEvent.OnFistNameValueChange -> {
                firstName = event.text
            }
            is NewAgentEvent.OnLastNameValueChange -> {
                lastName = event.text
            }
            is NewAgentEvent.OnPhoneValueChange -> {
                phone = event.text
            }
            is NewAgentEvent.OnWebsiteValueChange -> {
                website = event.text
            }

            else -> {}
        }
    }

    private fun newAgent(back: () -> Unit) {

        viewModelScope.launch {

            val result = repository.newAgent(firstName + "\\" + lastName, website, phone)

            when (result) {
                is Resource.Error -> {
                    Log.d(TAG, result.message + "")
                }
                is Resource.Success -> {
                    back()
                    Log.d(TAG, result.message + " user added ")
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