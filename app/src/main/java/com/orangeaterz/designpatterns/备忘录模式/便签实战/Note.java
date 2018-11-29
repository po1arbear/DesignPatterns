package com.orangeaterz.designpatterns.备忘录模式.便签实战;

public class Note {
    public String mText;
    public int mCursor;

    public Note(String text, int cursor) {
        this.mText = text;
        this.mCursor = cursor;
    }

}
