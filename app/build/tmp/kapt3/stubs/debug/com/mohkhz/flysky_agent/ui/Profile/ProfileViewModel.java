package com.mohkhz.flysky_agent.ui.Profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010\'\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020 H\u0002J\u000e\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/mohkhz/covid19_compose/data/repo/Repository;Landroidx/lifecycle/SavedStateHandle;)V", "_inProgress", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent;", "_user", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "_userName", "", "", "_website", "inProgress", "Lkotlinx/coroutines/flow/Flow;", "getInProgress", "()Lkotlinx/coroutines/flow/Flow;", "uiEvent", "getUiEvent", "user", "getUser", "userName", "getUserName", "website", "getWebsite", "onEvent", "", "event", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "openLink", "context", "Landroid/content/Context;", "openWhatsApp", "sendUiEvent", "setUser", "setWebsite", "address", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.mohkhz.covid19_compose.data.repo.Repository repository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.channels.Channel<com.mohkhz.flysky_agent_support.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.util.UiEvent> uiEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mohkhz.flysky_agent_support.data.model.User> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.mohkhz.flysky_agent_support.data.model.User> user = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _website = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> website = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String[]> _userName = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String[]> userName = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _inProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> inProgress = null;
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
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
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String[]> getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getInProgress() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.Profile.ProfileEvent event) {
    }
    
    private final void setUser() {
    }
    
    private final void sendUiEvent(com.mohkhz.flysky_agent_support.util.UiEvent event) {
    }
    
    private final void openLink(android.content.Context context) {
    }
    
    private final void openWhatsApp(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setWebsite(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
}