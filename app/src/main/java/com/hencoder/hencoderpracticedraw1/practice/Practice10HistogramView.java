package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        drawCoordinate(canvas);
        drawHistogram(canvas);
    }

    // 画坐标系
    private void drawCoordinate(Canvas canvas) {
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        float[] pts = {200, 50, 200, 600, 200, 600, 1200, 600};
        canvas.drawLines(pts, paint);
    }

    private void drawHistogram(Canvas canvas) {
        float interval = 40;// 每个直方图的间隔
        float width = 100;// 直方图的宽
        float[] nums = {0,20,20,200,400,500,200};
        String[] names = {"Froyo","GB","ICS","JB", "KitKat", "L", "M"};
        paint.setColor(Color.rgb(34, 139, 34));
        float cordinateX = 200 + interval;
        for (int i=0;i<nums.length;i++){
            canvas.drawRect(cordinateX, 600 - nums[i], cordinateX + width , 600, paint);
            paint.setTextSize(25);
            canvas.drawText(names[i], cordinateX+30, 600 + 40, paint);
            cordinateX+=width+interval;
        }

    }
}
