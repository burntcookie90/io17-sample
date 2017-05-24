package io.dwak.kotlinsample

import android.arch.lifecycle.LiveData

interface NoteRepo {
  fun note(id: String): LiveData<Note>

  fun allNotes(): LiveData<List<Note>>

  fun addNotes(vararg note: Note)
}