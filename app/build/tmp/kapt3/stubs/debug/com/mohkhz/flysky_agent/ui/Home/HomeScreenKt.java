package com.mohkhz.flysky_agent.ui.Home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a2\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u001a\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u001a\u0016\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u001a&\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007\u001a@\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u001a\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0001H\u0007\u001a\u001a\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u0017H\u0007\u001a$\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u000fH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"TAG", "", "AppBar", "", "profileClick", "Lkotlin/Function0;", "notificationClick", "questionClick", "BottomSheet", "onClick", "FloatingButton", "HomeScreen", "viewModel", "Lcom/mohkhz/flysky_agent/ui/Home/HomeViewModel;", "onNavigate", "Lkotlin/Function1;", "Lcom/mohkhz/flysky_agent_support/util/UiEvent$Navigate;", "LazyList", "list", "", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "onRefresh", "isRefreshing", "", "StatusCard", "modifier", "Landroidx/compose/ui/Modifier;", "ticketStatus", "TagItem", "text", "isPriority", "TicketItem", "ticket", "app_debug"})
public final class HomeScreenKt {
    private static final java.lang.String TAG = "HomeScreen";
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.Home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mohkhz.flysky_agent_support.util.UiEvent.Navigate, kotlin.Unit> onNavigate) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void LazyList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mohkhz.flysky_agent_support.data.model.Ticket> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, boolean isRefreshing) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.ui.unit.ExperimentalUnitApi.class})
    public static final void BottomSheet(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AppBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> profileClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> notificationClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> questionClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FloatingButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TicketItem(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.Ticket ticket, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StatusCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketStatus) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TagItem(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean isPriority) {
    }
}