package io.dwak.kotlinsample.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM note")
    LiveData<List<Note>> allNotes();

    @Query("SELECT * FROM note WHERE id = :id")
    LiveData<Note> note(String id);

    @Insert
    void insertAll(Note... notes);

    @Update
    void update(Note... note);

    @Delete
    void delete(Note note);
}
