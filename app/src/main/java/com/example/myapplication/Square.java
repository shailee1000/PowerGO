package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square extends Shape{
    private int w,h;  // w = width h = high
    private Paint p;

    public Square(int x, int y, int w, int h, int color) {
        super(x, y, color);
        this.w = w;
        this.h = h;

        p = new Paint();
        p.setColor(color);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(x,y,x+w,y+h,p);
    }
}

