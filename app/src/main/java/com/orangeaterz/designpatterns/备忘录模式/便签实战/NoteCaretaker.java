package com.orangeaterz.designpatterns.备忘录模式.便签实战;

import java.util.ArrayList;
import java.util.List;

public class NoteCaretaker {
    private static NoteCaretaker INSTANCE;

    public static final int MAX = 30;

    private List<Note> notes = new ArrayList<>(MAX);
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
        if (notes.size() >= MAX) {
            notes.remove(0);
        }
        notes.add(note);
    }

}
