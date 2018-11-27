package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.graphics.Path;

public interface IBrush {

    void down(Path path, float x, float y);

    void move(Path path, float x, float y);

    void up(Path path, float x, float y);

}
