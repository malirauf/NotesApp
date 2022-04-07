package com.dev.notesapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dev.notesapp.theme.*
import java.sql.Timestamp
import java.util.*

@Entity
data class Note(
    val title: String,
    val description: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey
    val id: Int? = null
) {
    companion object {
        val colors = listOf(orange, blue, green, pink, lightBlue)
    }
}
