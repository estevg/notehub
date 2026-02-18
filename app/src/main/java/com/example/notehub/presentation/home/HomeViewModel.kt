package com.example.notehub.presentation.home

import androidx.lifecycle.ViewModel
import com.example.notehub.domain.home.HomeRepoImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import androidx.lifecycle.liveData
import com.example.notehub.core.Resource
import com.example.notehub.data.model.Note
import com.example.notehub.data.model.NoteEntity
import com.example.notehub.data.model.toNoteEntity


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: HomeRepoImpl
) : ViewModel() {

    fun getAllNotes() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getAllNotes()))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }

    fun createNote(note: Note) = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.createNote(note.toNoteEntity())))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
}