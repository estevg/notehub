package com.example.notehub.domain.home

import com.example.notehub.core.Resource
import com.example.notehub.data.local.LocalNoteDataSource
import com.example.notehub.data.model.NoteEntity
import com.example.notehub.data.model.NoteList
import javax.inject.Inject

class HomeRepoImpl @Inject constructor(private val dataSourceLocal: LocalNoteDataSource) :
    HomeRepo {
    override suspend fun getAllNotes(): NoteList = dataSourceLocal.getAllNotes()

    override suspend fun createNote(note: NoteEntity) = dataSourceLocal.saveNote(note)
}