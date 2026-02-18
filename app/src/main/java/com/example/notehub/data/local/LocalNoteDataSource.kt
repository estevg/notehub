package com.example.notehub.data.local

import com.example.notehub.data.model.NoteEntity
import com.example.notehub.data.model.NoteList
import com.example.notehub.data.model.toNoteList
import javax.inject.Inject


class LocalNoteDataSource @Inject constructor(private val dao: NoteDao) {

    suspend fun getAllNotes(): NoteList = dao.getAllNotes().toNoteList()

    suspend fun saveNote(note: NoteEntity) = dao.saveNote(note)
}