package com.example.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }

    class DrawView extends View {

        Paint p;
        Rect rect;
        Path path;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect();
            path = new Path();
        }

        @SuppressLint("ResourceAsColor")
        @Override
        protected void onDraw(Canvas canvas) {
            p.setColor(Color.rgb(22,99,22));

            canvas.drawRect(0, getHeight()/2, getWidth(), getHeight(), p);

            p.setColor(Color.rgb(77,55,55));
            canvas.drawRect((getWidth()/2)-getWidth()/100, getHeight()/2+getHeight()/3, getWidth()/2+getWidth()/100, getHeight()/2+getHeight()/5, p);

            p.setColor(Color.GREEN);
            canvas.drawOval(new RectF((getWidth()/2)-getWidth()/15, getHeight()/2+getHeight()/4, getWidth()/2+getWidth()/15, getHeight()/2-getHeight()/3), p);

            p.setColor(Color.rgb(160, 82, 45));
            canvas.drawRect(getWidth()/10,getHeight()/2+getHeight()/3,getWidth()/3,getHeight()/2-getHeight()/6,p);

            path.reset();
            path.moveTo((getWidth()/10),getHeight()/2-getHeight()/6);
            path.lineTo((getWidth()/3+getWidth()/10)/2,getHeight()/2-2*getHeight()/5);
            path.lineTo(getWidth()/3,getHeight()/2-getHeight()/6);
            canvas.drawPath(path,p);

            p.setColor(Color.YELLOW);

            canvas.drawCircle(getWidth()/20,getHeight()/10,100, p);


            int a = 100, b = 200;
            for (int i=1;i<=15;i++) {
                canvas.drawLine(getWidth()/20,getHeight()/10,getWidth()/20+a,getHeight()/10+b,p);
                a=a+50;
                b=b-20;
            }

            p.setColor(Color.GRAY);
            canvas.drawRect(getWidth()/2+getWidth()/6,getHeight()/2+getHeight()/7,getWidth()/2+3*getWidth()/22,getHeight()/2+getHeight()/4,p);
            canvas.drawRect(getWidth()/2+getWidth()/6+getWidth()/6,getHeight()/2+getHeight()/7,getWidth()/2+3*getWidth()/22+getWidth()/6,getHeight()/2+getHeight()/4,p);
            canvas.drawRect(getWidth()/2+getWidth()/6-getWidth()/20,getHeight()/2+getHeight()/7-getHeight()/20,getWidth()/2+3*getWidth()/22+getWidth()/6+getWidth()/20,getHeight()/2+getHeight()/7,p);

            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(3);
            p.setColor(Color.BLACK);
            canvas.drawOval( new RectF((getWidth()/2)-getWidth()/15, getHeight()/2+getHeight()/4, getWidth()/2+getWidth()/15, getHeight()/2-getHeight()/3), p);
            canvas.drawRect(getWidth()/10,getHeight()/2+getHeight()/3,getWidth()/3,getHeight()/2-getHeight()/6,p);
            path.reset();
            path.moveTo((getWidth()/10),getHeight()/2-getHeight()/6);
            path.lineTo((getWidth()/3+getWidth()/10)/2,getHeight()/2-2*getHeight()/5);
            path.lineTo(getWidth()/3,getHeight()/2-getHeight()/6);
            canvas.drawPath(path,p);

            p.setColor(Color.BLUE);

            canvas.drawLine((getWidth()/3+getWidth()/10)/2-30,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2-30,(getWidth()/3+getWidth()/10)/2+30,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2+30, p);
            canvas.drawLine((getWidth()/3+getWidth()/10)/2-30,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2+30,(getWidth()/3+getWidth()/10)/2+30,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2-30, p);
            canvas.drawLine((getWidth()/3+getWidth()/10)/2,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2+40,(getWidth()/3+getWidth()/10)/2,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2-40, p);
            canvas.drawLine((getWidth()/3+getWidth()/10)/2-40,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2,(getWidth()/3+getWidth()/10)/2+40,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2, p);

            a = getWidth()/10+getWidth()/40;
            while (a<getWidth()/3-getWidth()/7) {
                canvas.drawLine(a,getHeight()/2-getHeight()/16,a,getHeight()/2+getHeight()/6,p);
                a+=20;
            }
            b = getHeight()/2-getHeight()/16;
            while (b<getHeight()/2+getHeight()/6) {
                canvas.drawLine(getWidth()/10+getWidth()/40,b,getWidth()/3-getWidth()/7,b,p);
                b+=20;
            }
            p.setColor(Color.WHITE);

            a = getWidth()/3-getWidth()/40;
            b = getHeight()/2-getHeight()/16;
            while (a>getWidth()/10+getWidth()/8) {
                canvas.drawLine(a,getHeight()/2-getHeight()/16,getWidth()/3-getWidth()/40,b,p);
                a-=20;
                b+=20;
            }

            a = getWidth()/10+getWidth()/8;
            b = getHeight()/2+getHeight()/3;

            int c=getHeight()/2+getHeight()/3;
            while (a<getWidth()/3-getWidth()/40) {
                canvas.drawLine(getWidth()/10+getWidth()/8,b,a,getHeight()/2+getHeight()/3,p);
                a+=20;
                b-=20;
                c = b;
            }
            a = getHeight()/2+getHeight()/3-15;
            while (c>getHeight()/2-getHeight()/16) {
                canvas.drawLine(getWidth()/10+getWidth()/8, c, getWidth()/3-getWidth()/40, a, p);
                a -= 20;
                c -= 20;
            }

            p.setColor(Color.BLACK);
            canvas.drawRect(getWidth()/10+getWidth()/8,getHeight()/2+getHeight()/3,getWidth()/3-getWidth()/40,getHeight()/2-getHeight()/16,p);
            canvas.drawCircle((getWidth()/3+getWidth()/10)/2,((getHeight()/2-2*getHeight()/5)+(getHeight()/2-getHeight()/6))/2,40, p);
            canvas.drawRect(getWidth()/10+getWidth()/40,getHeight()/2-getHeight()/16,getWidth()/3-getWidth()/7,getHeight()/2+getHeight()/6,p);

            canvas.drawRect(getWidth()/2+getWidth()/6,getHeight()/2+getHeight()/7,getWidth()/2+3*getWidth()/22,getHeight()/2+getHeight()/4,p);
            canvas.drawRect(getWidth()/2+getWidth()/6+getWidth()/6,getHeight()/2+getHeight()/7,getWidth()/2+3*getWidth()/22+getWidth()/6,getHeight()/2+getHeight()/4,p);
            canvas.drawRect(getWidth()/2+getWidth()/6-getWidth()/20,getHeight()/2+getHeight()/7-getHeight()/20,getWidth()/2+3*getWidth()/22+getWidth()/6+getWidth()/20,getHeight()/2+getHeight()/7,p);

        }
    }
}
