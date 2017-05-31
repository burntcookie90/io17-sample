package io.dwak.kotlinsample.inject.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.dwak.kotlinsample.NoteApplication
import io.dwak.kotlinsample.inject.module.ActivityModule
import io.dwak.kotlinsample.inject.module.AppModule

@Component(modules = arrayOf(AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class))
interface AppComponent : AndroidInjector<NoteApplication> {
  @Component.Builder
  abstract class Builder: AndroidInjector.Builder<NoteApplication>()
}