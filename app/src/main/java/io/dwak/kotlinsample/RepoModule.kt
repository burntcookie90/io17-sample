package io.dwak.kotlinsample

import dagger.Binds
import dagger.Module

@Module
abstract class RepoModule {
  @Binds abstract fun bindNoteRepo(noteRepository: NoteRepository): NoteRepo
}