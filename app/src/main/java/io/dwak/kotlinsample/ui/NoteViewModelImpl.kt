package io.dwak.kotlinsample.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import io.dwak.kotlinsample.data.Note
import io.dwak.kotlinsample.data.NoteRepo
import javax.inject.Inject

class NoteViewModelImpl @Inject constructor(val noteRepo: NoteRepo) : NoteViewModel, ViewModel() {
  override fun notes(): LiveData<List<Note>> = noteRepo.allNotes()

  override fun addNote(title: String, contents: String) {
    noteRepo.addNotes(Note(title = title, contents = contents))
  }
}