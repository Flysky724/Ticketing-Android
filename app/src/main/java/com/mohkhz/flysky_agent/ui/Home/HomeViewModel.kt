package com.mohkhz.flysky_agent.ui.Home

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.flysky_agent_support.data.model.CategoryItem
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.Resource
import com.mohkhz.flysky_agent_support.util.Routes
import com.mohkhz.flysky_agent_support.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

private const val TAG = "HomeViewModel"

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: Repository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiEvent = Channel<UiEvent> {}
    val uiEvent = _uiEvent.receiveAsFlow()

    private val _user = MutableStateFlow<User>(User())
    val user: Flow<User> = _user

    private val _ticketList = MutableStateFlow<List<Ticket>>(emptyList())
    val ticketList: Flow<List<Ticket>> = _ticketList

    private val _inProgress = MutableStateFlow<Boolean>(false)
    val inProgress: Flow<Boolean> = _inProgress

    private val _newTicket = MutableStateFlow(false)
    val newTicket: Flow<Boolean> = _newTicket

    // cat list
    private val _priorityCat = MutableStateFlow<List<CategoryItem.PriorityCat>>(emptyList())
    val priorityCat: Flow<List<CategoryItem.PriorityCat>> = _priorityCat

    private val _statusCat = MutableStateFlow<List<CategoryItem.TicketStatusCat>>(emptyList())
    val statusCat: Flow<List<CategoryItem.TicketStatusCat>> = _statusCat

    private val _category = MutableStateFlow<List<CategoryItem.TicketCat>>(emptyList())
    val category: Flow<List<CategoryItem.TicketCat>> = _category

    // expended
    private val _priorityExpanded = MutableStateFlow<Boolean>(false)
    val priorityExpended: StateFlow<Boolean> = _priorityExpanded

    private val _ticketExpanded = MutableStateFlow<Boolean>(false)
    val ticketExpended: StateFlow<Boolean> = _ticketExpanded

    private val _ticketStatusExpanded = MutableStateFlow<Boolean>(false)
    val ticketStatusExpended: StateFlow<Boolean> = _ticketStatusExpanded

    // empty error
    private val _priorityEmptyError = MutableStateFlow<Boolean>(false)
    val priorityEmptyError: StateFlow<Boolean> = _priorityEmptyError

    private val _subjectEmptyError = MutableStateFlow<Boolean>(false)
    val subjectEmptyError: StateFlow<Boolean> = _subjectEmptyError

    private val _ticketEmptyError = MutableStateFlow<Boolean>(false)
    val ticketEmptyError: StateFlow<Boolean> = _ticketEmptyError

    private val _textEmptyError = MutableStateFlow<Boolean>(false)
    val textEmptyError: StateFlow<Boolean> = _textEmptyError

    //values
    private val _priorityValue = MutableStateFlow<CategoryItem?>(null)
    val priorityValue: StateFlow<CategoryItem?> = _priorityValue

    private val _ticketValue = MutableStateFlow<CategoryItem?>(null)
    val ticketValue: StateFlow<CategoryItem?> = _ticketValue

    private val _ticketStatusValue = MutableStateFlow<CategoryItem?>(null)
    val ticketStatusValue: StateFlow<CategoryItem?> = _ticketStatusValue

    private val _subject = MutableStateFlow<String>("")
    val subject: StateFlow<String> = _subject

    private val _textValue = MutableStateFlow<String>("")
    val textValue: StateFlow<String> = _textValue

    private val _sendResponse = MutableStateFlow<Boolean?>(null)
    val sendResponse: Flow<Boolean?> = _sendResponse

    var title by mutableStateOf("")
        private set

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: Flow<Boolean> = _isRefreshing

    // location
    private val _location = MutableStateFlow<String>("start")
    val location: StateFlow<String> = _location

    init {
        _inProgress.value = true
    }

    fun onEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.OnNewTicketClick -> {
                initNewTicket()

                viewModelScope.launch {
                    val result_priority = repository.getPriorityCat()
                    when (result_priority) {
                        is Resource.Error -> {
                            Log.e(TAG, result_priority.message!!)
                        }
                        is Resource.Success -> {
                            Log.e(TAG, result_priority.data!!.message)
                            _priorityCat.value = result_priority.data.list
                        }
                    }
                }

                viewModelScope.launch {
                    val result_category = repository.getCategory()
                    when (result_category) {
                        is Resource.Error -> {
                            Log.e(TAG, result_category.data!!.message)
                        }
                        is Resource.Success -> {
                            Log.e(TAG, result_category.data!!.message)
                            _category.value = result_category.data.list
                        }
                    }
                }

            }
            is HomeEvent.OnNotification -> {
            }
            is HomeEvent.OnProfileClick -> {
                sendUiEvent(UiEvent.Navigate(Routes.PROFILE_SCREEN + "?uId=${_user.value.id}"))
            }
            is HomeEvent.OnPriorityExpendedChanged -> {
                _priorityExpanded.value = !_priorityExpanded.value
            }
            is HomeEvent.OnTicketCatExpendedChanged -> {
                _ticketExpanded.value = !_ticketExpanded.value
            }
            is HomeEvent.OnPriorityValueChanged -> {
                _priorityValue.value = event.value
                _priorityExpanded.value = false
            }
            is HomeEvent.OnTicketValueChanged -> {
                _ticketValue.value = event.value
                _ticketExpanded.value = false
            }
            is HomeEvent.OnTicketStatusValueChanged -> {
                _ticketStatusValue.value = event.value
                _ticketStatusExpanded.value = false
            }
            is HomeEvent.OnSubjectValueChanged -> {
                _subject.value = event.value
            }
            is HomeEvent.OnTextValueChanged -> {
                _textValue.value = event.value
            }
            is HomeEvent.OnToTextScreen -> {
                if (_priorityValue.value == null || _subject.value == "" || _ticketValue.value == null) {
                    if (_priorityValue.value == null)
                        _priorityEmptyError.value = true

                    if (_subject.value == "")
                        _subjectEmptyError.value = true

                    if (_ticketValue.value == null)
                        _ticketEmptyError.value = true
                } else
                    _location.value = "text"
            }
            is HomeEvent.OnToEnd -> {
                if (_textValue.value == "") {
                    _textEmptyError.value = true
                } else {
                    _location.value = "end"
                    sendNewTicket()
                }

            }
            is HomeEvent.OnCloseDialog -> {
                _newTicket.value = false
                viewModelScope.launch {
                    getTickets()
                }
            }
            is HomeEvent.OnTicketClick -> {
                sendUiEvent(UiEvent.Navigate(Routes.TICKET_SCREEN + "?tId=${event.tId},uId=${_user.value.id}"))
            }
            is HomeEvent.OnRefresh -> {
                viewModelScope.launch {
                    _isRefreshing.value = true

                    getTickets()

                    _isRefreshing.value = false
                }
            }
            else -> {}
        }
    }

    private fun sendNewTicket() {
        val priority = _priorityValue.value!!.id
        val category = _ticketValue.value!!.id

        val ticket = Ticket()
        ticket.creatorId = _user.value.id.toString()
        ticket.priority = priority
        ticket.title = _subject.value
        ticket.category = category
        ticket.status = "1"
        ticket.createDate = setTime()

        viewModelScope.launch(Dispatchers.IO) {

            val result =
                repository.newTicket(ticket = ticket, _user.value.id.toString(), _textValue.value)

            when (result) {
                is Resource.Success -> {
                    _sendResponse.value = true
                    Log.e(TAG, "added")
                }
                is Resource.Error -> {
                    _sendResponse.value = false
                    Log.e(TAG, result.message + " -- new ticket error")
                }
            }

        }

    }

    suspend fun setUser() {
        val id = savedStateHandle.get<String>("uId")
        Log.d(TAG, "uid -> $id")

        val result = repository.getUser(id!!)

        when (result) {
            is Resource.Success -> {
                if (result.data!!.status_code.equals("200")) {
                    _user.value = result.data.user!!
                } else {

                }
            }
            is Resource.Error -> {
                Log.d(TAG, "${result.message}")
            }
        }

    }

    suspend fun getTickets() {

        val result = repository.getTickets(_user.value.id!!)

        when (result) {
            is Resource.Error -> {
                Log.d(TAG, result.message!!)
                _inProgress.value = false
            }
            is Resource.Success -> {
                sortingByStatus(result.data!!.list)
//                _ticketList.value =
                Log.d(TAG, " --  list size -> ${_ticketList.value.size}")
                _inProgress.value = false
            }
        }

    }

    private fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    private fun setTime(): String {
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val formatted = current.format(formatter)
        return formatted
    }

    private fun initNewTicket() {
        _location.value = "start"
        _priorityValue.value = null
        _ticketValue.value = null
        _ticketExpanded.value = false
        _priorityExpanded.value = false
        _newTicket.value = true
        _subject.value = ""
        _textValue.value = ""
        _priorityEmptyError.value = false
        _subjectEmptyError.value = false
        _ticketEmptyError.value = false
        _textEmptyError.value = false
    }

    private fun sortingByStatus(myList: List<Ticket>) {
        val roles: HashMap<String, Int> = hashMapOf(
            "در حال بررسی" to 0,
            "بسته شده" to 1,
        )
        val comparator = Comparator { t1: Ticket, t2: Ticket ->
            return@Comparator roles[t1.status]!! - roles[t2.status]!!
        }
        val copy = arrayListOf<Ticket>().apply { addAll(myList) }
        copy.sortWith(comparator)
        _ticketList.value = copy
    }

}