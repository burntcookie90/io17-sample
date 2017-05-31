package io.dwak.kotlinsample.data

import android.arch.lifecycle.LiveData
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import javax.inject.Inject

class NoteRepository @Inject constructor(val noteDao: NoteDao) : NoteRepo {
  override fun note(id: String): LiveData<Note> = noteDao.note(id)

  override fun allNotes(): LiveData<List<Note>> = noteDao.allNotes()

  override fun addNotes(vararg note: Note) {
    async(CommonPool) {
      noteDao.insertAll(*note)
    }
  }
}