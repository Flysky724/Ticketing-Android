package com.mohkhz.flysky_agent.ui.Ticket;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\fH\u0002J\u000e\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%J\b\u00105\u001a\u000201H\u0002J\u0011\u00106\u001a\u000201H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0019\u0010\"\u001a\u0002012\u0006\u00108\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u0011\u0010:\u001a\u000201H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0011\u0010/\u001a\u000201H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u000e\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=J\u0010\u0010>\u001a\u0002012\u0006\u00102\u001a\u00020\fH\u0002J\b\u0010?\u001a\u00020%H\u0002J\u0010\u0010@\u001a\u0002012\u0006\u00102\u001a\u00020\fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R+\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Ticket/TicketViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;Landroidx/lifecycle/SavedStateHandle;)V", "_inProgress", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_messageList", "", "Lcom/mohkhz/flysky_agent/data/model/Messages;", "_otherUser", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "_sendProgress", "_ticket", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "_user", "inProgress", "Lkotlinx/coroutines/flow/Flow;", "getInProgress", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "listTest", "getListTest", "()Ljava/util/List;", "setListTest", "(Ljava/util/List;)V", "listTest$delegate", "Landroidx/compose/runtime/MutableState;", "messageList", "getMessageList", "otherUser", "getOtherUser", "sendProgress", "getSendProgress", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text$delegate", "ticket", "getTicket", "user", "getUser", "addMessageToList", "", "messages", "calculateTime", "date", "closeTicket", "getMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTickets", "onEvent", "event", "Lcom/mohkhz/flysky_agent/ui/Ticket/TicketEvent;", "sendMessage", "setMessageTime", "updateMessage", "app_debug"})
public final class TicketViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mohkhz.flysky_agent.data.model.Messages>> _messageList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent.data.model.Messages>> messageList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listTest$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.User> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> user = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.User> _otherUser = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> otherUser = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.Ticket> _ticket = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.Ticket> ticket = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _inProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> inProgress = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _sendProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> sendProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState text$delegate = null;
    
    @javax.inject.Inject()
    public TicketViewModel(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.data.repo.Repository repository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.mohkhz.flysky_agent.data.model.Messages>> getMessageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mohkhz.flysky_agent.data.model.Messages> getListTest() {
        return null;
    }
    
    private final void setListTest(java.util.List<com.mohkhz.flysky_agent.data.model.Messages> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> getOtherUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.Ticket> getTicket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSendProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    private final void setText(java.lang.String p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.Ticket.TicketEvent event) {
    }
    
    private final java.lang.Object getUser(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getTickets(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getMessages(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void sendMessage(com.mohkhz.flysky_agent.data.model.Messages messages) {
    }
    
    private final void updateMessage(com.mohkhz.flysky_agent.data.model.Messages messages) {
    }
    
    private final void addMessageToList(com.mohkhz.flysky_agent.data.model.Messages messages) {
    }
    
    private final java.lang.Object getOtherUser(java.lang.String uId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    private final java.lang.String setMessageTime() {
        return null;
    }
    
    private final void closeTicket() {
    }
}