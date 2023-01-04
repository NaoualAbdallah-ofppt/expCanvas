package com.example.expcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import kotlin.Unit;

public class MyCanvas extends View {
    Context context;
    final int RAYON=100;
float posX=0;
float posY=0;
    public MyCanvas(Context context) {
        super(context);
        this.context=context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect r;
        Paint p;
        r= new Rect(0,100,200,300);
        p=new Paint();
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(10);
        canvas.drawRect(r,p);
        Paint p2=new Paint();
        p2.setColor(Color.BLUE);
        canvas.drawLine(10,200,20,400,p2);
    canvas.drawCircle(posX,posY,RAYON,p);
        LinearLayout layout = new LinearLayout(context);
        TextView textView = new TextView(context);
        textView.setVisibility(View.VISIBLE);
        textView.setText("Hello world");
        textView.setTextSize(20);
//textView.setTextSize(TypedValue.COMPLEX_UNIT_PT,30);
        layout.addView(textView);
        layout.measure(canvas.getWidth(), canvas.getHeight());
        layout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        layout.setBackgroundColor(Color.GREEN);
// To place the text view somewhere specific:
        canvas.translate(100, 110);
        layout.draw(canvas);
        canvas.drawText("Bonjour",29,50, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        posX=event.getX();
        posY=event.getY();

        //redraw canvas
        invalidate();
        return super.onTouchEvent(event);

    }

}
