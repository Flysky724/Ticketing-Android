package com.mohkhz.flysky_agent.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R+\u0010%\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001e\u00a8\u0006/"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;)V", "_emptyFieldError", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_infoDialog", "_loginProgress", "_loginResult", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent;", "emptyFieldError", "Lkotlinx/coroutines/flow/StateFlow;", "getEmptyFieldError", "()Lkotlinx/coroutines/flow/StateFlow;", "infoDialog", "getInfoDialog", "loginProgress", "getLoginProgress", "loginResult", "getLoginResult", "<set-?>", "", "number", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "number$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "webSite", "getWebSite", "setWebSite", "webSite$delegate", "login", "", "onEvent", "event", "Lcom/mohkhz/flysky_agent/ui/login/LoginEvent;", "sendUiEvent", "app_release"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repository = null;
    private final kotlinx.coroutines.channels.Channel<com.mohkhz.flysky_agent_support.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState webSite$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState number$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _emptyFieldError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> emptyFieldError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loginProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loginProgress = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loginResult = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _infoDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> infoDialog = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.data.repo.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> getUiEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebSite() {
        return null;
    }
    
    private final void setWebSite(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    private final void setNumber(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getEmptyFieldError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoginProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getInfoDialog() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.login.LoginEvent event) {
    }
    
    private final void login() {
    }
    
    private final void sendUiEvent(com.mohkhz.flysky_agent_support.util.UiEvent event) {
    }
}