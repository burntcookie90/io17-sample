package io.dwak.kotlinsample

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NoteApplication : Application(), HasActivityInjector {
  @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

  override fun onCreate() {
    super.onCreate()
  }

  override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector
}