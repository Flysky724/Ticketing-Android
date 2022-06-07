package com.mohkhz.flysky_agent.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a[\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a@\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007\u001a \u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a&\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001f"}, d2 = {"CustomButton", "", "onClick", "Lkotlin/Function0;", "text", "", "fontSize", "Landroidx/compose/ui/unit/Dp;", "roundedCornerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "modifier", "Landroidx/compose/ui/Modifier;", "inProgress", "", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "CustomButton-942rkJo", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;FLandroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;)V", "CustomTextField", "title", "isError", "placeholder", "onValueChange", "Lkotlin/Function1;", "value", "Error", "LoginScreen", "viewModel", "Lcom/mohkhz/flysky_agent/ui/login/LoginViewModel;", "onNavigate", "Lcom/mohkhz/flysky_agent_support/util/UiEvent$Navigate;", "app_debug"})
public final class LoginScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.ui.login.LoginViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mohkhz.flysky_agent_support.util.UiEvent.Navigate, kotlin.Unit> onNavigate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Error(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean isError, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CustomTextField(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isError, @org.jetbrains.annotations.NotNull()
    java.lang.String placeholder, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
}