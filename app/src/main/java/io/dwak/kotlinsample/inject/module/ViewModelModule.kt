package io.dwak.kotlinsample.inject.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import io.dwak.kotlinsample.ui.NoteViewModel
import io.dwak.kotlinsample.ui.NoteViewModelFactory
import io.dwak.kotlinsample.ui.NoteViewModelImpl

@Module
abstract class ViewModelModule {
  @Binds abstract fun bindFactory(noteViewModelFactory: NoteViewModelFactory): ViewModelProvider.Factory

  @IntoMap @ClassKey(NoteViewModel::class)
  @Binds abstract fun bindNoteViewModel(noteViewModelImpl: NoteViewModelImpl): ViewModel
}