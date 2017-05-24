package io.dwak.kotlinsample

import android.arch.lifecycle.LiveData
import javax.inject.Inject

class NoteRepository @Inject constructor(val noteDao: NoteDao) : NoteRepo {
  override fun note(id: String): LiveData<Note> = noteDao.note(id)

  override fun allNotes(): LiveData<List<Note>> = noteDao.allNotes()

  override fun addNotes(vararg note: Note) = noteDao.insertAll(*note)
}