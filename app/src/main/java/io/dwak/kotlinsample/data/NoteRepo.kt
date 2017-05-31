package io.dwak.kotlinsample.data

import android.arch.lifecycle.LiveData

interface NoteRepo {
  fun note(id: String): LiveData<Note>

  fun allNotes(): LiveData<List<Note>>

  fun addNotes(vararg note: Note)
}