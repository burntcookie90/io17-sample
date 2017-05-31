package io.dwak.kotlinsample.inject.module

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import io.dwak.kotlinsample.data.NoteDao
import io.dwak.kotlinsample.data.NoteDatabase
import io.dwak.kotlinsample.inject.ActivityScope

@Module
class DbModule {
  @Provides @ActivityScope
  fun providesNoteDatabase(context: Context): NoteDatabase
      = Room.databaseBuilder(context, NoteDatabase::class.java, "note-db").build()

  @Provides @ActivityScope
  fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao = noteDatabase.noteDao()
}