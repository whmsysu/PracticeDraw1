package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private Paint paint = new Paint();
    private int num = 1;// 饼图个数

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼
        paint.setColor(Color.RED);
        canvas.drawArc(300, 100, 1000, 700, -180, 120, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(320, 120, 1020, 720, -60, 60, true, paint);

        paint.setColor(Color.parseColor("#9400D3"));
        canvas.drawArc(320, 130, 1020, 730, 0, 10, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(320, 140, 1020, 740, 10, 10, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(320, 150, 1020, 750, 20, 45, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(300, 150, 1000, 750, -180, -115, true, paint);


    }

}
