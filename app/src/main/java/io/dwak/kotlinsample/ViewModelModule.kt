package io.dwak.kotlinsample

import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
  @Binds abstract fun bindNoteViewModel(noteViewModelImpl: NoteViewModelImpl): NoteViewModel
}