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

  override fun update(note: Note) = noteRepo.update(note)

  override fun delete(note: Note) = noteRepo.delete(note)
}