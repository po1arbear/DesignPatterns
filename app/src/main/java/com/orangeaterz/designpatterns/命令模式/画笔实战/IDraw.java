package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.graphics.Canvas;

public interface IDraw {

    void draw(Canvas canvas);

    void undo();
}
