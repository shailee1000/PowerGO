package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.List;

public class Board extends View {
    private List<Integer> markedNumbers;  // רשימה של מספרים שסומנו על הלוח
    private boolean isBingo;              // אם השחקן השלים בינגו
    private boolean firstTime = true;
    private Square[][] squares;
    private Square[][] squares2;
    private Context context;
    private final int NUM_OF_SQUARES = 5;
    private Paint p;


    public Board(Context context) {
        super(context);
        squares = new Square[NUM_OF_SQUARES][NUM_OF_SQUARES];
        squares2 = new Square[NUM_OF_SQUARES][NUM_OF_SQUARES];
    }


    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (firstTime) {
            initBoard(canvas);
            firstTime = false;
        }
        drawBoard(canvas);
        drawlines(canvas);

    }

    private void drawBoard(Canvas canvas) {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares.length; j++) {
                squares[i][j].draw(canvas);
                squares2[i][j].draw(canvas);
            }
        }
    }

    private void initBoard(Canvas canvas) {
        int x =0;
        int y =canvas.getHeight()/2;
        int z =0;
        int w = canvas.getWidth()/NUM_OF_SQUARES    ;
        int h = w;


        for (int i = 0; i < NUM_OF_SQUARES; i++) {
            for (int j = 0; j < squares.length; j++) {


                squares[i][j] = new Square(x,y,w,h,Color.CYAN);
                squares2[i][j] = new Square(x,z,w,h,Color.YELLOW);
                x = x+w;

            }
            x= 0;
            y= y+h;
            z = z+h;
        }

    }
    private void drawlines(Canvas canvas) {
        int x = 0;
        int y =0;
        int w = canvas.getWidth() ;
        int h = w;
        int color = Color.BLACK;
        p = new Paint();
        p.setColor(color);
        p.setStrokeWidth(10);
        for (int i = 0; i < NUM_OF_SQUARES+1; i++) {
            canvas.drawLine(x,y,x,h+y,p);
            x = x+ w/NUM_OF_SQUARES;

        }
        x = 0;
        y =0;
        for (int i = 0; i < NUM_OF_SQUARES+1; i++) {
            canvas.drawLine(x,y,x+w,y,p);
            y = y + h/NUM_OF_SQUARES;
        }

         x = 0;
         y =canvas.getHeight()/2;
         w = canvas.getWidth() ;
         h = w;
         color = Color.BLACK;
        p = new Paint();
        p.setColor(color);
        p.setStrokeWidth(10);
        for (int i = 0; i < NUM_OF_SQUARES+1; i++) {
            canvas.drawLine(x,y,x,h+y,p);
            x = x+ w/NUM_OF_SQUARES;

        }
        x = 0;
        y =canvas.getHeight()/2;
        for (int i = 0; i < NUM_OF_SQUARES+1; i++) {
            canvas.drawLine(x,y,x+w,y,p);
            y = y + h/NUM_OF_SQUARES;
        }
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(50);
        canvas.drawLine(0 ,canvas.getHeight()/2+10,canvas.getWidth(),canvas.getHeight()/2+10,paint);
   }
}


