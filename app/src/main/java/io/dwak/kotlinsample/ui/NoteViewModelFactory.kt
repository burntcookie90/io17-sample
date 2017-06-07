package io.dwak.kotlinsample.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class NoteViewModelFactory
@Inject constructor(val viewModelMap: @JvmSuppressWildcards Map<Class<*>, Provider<ViewModel>>)
  : ViewModelProvider.Factory {

  @Suppress("UNCHECKED_CAST")
  override fun <T : ViewModel> create(modelClass: Class<T>)
      = viewModelMap.filter { it.key.isAssignableFrom(modelClass) }
      .values
      .firstOrNull()?.get() as T?
      ?: throw IllegalStateException("no viewmodel found")
}