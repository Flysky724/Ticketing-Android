package com.mohkhz.flysky_agent.ui.Home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010c\u001a\u00020dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020dH\u0002J\u000e\u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020iJ\b\u0010j\u001a\u00020dH\u0002J\u0010\u0010k\u001a\u00020d2\u0006\u0010h\u001a\u00020\'H\u0002J\b\u0010l\u001a\u00020\u000fH\u0002J\u0011\u0010m\u001a\u00020dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010eJ\u0016\u0010n\u001a\u00020d2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020!0\tH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0+\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\f0+\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f02\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\f0+\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0+\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001602\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0+\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0+\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f02\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00104R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00104R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f02\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00104R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0+\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010-R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f02\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00104R\u0019\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001602\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00104R\u0019\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001602\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00104R+\u0010X\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\'0+\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010-R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020)0+\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010-\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006p"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;Landroidx/lifecycle/SavedStateHandle;)V", "_category", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketCat;", "_inProgress", "", "_isRefreshing", "_location", "", "_newTicket", "_priorityCat", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$PriorityCat;", "_priorityEmptyError", "_priorityExpanded", "_priorityValue", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "_sendResponse", "_statusCat", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketStatusCat;", "_subject", "_subjectEmptyError", "_textEmptyError", "_textValue", "_ticketEmptyError", "_ticketExpanded", "_ticketList", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "_ticketStatusExpanded", "_ticketStatusValue", "_ticketValue", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent;", "_user", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "category", "Lkotlinx/coroutines/flow/Flow;", "getCategory", "()Lkotlinx/coroutines/flow/Flow;", "inProgress", "getInProgress", "isRefreshing", "location", "Lkotlinx/coroutines/flow/StateFlow;", "getLocation", "()Lkotlinx/coroutines/flow/StateFlow;", "newTicket", "getNewTicket", "priorityCat", "getPriorityCat", "priorityEmptyError", "getPriorityEmptyError", "priorityExpended", "getPriorityExpended", "priorityValue", "getPriorityValue", "sendResponse", "getSendResponse", "statusCat", "getStatusCat", "subject", "getSubject", "subjectEmptyError", "getSubjectEmptyError", "textEmptyError", "getTextEmptyError", "textValue", "getTextValue", "ticketEmptyError", "getTicketEmptyError", "ticketExpended", "getTicketExpended", "ticketList", "getTicketList", "ticketStatusExpended", "getTicketStatusExpended", "ticketStatusValue", "getTicketStatusValue", "ticketValue", "getTicketValue", "<set-?>", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "getUiEvent", "user", "getUser", "getTickets", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initNewTicket", "onEvent", "event", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "sendNewTicket", "sendUiEvent", "setTime", "setUser", "sortingByStatus", "myList", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.channels.Channel<com.mohkhz.flysky_agent_support.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> uiEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.User> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> user = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mohkhz.flysky_agent_support.data.model.Ticket>> _ticketList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.Ticket>> ticketList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _inProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> inProgress = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _newTicket = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> newTicket = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.PriorityCat>> _priorityCat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.PriorityCat>> priorityCat = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketStatusCat>> _statusCat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketStatusCat>> statusCat = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketCat>> _category = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketCat>> category = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _priorityExpanded = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> priorityExpended = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _ticketExpanded = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ticketExpended = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _ticketStatusExpanded = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ticketStatusExpended = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _priorityEmptyError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> priorityEmptyError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _subjectEmptyError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> subjectEmptyError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _ticketEmptyError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ticketEmptyError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _textEmptyError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> textEmptyError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> _priorityValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> priorityValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> _ticketValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> ticketValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> _ticketStatusValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> ticketStatusValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _subject = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> subject = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _textValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> textValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _sendResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> sendResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState title$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isRefreshing = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isRefreshing = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _location = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> location = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.data.repo.Repository repository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> getUiEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.Ticket>> getTicketList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getNewTicket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.PriorityCat>> getPriorityCat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketStatusCat>> getStatusCat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent_support.data.model.CategoryItem.TicketCat>> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPriorityExpended() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getTicketExpended() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getTicketStatusExpended() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPriorityEmptyError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getSubjectEmptyError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getTicketEmptyError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getTextEmptyError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> getPriorityValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> getTicketValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.mohkhz.flysky_agent_support.data.model.CategoryItem> getTicketStatusValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTextValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSendResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    private final void setTitle(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getLocation() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.Home.HomeEvent event) {
    }
    
    private final void sendNewTicket() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTickets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void sendUiEvent(com.mohkhz.flysky_agent_support.util.UiEvent event) {
    }
    
    private final java.lang.String setTime() {
        return null;
    }
    
    private final void initNewTicket() {
    }
    
    private final void sortingByStatus(java.util.List<com.mohkhz.flysky_agent_support.data.model.Ticket> myList) {
    }
}