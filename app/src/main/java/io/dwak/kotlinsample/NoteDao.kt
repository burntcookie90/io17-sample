package io.dwak.kotlinsample

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface NoteDao {
  @Query("SELECT * FROM note")
  fun allNotes(): LiveData<List<Note>>

  @Query("SELECT * FROM note WHERE id = :arg0")
  fun note(id: String): LiveData<Note>

  @Insert
  fun insertAll(vararg note: Note)

  @Delete
  fun delete(note: Note)
}