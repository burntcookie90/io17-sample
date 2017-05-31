package io.dwak.kotlinsample.ui

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity(), HasFragmentInjector, HasSupportFragmentInjector,
    LifecycleRegistryOwner
{
  @Inject lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>
  @Inject lateinit var frameworkFragmentInjector: DispatchingAndroidInjector<android.app.Fragment>
  @Suppress("LeakingThis") private val lifecycle = LifecycleRegistry(this)

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
  }

  override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment> = supportFragmentInjector
  override fun fragmentInjector(): AndroidInjector<android.app.Fragment> = frameworkFragmentInjector
  override fun getLifecycle(): LifecycleRegistry = lifecycle

}