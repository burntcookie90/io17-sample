package io.dwak.kotlinsample.inject.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.dwak.kotlinsample.ui.MainActivity
import io.dwak.kotlinsample.inject.ActivityScope

@Module
abstract class ActivityModule {
  @ActivityScope
  @ContributesAndroidInjector(
      modules = arrayOf(DbModule::class, RepoModule::class, ViewModelModule::class))
  abstract fun contributeYourActivityInjector(): MainActivity
}