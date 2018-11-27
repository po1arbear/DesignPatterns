package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.graphics.Path;

public class CircleBrush implements IBrush {
    @Override
    public void down(Path path, int x, int y) {

    }

    @Override
    public void move(Path path, int x, int y) {
        path.addCircle(x, y, 10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, int x, int y) {

    }
}
