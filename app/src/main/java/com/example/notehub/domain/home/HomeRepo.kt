package com.example.notehub.domain.home

import com.example.notehub.data.model.NoteEntity
import com.example.notehub.data.model.NoteList

interface HomeRepo {
    suspend fun getAllNotes(): NoteList
    suspend fun createNote(note: NoteEntity)
}