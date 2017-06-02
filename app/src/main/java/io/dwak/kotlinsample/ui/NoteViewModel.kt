package io.dwak.kotlinsample.ui

import android.arch.lifecycle.LiveData
import io.dwak.kotlinsample.data.Note

interface NoteViewModel {
  fun notes(): LiveData<List<Note>>
  fun addNote(title: String, contents: String)
  fun delete(note: Note)
}