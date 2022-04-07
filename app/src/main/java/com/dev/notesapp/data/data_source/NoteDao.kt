package com.dev.notesapp.data.data_source

import androidx.room.*
import com.dev.notesapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("Select * FROM note")
    fun getAllNotes(): Flow<List<Note>>

    @Query("Select * FROM note WHERE id= :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    @Delete
    suspend fun deleteNote(Note: Note)

}
