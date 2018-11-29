package com.orangeaterz.designpatterns.备忘录模式.便签实战

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import android.widget.TextView

class NoteEditText : EditText {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun createNote(): Note {
        val text = text
        val cursor = selectionStart
        return Note(text.toString(), cursor)
    }

    fun restore(note: Note) {
        setText(note.mText, TextView.BufferType.EDITABLE)
        setSelection(note.mCursor)
    }
}