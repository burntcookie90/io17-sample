package io.dwak.kotlinsample.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo


@Entity(tableName = "note")
data class Note(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                @ColumnInfo(name = "title") var title: String,
                @ColumnInfo(name = "contents") var contents: String)
