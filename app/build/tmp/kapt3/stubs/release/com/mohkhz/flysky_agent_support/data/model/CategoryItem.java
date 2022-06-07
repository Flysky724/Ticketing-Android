package com.mohkhz.flysky_agent_support.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001b\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "", "id", "", "perName", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPerName", "setPerName", "PriorityCat", "TicketCat", "TicketStatusCat", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$PriorityCat;", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketStatusCat;", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketCat;", "app_release"})
public abstract class CategoryItem {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String perName;
    
    private CategoryItem(java.lang.String id, java.lang.String perName) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPerName() {
        return null;
    }
    
    public final void setPerName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$PriorityCat;", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "id", "", "perName", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"})
    public static final class PriorityCat extends com.mohkhz.flysky_agent_support.data.model.CategoryItem {
        
        public PriorityCat(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String perName) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketStatusCat;", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "id", "", "perName", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"})
    public static final class TicketStatusCat extends com.mohkhz.flysky_agent_support.data.model.CategoryItem {
        
        public TicketStatusCat(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String perName) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem$TicketCat;", "Lcom/mohkhz/flysky_agent_support/data/model/CategoryItem;", "id", "", "perName", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"})
    public static final class TicketCat extends com.mohkhz.flysky_agent_support.data.model.CategoryItem {
        
        public TicketCat(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String perName) {
            super(null, null);
        }
    }
}