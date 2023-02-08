package com.toksaitov_d.customviewexample;

/*
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private final Paint paint;

    private Bitmap backbuffer;
    private Canvas backbufferCanvas;
    private final Paint backbufferPaint;

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        backbufferCanvas = null;
        backbuffer = null;
        backbufferPaint = new Paint();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        if (w > 0 && h > 0) {
            if (backbuffer != null) {
                backbuffer.recycle();
            }
            backbuffer = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            backbufferCanvas = new Canvas();
            backbufferCanvas.setBitmap(backbuffer);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (backbufferCanvas != null) {
            backbufferCanvas.drawCircle(getWidth() * 0.5f, getHeight() * 0.5f, 300, paint);
            canvas.drawBitmap(backbuffer, 0, 0, backbufferPaint);
        }
    }
}
*/

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    private final Paint paint;

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        canvas.drawCircle(getWidth() * 0.5f, getHeight() * 0.5f, 300, paint);
    }
}
