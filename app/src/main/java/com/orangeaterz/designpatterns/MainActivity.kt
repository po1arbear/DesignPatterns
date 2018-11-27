package com.orangeaterz.designpatterns

import android.graphics.Paint
import android.graphics.Path
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.orangeaterz.designpatterns.命令模式.画笔实战.DrawPath
import com.orangeaterz.designpatterns.命令模式.画笔实战.IBrush
import com.orangeaterz.designpatterns.命令模式.画笔实战.NormalBrush
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mPath: DrawPath? = null
    private var mPaint: Paint? = null
    private var mBrush: IBrush? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPaint = Paint()
        mPaint?.color = 0xFFFFFF
        mPaint?.strokeWidth = 3f
        mBrush = NormalBrush()
        draw_canvas.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    mPath = DrawPath()
                    mPath?.paint = mPaint
                    mPath?.path = Path()
                    mBrush?.down(mPath?.path, event.x, event.y)
                }

                MotionEvent.ACTION_MOVE -> {
                    mBrush?.move(mPath?.path, event.x, event.y)
                }
                MotionEvent.ACTION_UP -> {
                    mBrush?.up(mPath?.path, event.x, event.y)
                    draw_canvas.add(mPath)
                    draw_canvas.isDrawing = true
                }

                else -> {

                }
            }

            true
        }

    }

}
