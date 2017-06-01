package io.dwak.kotlinsample.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class NoteViewModelFactory
@Inject constructor(val viewmodelMap: @JvmSuppressWildcards Map<Class<*>, Provider<ViewModel>>)
  : ViewModelProvider.Factory {

  override fun <T : ViewModel> create(modelClass: Class<T>): T {
    return viewmodelMap.filter { it.key.isAssignableFrom(modelClass) }
        .values
        .firstOrNull()?.get() as T? ?: throw IllegalStateException("no viewmodel found")
  }
}