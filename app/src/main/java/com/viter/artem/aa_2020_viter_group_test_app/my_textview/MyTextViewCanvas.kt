package com.viter.artem.aa_2020_viter_group_test_app.my_textview

import android.graphics.*
import android.graphics.text.MeasuredText
import android.os.Build
import android.text.TextPaint
import androidx.annotation.RequiresApi

class MyTextViewCanvas() : Canvas() {

    var parentCanvas: Canvas? = null
    var textPaint: TextPaint? = null

    override fun drawText(
        text: CharSequence,
        start: Int,
        end: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        if (parentCanvas != null) {

            val rectText = Rect()
            textPaint?.getTextBounds(text.toString(), start, end, rectText)
            rectText.top += y.toInt()
            rectText.bottom += y.toInt()

            paint.shader = LinearGradient(
                rectText.left.toFloat(),
                rectText.top.toFloat(),
                rectText.left.toFloat(),
                rectText.bottom.toFloat(),
                Color.RED,
                Color.BLUE,
                Shader.TileMode.REPEAT
            )
            parentCanvas?.drawRect(rectText, Paint().apply { style = Paint.Style.STROKE })

            parentCanvas?.drawText(text, start, end, x, y, paint)
        } else {
            super.drawText(
                text,
                start,
                end,
                x,
                y,
                paint
            )
        }
    }

    override fun isHardwareAccelerated(): Boolean {
        return if (parentCanvas != null) {
            parentCanvas!!.isHardwareAccelerated()
        } else {
            super.isHardwareAccelerated()
        }
    }

    override fun setBitmap(bitmap: Bitmap?) {
        if (parentCanvas != null) {
            parentCanvas!!.setBitmap(bitmap)
        } else {
            super.isHardwareAccelerated()
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun enableZ() {
        if (parentCanvas != null) {
            parentCanvas!!.enableZ()
        } else {
            super.enableZ()
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun disableZ() {
        if (parentCanvas != null) {
            parentCanvas!!.disableZ()
        } else {
            super.disableZ()
        }
    }

    override fun isOpaque(): Boolean {
        return if (parentCanvas != null) {
            parentCanvas!!.isOpaque()
        } else {
            super.isOpaque()
        }
    }

    override fun getWidth(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getWidth()
        } else {
            super.getWidth()
        }
    }

    override fun getHeight(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getHeight()
        } else {
            super.getHeight()
        }
    }

    override fun getDensity(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getDensity()
        } else {
            super.getDensity()
        }
    }

    override fun setDensity(density: Int) {
        return if (parentCanvas != null) {
            parentCanvas!!.setDensity(density)
        } else {
            super.setDensity(density)
        }
    }

    override fun getMaximumBitmapWidth(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getMaximumBitmapWidth()
        } else {
            super.getMaximumBitmapWidth()
        }
    }

    override fun getMaximumBitmapHeight(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getMaximumBitmapHeight()
        } else {
            super.getMaximumBitmapHeight()
        }
    }

    override fun save(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.save()
        } else {
            super.save()
        }
    }

    override fun saveLayer(bounds: RectF?, paint: Paint?, saveFlags: Int): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayer(bounds, paint, saveFlags)
        } else {
            super.saveLayer(bounds, paint, saveFlags)
        }
    }

    override fun saveLayer(bounds: RectF?, paint: Paint?): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayer(bounds, paint)
        } else {
            super.saveLayer(bounds, paint)
        }
    }

    override fun saveLayer(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        paint: Paint?,
        saveFlags: Int
    ): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayer(left, top, right, bottom, paint, saveFlags)
        } else {
            super.saveLayer(left, top, right, bottom, paint, saveFlags)
        }
    }

    override fun saveLayer(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        paint: Paint?
    ): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayer(left, top, right, bottom, paint)
        } else {
            super.saveLayer(left, top, right, bottom, paint)
        }
    }

    override fun saveLayerAlpha(bounds: RectF?, alpha: Int, saveFlags: Int): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayerAlpha(bounds, alpha, saveFlags)
        } else {
            super.saveLayerAlpha(bounds, alpha, saveFlags)
        }
    }

    override fun saveLayerAlpha(bounds: RectF?, alpha: Int): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayerAlpha(bounds, alpha)
        } else {
            super.saveLayerAlpha(bounds, alpha)
        }
    }

    override fun saveLayerAlpha(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        alpha: Int,
        saveFlags: Int
    ): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayerAlpha(left, top, right, bottom, alpha, saveFlags)
        } else {
            super.saveLayerAlpha(left, top, right, bottom, alpha, saveFlags)
        }
    }

    override fun saveLayerAlpha(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        alpha: Int
    ): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.saveLayerAlpha(left, top, right, bottom, alpha)
        } else {
            super.saveLayerAlpha(left, top, right, bottom, alpha)
        }
    }

    override fun restore() {
        if (parentCanvas != null) {
            parentCanvas!!.restore()
        } else {
            super.restore()
        }
    }

    override fun getSaveCount(): Int {
        return if (parentCanvas != null) {
            parentCanvas!!.getSaveCount()
        } else {
            super.getSaveCount()
        }
    }

    override fun restoreToCount(saveCount: Int) {
        if (parentCanvas != null) {
            parentCanvas!!.restoreToCount(saveCount)
        } else {
            super.restoreToCount(saveCount)
        }
    }

    override fun translate(dx: Float, dy: Float) {
        if (parentCanvas != null) {
            parentCanvas!!.translate(dx, dy)
        } else {
            super.translate(dx, dy)
        }
    }

    override fun scale(sx: Float, sy: Float) {
        if (parentCanvas != null) {
            parentCanvas!!.scale(sx, sy)
        } else {
            super.scale(sx, sy)
        }
    }

    override fun rotate(degrees: Float) {
        if (parentCanvas != null) {
            parentCanvas!!.rotate(degrees)
        } else {
            super.rotate(degrees)
        }
    }

    override fun skew(sx: Float, sy: Float) {
        if (parentCanvas != null) {
            parentCanvas!!.skew(sx, sy)
        } else {
            super.skew(sx, sy)
        }
    }

    override fun concat(matrix: Matrix?) {
        parentCanvas!!.concat(matrix)
    }

    override fun setMatrix(matrix: Matrix?) {
        parentCanvas!!.setMatrix(matrix)
    }

    override fun getMatrix(ctm: Matrix) {
        parentCanvas!!.getMatrix(ctm)
    }

    override fun clipRect(rect: RectF, op: Region.Op): Boolean {
        return parentCanvas!!.clipRect(rect, op)
    }

    override fun clipRect(rect: Rect, op: Region.Op): Boolean {
        return parentCanvas!!.clipRect(rect, op)
    }

    override fun clipRect(rect: RectF): Boolean {
        return parentCanvas!!.clipRect(rect)
    }

    override fun clipRect(rect: Rect): Boolean {
        return parentCanvas!!.clipRect(rect)
    }

    override fun clipRect(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        op: Region.Op
    ): Boolean {
        return parentCanvas!!.clipRect(left, top, right, bottom, op)
    }

    override fun clipRect(left: Float, top: Float, right: Float, bottom: Float): Boolean {
        return parentCanvas!!.clipRect(left, top, right, bottom)
    }

    override fun clipRect(left: Int, top: Int, right: Int, bottom: Int): Boolean {
        return parentCanvas!!.clipRect(left, top, right, bottom)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun clipOutRect(rect: RectF): Boolean {
        return parentCanvas!!.clipOutRect(rect)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun clipOutRect(rect: Rect): Boolean {
        return parentCanvas!!.clipOutRect(rect)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun clipOutRect(left: Float, top: Float, right: Float, bottom: Float): Boolean {
        return parentCanvas!!.clipOutRect(left, top, right, bottom)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun clipOutRect(left: Int, top: Int, right: Int, bottom: Int): Boolean {
        return parentCanvas!!.clipOutRect(left, top, right, bottom)
    }

    override fun clipPath(path: Path, op: Region.Op): Boolean {
        return parentCanvas!!.clipPath(path, op)
    }

    override fun clipPath(path: Path): Boolean {
        return parentCanvas!!.clipPath(path)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun clipOutPath(path: Path): Boolean {
        return parentCanvas!!.clipOutPath(path)
    }

    override fun getDrawFilter(): DrawFilter? {
        return parentCanvas!!.getDrawFilter()
    }

    override fun setDrawFilter(filter: DrawFilter?) {
        parentCanvas!!.setDrawFilter(filter)
    }

    override fun quickReject(rect: RectF, type: EdgeType): Boolean {
        return parentCanvas!!.quickReject(rect, type)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun quickReject(rect: RectF): Boolean {
        return parentCanvas!!.quickReject(rect)
    }

    override fun quickReject(path: Path, type: EdgeType): Boolean {
        return parentCanvas!!.quickReject(path, type)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun quickReject(path: Path): Boolean {
        return parentCanvas!!.quickReject(path)
    }

    override fun quickReject(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        type: EdgeType
    ): Boolean {
        return parentCanvas!!.quickReject(left, top, right, bottom, type)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun quickReject(left: Float, top: Float, right: Float, bottom: Float): Boolean {
        return parentCanvas!!.quickReject(left, top, right, bottom)
    }

    override fun getClipBounds(bounds: Rect?): Boolean {
        return parentCanvas!!.getClipBounds(bounds)
    }

    override fun drawPicture(picture: Picture) {
        parentCanvas!!.drawPicture(picture)
    }

    override fun drawPicture(picture: Picture, dst: RectF) {
        parentCanvas!!.drawPicture(picture, dst)
    }

    override fun drawPicture(picture: Picture, dst: Rect) {
        parentCanvas!!.drawPicture(picture, dst)
    }

    override fun drawArc(
        oval: RectF,
        startAngle: Float,
        sweepAngle: Float,
        useCenter: Boolean,
        paint: Paint
    ) {
        parentCanvas!!.drawArc(oval, startAngle, sweepAngle, useCenter, paint)
    }

    override fun drawArc(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        startAngle: Float,
        sweepAngle: Float,
        useCenter: Boolean,
        paint: Paint
    ) {
        parentCanvas!!.drawArc(
            left,
            top,
            right,
            bottom,
            startAngle,
            sweepAngle,
            useCenter,
            paint
        )
    }

    override fun drawARGB(a: Int, r: Int, g: Int, b: Int) {
        parentCanvas!!.drawARGB(a, r, g, b)
    }

    override fun drawBitmap(bitmap: Bitmap, left: Float, top: Float, paint: Paint?) {
        parentCanvas!!.drawBitmap(bitmap, left, top, paint)
    }

    override fun drawBitmap(bitmap: Bitmap, src: Rect?, dst: RectF, paint: Paint?) {
        parentCanvas!!.drawBitmap(bitmap, src, dst, paint)
    }

    override fun drawBitmap(bitmap: Bitmap, src: Rect?, dst: Rect, paint: Paint?) {
        parentCanvas!!.drawBitmap(bitmap, src, dst, paint)
    }

    override fun drawBitmap(
        colors: IntArray,
        offset: Int,
        stride: Int,
        x: Float,
        y: Float,
        width: Int,
        height: Int,
        hasAlpha: Boolean,
        paint: Paint?
    ) {
        parentCanvas!!.drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint)
    }

    override fun drawBitmap(
        colors: IntArray,
        offset: Int,
        stride: Int,
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        hasAlpha: Boolean,
        paint: Paint?
    ) {
        parentCanvas!!.drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint)
    }

    override fun drawBitmap(bitmap: Bitmap, matrix: Matrix, paint: Paint?) {
        parentCanvas!!.drawBitmap(bitmap, matrix, paint)
    }

    override fun drawBitmapMesh(
        bitmap: Bitmap,
        meshWidth: Int,
        meshHeight: Int,
        verts: FloatArray,
        vertOffset: Int,
        colors: IntArray?,
        colorOffset: Int,
        paint: Paint?
    ) {
        parentCanvas!!.drawBitmapMesh(
            bitmap,
            meshWidth,
            meshHeight,
            verts,
            vertOffset,
            colors,
            colorOffset,
            paint
        )
    }

    override fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint) {
        parentCanvas!!.drawCircle(cx, cy, radius, paint)
    }

    override fun drawColor(color: Int) {
        parentCanvas!!.drawColor(color)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawColor(color: Long) {
        parentCanvas!!.drawColor(color)
    }

    override fun drawColor(color: Int, mode: PorterDuff.Mode) {
        parentCanvas!!.drawColor(color, mode)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawColor(color: Int, mode: BlendMode) {
        parentCanvas!!.drawColor(color, mode)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawColor(color: Long, mode: BlendMode) {
        parentCanvas!!.drawColor(color, mode)
    }

    override fun drawLine(
        startX: Float,
        startY: Float,
        stopX: Float,
        stopY: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawLine(startX, startY, stopX, stopY, paint)
    }

    override fun drawLines(pts: FloatArray, offset: Int, count: Int, paint: Paint) {
        parentCanvas!!.drawLines(pts, offset, count, paint)
    }

    override fun drawLines(pts: FloatArray, paint: Paint) {
        parentCanvas!!.drawLines(pts, paint)
    }

    override fun drawOval(oval: RectF, paint: Paint) {
        parentCanvas!!.drawOval(oval, paint)
    }

    override fun drawOval(left: Float, top: Float, right: Float, bottom: Float, paint: Paint) {
        parentCanvas!!.drawOval(left, top, right, bottom, paint)
    }

    override fun drawPaint(paint: Paint) {
        parentCanvas!!.drawPaint(paint)
    }

    override fun drawPath(path: Path, paint: Paint) {
        parentCanvas!!.drawPath(path, paint)
    }

    override fun drawPoint(x: Float, y: Float, paint: Paint) {
        parentCanvas!!.drawPoint(x, y, paint)
    }

    override fun drawPoints(pts: FloatArray?, offset: Int, count: Int, paint: Paint) {
        parentCanvas!!.drawPoints(pts, offset, count, paint)
    }

    override fun drawPoints(pts: FloatArray, paint: Paint) {
        parentCanvas!!.drawPoints(pts, paint)
    }

    override fun drawPosText(
        text: CharArray,
        index: Int,
        count: Int,
        pos: FloatArray,
        paint: Paint
    ) {
        parentCanvas!!.drawPosText(text, index, count, pos, paint)
    }

    override fun drawPosText(text: String, pos: FloatArray, paint: Paint) {
        parentCanvas!!.drawPosText(text, pos, paint)
    }

    override fun drawRect(rect: RectF, paint: Paint) {
        parentCanvas!!.drawRect(rect, paint)
    }

    override fun drawRect(r: Rect, paint: Paint) {
        parentCanvas!!.drawRect(r, paint)
    }

    override fun drawRect(left: Float, top: Float, right: Float, bottom: Float, paint: Paint) {
        parentCanvas!!.drawRect(left, top, right, bottom, paint)
    }

    override fun drawRGB(r: Int, g: Int, b: Int) {
        parentCanvas!!.drawRGB(r, g, b)
    }

    override fun drawRoundRect(rect: RectF, rx: Float, ry: Float, paint: Paint) {
        parentCanvas!!.drawRoundRect(rect, rx, ry, paint)
    }

    override fun drawRoundRect(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        rx: Float,
        ry: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawRoundRect(left, top, right, bottom, rx, ry, paint)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawDoubleRoundRect(
        outer: RectF,
        outerRx: Float,
        outerRy: Float,
        inner: RectF,
        innerRx: Float,
        innerRy: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawDoubleRoundRect(
            outer,
            outerRx,
            outerRy,
            inner,
            innerRx,
            innerRy,
            paint
        )
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawDoubleRoundRect(
        outer: RectF,
        outerRadii: FloatArray,
        inner: RectF,
        innerRadii: FloatArray,
        paint: Paint
    ) {
        parentCanvas!!.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint)
    }

    override fun drawText(
        text: CharArray,
        index: Int,
        count: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawText(text, index, count, x, y, paint)
    }

    override fun drawText(text: String, x: Float, y: Float, paint: Paint) {
        parentCanvas!!.drawText(text, x, y, paint)
    }

    override fun drawText(
        text: String,
        start: Int,
        end: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawText(text, start, end, x, y, paint)
    }

    override fun drawTextOnPath(
        text: CharArray,
        index: Int,
        count: Int,
        path: Path,
        hOffset: Float,
        vOffset: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawTextOnPath(text, index, count, path, hOffset, vOffset, paint)
    }

    override fun drawTextOnPath(
        text: String,
        path: Path,
        hOffset: Float,
        vOffset: Float,
        paint: Paint
    ) {
        parentCanvas!!.drawTextOnPath(text, path, hOffset, vOffset, paint)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun drawTextRun(
        text: CharArray,
        index: Int,
        count: Int,
        contextIndex: Int,
        contextCount: Int,
        x: Float,
        y: Float,
        isRtl: Boolean,
        paint: Paint
    ) {
        parentCanvas!!.drawTextRun(
            text,
            index,
            count,
            contextIndex,
            contextCount,
            x,
            y,
            isRtl,
            paint
        )
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun drawTextRun(
        text: CharSequence,
        start: Int,
        end: Int,
        contextStart: Int,
        contextEnd: Int,
        x: Float,
        y: Float,
        isRtl: Boolean,
        paint: Paint
    ) {
        parentCanvas!!.drawTextRun(
            text,
            start,
            end,
            contextStart,
            contextEnd,
            x,
            y,
            isRtl,
            paint
        )
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawTextRun(
        text: MeasuredText,
        start: Int,
        end: Int,
        contextStart: Int,
        contextEnd: Int,
        x: Float,
        y: Float,
        isRtl: Boolean,
        paint: Paint
    ) {
        parentCanvas!!.drawTextRun(
            text,
            start,
            end,
            contextStart,
            contextEnd,
            x,
            y,
            isRtl,
            paint
        )
    }

    override fun drawVertices(
        mode: VertexMode,
        vertexCount: Int,
        verts: FloatArray,
        vertOffset: Int,
        texs: FloatArray?,
        texOffset: Int,
        colors: IntArray?,
        colorOffset: Int,
        indices: ShortArray?,
        indexOffset: Int,
        indexCount: Int,
        paint: Paint
    ) {
        parentCanvas!!.drawVertices(
            mode,
            vertexCount,
            verts,
            vertOffset,
            texs,
            texOffset,
            colors,
            colorOffset,
            indices,
            indexOffset,
            indexCount,
            paint
        )
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun drawRenderNode(renderNode: RenderNode) {
        parentCanvas!!.drawRenderNode(renderNode)
    }
}