package io.dwak.kotlinsample

import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.dwak.kotlinsample.inject.component.DaggerAppComponent


class NoteApplication : DaggerApplication() {

  override fun onCreate() {
    super.onCreate()
    Stetho.initializeWithDefaults(this)
  }
  override fun applicationInjector(): AndroidInjector<out DaggerApplication>
    = DaggerAppComponent.builder().create(this)

}