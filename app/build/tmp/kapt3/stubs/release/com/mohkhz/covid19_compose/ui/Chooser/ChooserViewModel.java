package com.mohkhz.covid19_compose.ui.Chooser;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0011J\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020 H\u0002J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020\nH\u0002J\f\u0010\'\u001a\u00020\u0011*\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/mohkhz/covid19_compose/ui/Chooser/ChooserViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;)V", "_loginProgress", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent;", "loginProgress", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginProgress", "()Lkotlinx/coroutines/flow/StateFlow;", "phoneNumber", "Landroidx/lifecycle/MutableLiveData;", "", "getPhoneNumber", "()Landroidx/lifecycle/MutableLiveData;", "setPhoneNumber", "(Landroidx/lifecycle/MutableLiveData;)V", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "setUiEvent", "(Lkotlinx/coroutines/flow/Flow;)V", "website", "getWebsite", "setWebsite", "change", "", "getData", "login", "onEvent", "event", "Lcom/mohkhz/covid19_compose/ui/Chooser/ChooseEvent;", "sendUiEvent", "removeWhitespaces", "app_release"})
public final class ChooserViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repo = null;
    private final kotlinx.coroutines.channels.Channel<com.mohkhz.flysky_agent_support.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<? extends com.mohkhz.flysky_agent_support.util.UiEvent> uiEvent;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> website;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumber;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loginProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loginProgress = null;
    
    @javax.inject.Inject()
    public ChooserViewModel(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.data.repo.Repository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void setUiEvent(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends com.mohkhz.flysky_agent_support.util.UiEvent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getWebsite() {
        return null;
    }
    
    public final void setWebsite(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoginProgress() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.covid19_compose.ui.Chooser.ChooseEvent event) {
    }
    
    public final void change(@org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
    
    public final void getData() {
    }
    
    private final void login() {
    }
    
    private final void sendUiEvent(com.mohkhz.flysky_agent_support.util.UiEvent event) {
    }
    
    private final java.lang.String removeWhitespaces(java.lang.String $this$removeWhitespaces) {
        return null;
    }
}