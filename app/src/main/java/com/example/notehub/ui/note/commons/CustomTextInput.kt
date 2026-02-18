package com.example.notehub.ui.note.commons

import android.content.Context
import android.graphics.Typeface
import android.text.Spannable
import android.text.style.StyleSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class CustomTextInput(
    context: Context, attrs: AttributeSet?
) : AppCompatEditText(context, attrs) {

    private var currentSelectionStart = 0
    private var currentSelectionEnd = 0


    override fun onSelectionChanged(selStart: Int, selEnd: Int) {
        super.onSelectionChanged(selStart, selEnd)
        if (selStart != selEnd) {
            currentSelectionStart = selStart
            currentSelectionEnd = selEnd
        } else {
            currentSelectionStart = 0
            currentSelectionEnd = 0
        }
    }



    fun applyItalicStyle() {
        if (currentSelectionStart != currentSelectionEnd) {
            text?.let {
                val existingSpans =
                    it.getSpans(
                        currentSelectionStart,
                        currentSelectionEnd,
                        StyleSpan::class.java
                    )

                var isAlreadyItalic = false

                if (existingSpans != null) {
                    for (span in existingSpans) {
                        if (span.style == Typeface.ITALIC) {
                            isAlreadyItalic = true
                            it.removeSpan(span)

                        }
                    }
                }

                if (!isAlreadyItalic) {
                    it.setSpan(
                        StyleSpan(Typeface.ITALIC),
                        currentSelectionStart,
                        currentSelectionEnd,
                        Spannable.SPAN_INCLUSIVE_INCLUSIVE
                    )
                }
            }

        }
    }

    fun applyBoldStyle() {
        if (currentSelectionStart != currentSelectionEnd) {
            text?.let {

                val existingSpans =
                    it.getSpans(
                        currentSelectionStart,
                        currentSelectionEnd,
                        StyleSpan(Typeface.BOLD)::class.java
                    )


                var isAlreadyBold = false

                if (existingSpans != null) {
                    for (span in existingSpans) {
                        if (span.style == Typeface.BOLD) {
                            isAlreadyBold = true
                            it.removeSpan(span)
                        }
                    }
                }


                if (!isAlreadyBold) {
                    it.setSpan(
                        StyleSpan(Typeface.BOLD),
                        currentSelectionStart,
                        currentSelectionEnd,
                        Spannable.SPAN_INCLUSIVE_INCLUSIVE
                    )
                }
            }
        }
    }


}