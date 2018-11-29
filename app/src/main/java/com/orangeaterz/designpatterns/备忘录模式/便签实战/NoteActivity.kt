package com.orangeaterz.designpatterns.备忘录模式.便签实战

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.orangeaterz.designpatterns.R
import kotlinx.android.synthetic.main.activity_note.*

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        btn_save.setOnClickListener {
            val note = et.createNote()
            NoteCaretaker.getInstance().saveNote(note)
        }
        btn_pre.setOnClickListener {
            val preNote = NoteCaretaker.getInstance().preNote
            et.restore(preNote)
        }

        btn_next.setOnClickListener {
            val nextNote = NoteCaretaker.getInstance().nextNote
            et.restore(nextNote)
        }

    }
}