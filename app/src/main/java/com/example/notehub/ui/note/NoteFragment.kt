package com.example.notehub.ui.note

import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.notehub.R
import com.example.notehub.databinding.FragmentNoteBinding
import com.google.android.material.textfield.TextInputEditText


class NoteFragment : Fragment(R.layout.fragment_note) {

    private lateinit var binding: FragmentNoteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNoteBinding.bind(view)
        val editText = binding.TextInputEditText


        binding.cursiva.setOnClickListener {
            editText.applyItalicStyle()
        }

        binding.negrita.setOnClickListener {
            editText.applyBoldStyle()
        }

    }






}