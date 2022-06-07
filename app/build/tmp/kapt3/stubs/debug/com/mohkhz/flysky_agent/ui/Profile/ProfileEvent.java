package com.mohkhz.flysky_agent.ui.Profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "", "()V", "OnBackClick", "OnEnterSiteClick", "OnLogOutClick", "OnNewAgentClick", "OnWhatsAppClick", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnWhatsAppClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnEnterSiteClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnNewAgentClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnLogOutClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnBackClick;", "app_debug"})
public abstract class ProfileEvent {
    
    private ProfileEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnWhatsAppClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnWhatsAppClick extends com.mohkhz.flysky_agent.ui.Profile.ProfileEvent {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Profile.ProfileEvent.OnWhatsAppClick copy(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OnWhatsAppClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnEnterSiteClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnEnterSiteClick extends com.mohkhz.flysky_agent.ui.Profile.ProfileEvent {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Profile.ProfileEvent.OnEnterSiteClick copy(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OnEnterSiteClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnNewAgentClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "()V", "app_debug"})
    public static final class OnNewAgentClick extends com.mohkhz.flysky_agent.ui.Profile.ProfileEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Profile.ProfileEvent.OnNewAgentClick INSTANCE = null;
        
        private OnNewAgentClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnLogOutClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "()V", "app_debug"})
    public static final class OnLogOutClick extends com.mohkhz.flysky_agent.ui.Profile.ProfileEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Profile.ProfileEvent.OnLogOutClick INSTANCE = null;
        
        private OnLogOutClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent$OnBackClick;", "Lcom/mohkhz/flysky_agent/ui/Profile/ProfileEvent;", "()V", "app_debug"})
    public static final class OnBackClick extends com.mohkhz.flysky_agent.ui.Profile.ProfileEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Profile.ProfileEvent.OnBackClick INSTANCE = null;
        
        private OnBackClick() {
            super();
        }
    }
}