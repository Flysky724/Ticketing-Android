package com.mohkhz.flysky_agent.ui.NewAgent;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010&\u001a\u00020\'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\'0)H\u0002J\u000e\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020\'2\u0006\u0010+\u001a\u00020\nH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R+\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000eR+\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015\u00a8\u0006."}, d2 = {"Lcom/mohkhz/flysky_agent/ui/NewAgent/NewAgentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;)V", "_emptyError", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent;", "emptyError", "Lkotlinx/coroutines/flow/Flow;", "getEmptyError", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "", "firstName", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "firstName$delegate", "Landroidx/compose/runtime/MutableState;", "lastName", "getLastName", "setLastName", "lastName$delegate", "phone", "getPhone", "setPhone", "phone$delegate", "uiEvent", "getUiEvent", "website", "getWebsite", "setWebsite", "website$delegate", "newAgent", "", "back", "Lkotlin/Function0;", "onEvent", "event", "Lcom/mohkhz/flysky_agent/ui/NewAgent/NewAgentEvent;", "sendUiEvent", "app_debug"})
public final class NewAgentViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repository = null;
    private final kotlinx.coroutines.channels.Channel<com.mohkhz.flysky_agent_support.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState firstName$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState lastName$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState phone$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState website$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _emptyError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> emptyError = null;
    
    @javax.inject.Inject()
    public NewAgentViewModel(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.data.repo.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> getUiEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    private final void setFirstName(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    private final void setLastName(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    private final void setPhone(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebsite() {
        return null;
    }
    
    private final void setWebsite(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getEmptyError() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.NewAgent.NewAgentEvent event) {
    }
    
    private final void newAgent(kotlin.jvm.functions.Function0<kotlin.Unit> back) {
    }
    
    private final void sendUiEvent(com.mohkhz.flysky_agent_support.util.UiEvent event) {
    }
}