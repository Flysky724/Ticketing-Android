// Generated by Dagger (https://dagger.dev).
package com.mohkhz.flysky_agent.di;

import com.mohkhz.flysky_agent_support.data.model.Ticket;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTicketFactory implements Factory<Ticket> {
  @Override
  public Ticket get() {
    return provideTicket();
  }

  public static AppModule_ProvideTicketFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Ticket provideTicket() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTicket());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideTicketFactory INSTANCE = new AppModule_ProvideTicketFactory();
  }
}