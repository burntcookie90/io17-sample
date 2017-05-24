package io.dwak.kotlinsample

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {
  @Provides
  fun providesNoteDatabase(context: Context): NoteDatabase
      = Room.databaseBuilder(context, NoteDatabase::class.java, "note-db").build()

  @Provides
  fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao = noteDatabase.noteDao()
}