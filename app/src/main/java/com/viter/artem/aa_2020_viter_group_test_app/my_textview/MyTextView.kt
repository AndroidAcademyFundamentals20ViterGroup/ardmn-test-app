package com.viter.artem.aa_2020_viter_group_test_app.my_textview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MyTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    var myTextViewCanvas: MyTextViewCanvas? = null

    override fun onDraw(canvas: Canvas) {
        if (myTextViewCanvas == null) {
            myTextViewCanvas = MyTextViewCanvas()
        }
        myTextViewCanvas?.parentCanvas = canvas
        myTextViewCanvas?.textPaint = paint
        super.onDraw(myTextViewCanvas)

        val paintRed = Paint()
        paintRed.color = Color.RED

        val paintBlue = Paint()
        paintBlue.color = Color.BLUE

        for (index in 0 until layout.lineCount) {
            val topPadding = if (index == 0) {
                -layout.topPadding
            } else {
                0
            }
            val bottomPadding = if (index == layout.lineCount - 1) {
                -layout.bottomPadding + 5
            } else {
                0
            }
            val y1 = (layout.getLineTop(index) + topPadding)
            val y2 = (layout.getLineBottom(index) - bottomPadding)

            canvas.drawLine(0f, y1.toFloat(), width.toFloat(), y1.toFloat(), paintBlue)
            canvas.drawLine(0f, y2.toFloat(), width.toFloat(), y2.toFloat(), paintBlue)

            canvas.drawLine(
                0f,
                layout.getLineBaseline(index).toFloat(),
                width.toFloat(),
                layout.getLineBaseline(index).toFloat(),
                paintRed
            )
        }
    }
}