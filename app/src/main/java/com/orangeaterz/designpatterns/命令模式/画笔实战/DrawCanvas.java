package com.orangeaterz.designpatterns.命令模式.画笔实战;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {
    public boolean isDrawing, isRunning; //标识是否可以绘制、绘制线程是否可以运行
    private Bitmap mBitmap; //绘制到的位图对象
    private DrawInvoker mInvoker; //绘制线程
    private DrawThread mThread; //绘制线程

    public DrawCanvas(Context context) {
        super(context);
        mInvoker = new DrawInvoker();
        mThread = new DrawThread();
        getHolder().addCallback(this);
    }

    /**
     * 增加一条绘制路径
     */
    public void add(DrawPath path) {
        mInvoker.add(path);
    }

    /**
     * 重做上一步撤销的绘制
     */
    public void redo() {
        isDrawing = true;
        mInvoker.redo();
    }

    /**
     * 撤销上一步绘制
     */
    public void undo() {
        isDrawing = true;
        mInvoker.undo();
    }

    /**
     * 是否可以撤销
     */
    public boolean canUndo() {
        return mInvoker.canUndo();
    }

    /**
     * 是否可以重做
     *
     * @return
     */
    public boolean canRedo() {
        return mInvoker.canRedo();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        mThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        isRunning = false;
        while (retry) {
            try {
                mThread.join();
                retry = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private class DrawThread extends Thread {
        @Override
        public void run() {
            Canvas canvas = null;
            while (isRunning) {
                if (isDrawing) {
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if (mBitmap == null) {
                            mBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }
                        Canvas c = new Canvas(mBitmap);
                        c.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        mInvoker.excute(c);
                        canvas.drawBitmap(mBitmap, 0, 0, null);

                    } finally {

                        getHolder().unlockCanvasAndPost(canvas);

                    }

                    isDrawing = false;
                }
            }
        }
    }
}
