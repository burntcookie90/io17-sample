package io.dwak.kotlinsample.inject.module

import dagger.Binds
import dagger.Module
import io.dwak.kotlinsample.ui.NoteViewModel
import io.dwak.kotlinsample.ui.NoteViewModelImpl

@Module
abstract class ViewModelModule {
  @Binds abstract fun bindNoteViewModel(noteViewModelImpl: NoteViewModelImpl): NoteViewModel
}