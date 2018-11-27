package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.graphics.Path;

public class NormalBrush implements IBrush {
    @Override
    public void down(Path path, int x, int y) {
        path.moveTo(x, y);
    }

    @Override
    public void move(Path path, int x, int y) {
        path.lineTo(x, y);
    }

    @Override
    public void up(Path path, int x, int y) {

    }
}
