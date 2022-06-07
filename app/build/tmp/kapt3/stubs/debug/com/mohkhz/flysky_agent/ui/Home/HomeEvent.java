package com.mohkhz.flysky_agent.ui.Home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u00a8\u0006#"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "", "()V", "OnCloseDialog", "OnInfoClick", "OnNewTicketClick", "OnNotification", "OnPriorityExpendedChanged", "OnPriorityValueChanged", "OnProfileClick", "OnRefresh", "OnSubjectValueChanged", "OnTextValueChanged", "OnTicketCatExpendedChanged", "OnTicketClick", "OnTicketStatusValueChanged", "OnTicketValueChanged", "OnToEnd", "OnToTextScreen", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnNewTicketClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnProfileClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnNotification;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnInfoClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnToTextScreen;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnToEnd;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnCloseDialog;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnPriorityExpendedChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketCatExpendedChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnPriorityValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketStatusValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnSubjectValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTextValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnRefresh;", "app_debug"})
public abstract class HomeEvent {
    
    private HomeEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnNewTicketClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnNewTicketClick extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnNewTicketClick INSTANCE = null;
        
        private OnNewTicketClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnProfileClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnProfileClick extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnProfileClick INSTANCE = null;
        
        private OnProfileClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnNotification;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnNotification extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnNotification INSTANCE = null;
        
        private OnNotification() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnInfoClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnInfoClick extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnInfoClick INSTANCE = null;
        
        private OnInfoClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnToTextScreen;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnToTextScreen extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnToTextScreen INSTANCE = null;
        
        private OnToTextScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnToEnd;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnToEnd extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnToEnd INSTANCE = null;
        
        private OnToEnd() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnCloseDialog;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnCloseDialog extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnCloseDialog INSTANCE = null;
        
        private OnCloseDialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnPriorityExpendedChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnPriorityExpendedChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnPriorityExpendedChanged INSTANCE = null;
        
        private OnPriorityExpendedChanged() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketCatExpendedChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnTicketCatExpendedChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnTicketCatExpendedChanged INSTANCE = null;
        
        private OnTicketCatExpendedChanged() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnPriorityValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "value", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "(Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;)V", "getValue", "()Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnPriorityValueChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.Nullable()
        private final com.mohkhz.flysky_agent_support.data.model.CategoryItem value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnPriorityValueChanged copy(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
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
        
        public OnPriorityValueChanged(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "value", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "(Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;)V", "getValue", "()Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnTicketValueChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.Nullable()
        private final com.mohkhz.flysky_agent_support.data.model.CategoryItem value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnTicketValueChanged copy(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
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
        
        public OnTicketValueChanged(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketStatusValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "value", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "(Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;)V", "getValue", "()Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnTicketStatusValueChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.Nullable()
        private final com.mohkhz.flysky_agent_support.data.model.CategoryItem value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnTicketStatusValueChanged copy(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
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
        
        public OnTicketStatusValueChanged(@org.jetbrains.annotations.Nullable()
        com.mohkhz.flysky_agent_support.data.model.CategoryItem value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mohkhz.flysky_agent_support.data.model.CategoryItem getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnSubjectValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnSubjectValueChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnSubjectValueChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
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
        
        public OnSubjectValueChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTextValueChanged;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnTextValueChanged extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnTextValueChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
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
        
        public OnTextValueChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnTicketClick;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "tId", "", "(Ljava/lang/String;)V", "getTId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnTicketClick extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnTicketClick copy(@org.jetbrains.annotations.NotNull()
        java.lang.String tId) {
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
        
        public OnTicketClick(@org.jetbrains.annotations.NotNull()
        java.lang.String tId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTId() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent$OnRefresh;", "Lcom/mohkhz/flysky_agent/ui/Home/HomeEvent;", "()V", "app_debug"})
    public static final class OnRefresh extends com.mohkhz.flysky_agent.ui.Home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mohkhz.flysky_agent.ui.Home.HomeEvent.OnRefresh INSTANCE = null;
        
        private OnRefresh() {
            super();
        }
    }
}