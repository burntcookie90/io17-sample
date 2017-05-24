package io.dwak.kotlinsample

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = arrayOf(ViewModelModule::class, RepoModule::class, DbModule::class))
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

  @Subcomponent.Builder
  public abstract class Builder : AndroidInjector.Builder<MainActivity>() {

  }
}