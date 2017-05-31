package io.dwak.kotlinsample

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.dwak.kotlinsample.inject.component.DaggerAppComponent


class NoteApplication : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication>
    = DaggerAppComponent.builder().create(this)

}