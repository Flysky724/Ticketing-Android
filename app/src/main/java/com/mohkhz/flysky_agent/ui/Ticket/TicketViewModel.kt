package com.mohkhz.flysky_agent.ui.Ticket

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent.data.model.Messages
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

private const val TAG = "TicketViewModel"

@HiltViewModel
class TicketViewModel @Inject constructor(
    private val repository: Repository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _messageList = MutableStateFlow<List<Messages>>(emptyList())
    val messageList: Flow<List<Messages>> = _messageList

    var listTest by mutableStateOf(emptyList<Messages>())
        private set

    private val _user = MutableStateFlow<User>(User())
    val user: Flow<User> = _user

    private val _otherUser = MutableStateFlow<User>(User())
    val otherUser: Flow<User> = _otherUser

    private val _ticket = MutableStateFlow<Ticket>(Ticket())
    val ticket: Flow<Ticket> = _ticket

    private val _inProgress = MutableStateFlow<Boolean>(false)
    val inProgress: Flow<Boolean> = _inProgress

    private val _sendProgress = MutableStateFlow<Boolean>(false)
    val sendProgress: Flow<Boolean> = _sendProgress

    var text by mutableStateOf("")
        private set

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _inProgress.value = true
            getUser()
            getTickets()
            if (_user.value.id!!.equals(1))
                getOtherUser(_ticket.value.creatorId!!)
            else {
                getOtherUser("1")
            }
            getMessages()
        }
    }

    fun onEvent(event: TicketEvent) {
        when (event) {
            is TicketEvent.OnTextChange -> {
                text = event.text
            }
            is TicketEvent.OnSendClick -> {

                if (_user.value.category == "مدیریت" && text.length == 2 && text == "//") {
                    closeTicket()
                } else {
                    val messages = Messages(
                        id = 0,
                        text = text,
                        date = setMessageTime(),
                        false,
                        _ticket.value.id!!.toInt(),
                        _user.value.id!!.toInt(),
                        sendProgress = true
                    )
                    text = ""
                    addMessageToList(messages = messages)
                    sendMessage(messages = messages)
                }

            }
        }
    }

    private suspend fun getUser() {
        val uId = savedStateHandle.get<String>("uId")
        Log.e(TAG, uId.toString())

        if (!uId.equals("-")) {
            val result = repository.getUser(uId!!)
            when (result) {
                is Resource.Error -> {
                    Log.e(TAG, "${result.message}")
                }
                is Resource.Success -> {
                    _user.value = result.data!!.user!!
                    _user.value.userName = _user.value.userName!!.replace("/", " ")
                }
            }
        }
    }

    private suspend fun getTickets() {
        val tId = savedStateHandle.get<String>("tId")

        if (!tId.equals("-")) {
            val result = repository.getTicket(tId!!)

            when (result) {
                is Resource.Error -> {
                    Log.e(TAG, "${result.message}")
                }
                is Resource.Success -> {
                    _ticket.value = result.data!!.ticket
                }
            }
        }

    }

    private suspend fun getMessages() {
        val result = repository.getMessages(_ticket.value.id!!)

        when (result) {
            is Resource.Error -> {
                Log.e(TAG, "${result.message}")
            }
            is Resource.Success -> {
                Log.e(TAG, "${result.message}")
                _messageList.value = result.data!!.list
                listTest = result.data.list
                _inProgress.value = false
            }
        }

    }

    private fun sendMessage(messages: Messages) {
        viewModelScope.launch {

            val result = repository.newMessage(messages)

            when (result) {
                is Resource.Success -> {

                    updateMessage(messages)
                    Log.d(TAG, "done")
                }
                is Resource.Error -> {
                    Log.e(TAG, "fail to add")
                }
            }
        }
    }

    private fun updateMessage(messages: Messages) {
        val myList: MutableList<Messages> = mutableListOf()
        myList.addAll(_messageList.value)
        val index = myList.indexOf(messages)
        messages.sendProgress = false
        myList.set(index, messages)
        _messageList.update { myList }
        text.compareTo("")
        Log.d(TAG, " - list updated")
    }

    private fun addMessageToList(messages: Messages) {
        var myList: MutableList<Messages> = mutableListOf<Messages>()
        myList.addAll(_messageList.value)
        myList.add(element = messages)
        _messageList.update { myList }
        listTest = myList
    }

    private suspend fun getOtherUser(uId: String) {
        val result = repository.getUser(uId)
        when (result) {
            is Resource.Error -> {
                Log.e(TAG, "${result.message}")
            }
            is Resource.Success -> {
                _otherUser.value = result.data!!.user!!
                _otherUser.value.userName = _otherUser.value.userName!!.replace("/", " ")
            }
        }
    }

    fun calculateTime(date: String): String {

        val time = date.split(" ").toTypedArray()
        val times = time[1].split(":").toTypedArray()

        return times[0] + ":" + times[1]
    }

    private fun setMessageTime(): String {
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val formatted = current.format(formatter)
        return formatted
    }

    private fun closeTicket() {

        _ticket.value.status = "بسته شده"
        text = ""

        viewModelScope.launch {

            val result = _ticket.value.id?.let { repository.closeTicket(it) }

            when (result) {
                is Resource.Error -> {
                    Log.e(TAG, "error to add ")
                }
                is Resource.Success -> {
                    Log.d(TAG, "done ticket closed")
                }
            }

        }

    }
}