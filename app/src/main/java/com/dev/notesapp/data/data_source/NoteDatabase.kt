package com.dev.notesapp.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev.notesapp.domain.model.Note

@Database(version = NoteDatabase.DB_VERSION, entities = [Note::class])
abstract class NoteDatabase : RoomDatabase() {

    abstract fun getNoteDao() : NoteDao

    companion object{
        const val DB_VERSION = 1
        const val DB_NAME = "notes_db"
    }
}