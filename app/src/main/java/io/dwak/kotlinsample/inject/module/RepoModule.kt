package io.dwak.kotlinsample.inject.module

import dagger.Binds
import dagger.Module
import io.dwak.kotlinsample.data.NoteRepo
import io.dwak.kotlinsample.data.NoteRepository

@Module
abstract class RepoModule {
  @Binds abstract fun bindNoteRepo(noteRepository: NoteRepository): NoteRepo
}