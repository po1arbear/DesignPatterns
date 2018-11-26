package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.graphics.Path;

public interface IBrush {

    void down(Path path, int x, int y);

    void move(Path path, int x, int y);

    void up(Path path, int x, int y);

}
