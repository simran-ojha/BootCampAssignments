package com.gl.practise.project_session9;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.LinkedList;
import java.util.Queue;

public class CustomView extends View{

   private Paint paint;
    private ShapeDrawable Drawable;
    private Bitmap bitmap;


    public CustomView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public CustomView(Context context,AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }


    @Override
    protected void onDraw(Canvas canvas)
    {
        Bitmap bit = Circle();
        canvas.drawBitmap(bit,0,0,null);

    }

    public Bitmap Circle() {

        Bitmap bitmap = Bitmap.createBitmap(getWidth(),getHeight(), android.graphics.Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);

        int width = getWidth();
        int height = getHeight();

        int X = width/2;
        int Y = height/2;
        Y = Y - 100;
        canvas.drawColor(Color.TRANSPARENT);
        canvas.drawCircle(X-280,Y,380,paint);
        canvas.drawCircle(X+280,Y,380,paint);
        canvas.drawCircle(X,Y+390,390,paint);

        final Point point = new Point();
        point.x = X;
        point.y = Y - 100;

        bitmap = FloodFill(bitmap,point,Color.RED);
        return bitmap;
    }

    public Bitmap FloodFill(Bitmap bitmap,Point node,int color) {

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int target = color;
        int a = node.x;
        int b = node.y;

        if(bitmap.getPixel(a,b) != target) {
            Queue<Point> queue = new LinkedList<Point>();
            do {
                int x = node.x;
                int y = node.y;
                while (x > 0 && bitmap.getPixel(x - 1, y) == Color.TRANSPARENT) {
                    x--;
                }
                boolean SpanUp = false;
                boolean SpanDown = false;
                while (x < width && bitmap.getPixel(x, y) == Color.TRANSPARENT) {
                    bitmap.setPixel(x, y, color);
                    if (!SpanUp && y > 0 && bitmap.getPixel(x, y - 1) == Color.TRANSPARENT) {
                        queue.add(new Point(x, y - 1));
                        SpanUp = true;
                    } else if (SpanUp && y > 0 && bitmap.getPixel(x, y - 1) != Color.TRANSPARENT) {
                        SpanUp = false;
                    }

                    if (!SpanDown && y < height - 1 && bitmap.getPixel(x, y + 1) == Color.TRANSPARENT) {
                        queue.add(new Point(x, y + 1));
                        SpanDown = true;
                    } else if (SpanDown && y < height - 1 && bitmap.getPixel(x, y + 1) != Color.TRANSPARENT) {
                        SpanDown = false;
                    }
                    x++;
                }
            } while ((node = queue.poll()) != null);
        }
        return bitmap;
    }

}

