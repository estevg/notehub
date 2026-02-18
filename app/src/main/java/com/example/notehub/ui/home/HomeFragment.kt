package com.example.notehub.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.notehub.R
import com.example.notehub.core.Resource
import com.example.notehub.data.model.Note
import com.example.notehub.presentation.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {


    private val viewModel by viewModels<HomeViewModel>()



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.createNote(Note(0, "Hola esteban", "Hiii", "20203"))
            .observe(viewLifecycleOwner, Observer { result ->
                when (result) {
                    is Resource.Loading -> {
                        Log.d("HOLAAAA", "Loading")

                    }
                    is Resource.Success -> {
                        Log.d("HOLAAAA", "se guardo")
                    }

                    is Resource.Failure -> {
                        Log.d("HOLAAAA", "Fallo")

                    }
                }
            })
    }


}