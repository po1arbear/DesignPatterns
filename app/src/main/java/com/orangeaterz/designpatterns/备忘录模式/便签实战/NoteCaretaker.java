package com.orangeaterz.designpatterns.备忘录模式.便签实战;

import java.util.ArrayList;
import java.util.List;

public class NoteCaretaker {
    private static NoteCaretaker INSTANCE;

    public static final int MAX = 30;

    private List<Note> mNotes = new ArrayList<>(MAX);
    private int mIndex;

    public static NoteCaretaker getInstance() {
        if (INSTANCE == null) {
            synchronized (NoteCaretaker.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NoteCaretaker();
                }
            }
        }
        return INSTANCE;
    }

    public void saveNote(Note note) {
        if (mNotes.size() >= MAX) {
            mNotes.remove(0);
        }
        mNotes.add(note);
        mIndex = mNotes.size() - 1;
    }

    public Note getPreNote() {
        if (mIndex > 0) {
            mIndex--;
        }
        return mNotes.get(mIndex);
    }

    public Note getNextNote() {
        if (mIndex < mNotes.size() - 1) {
            mIndex++;
        }
        return mNotes.get(mIndex);
    }

}
