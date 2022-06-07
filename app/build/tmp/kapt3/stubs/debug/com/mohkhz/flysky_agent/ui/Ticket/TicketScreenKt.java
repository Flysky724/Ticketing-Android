package com.mohkhz.flysky_agent.ui.Ticket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007\u001a4\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a8\u0006\u0014"}, d2 = {"AppBar", "", "backClick", "Lkotlin/Function0;", "user", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "OwnerMessage", "text", "", "inProgress", "", "time", "ReceivedMessage", "TicketScreen", "viewModel", "Lcom/mohkhz/flysky_agent/ui/Ticket/TicketViewModel;", "onNavigate", "Lkotlin/Function1;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent$Navigate;", "onBack", "app_debug"})
public final class TicketScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void TicketScreen(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.Ticket.TicketViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mohkhz.flysky_agent_support.util.UiEvent.Navigate, kotlin.Unit> onNavigate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBack) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AppBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> backClick, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.User user) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void OwnerMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean inProgress, @org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void ReceivedMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
}