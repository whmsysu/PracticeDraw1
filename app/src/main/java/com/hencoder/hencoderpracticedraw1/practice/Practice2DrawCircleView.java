package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        // First circle
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(450,225, 225, paint);
        //Second circle
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawCircle(950, 225, 225, paint);
        //Third circle
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(65, 105, 225));
        canvas.drawCircle(450,700, 225, paint);

        //Forth circle
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(80);
        canvas.drawCircle(950, 700, 200, paint);


    }
}
