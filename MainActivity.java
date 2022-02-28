package com.example.a3graphicalprimitives;

import android.app.Activity;
import android.content.Intent;
import android.graphics.*;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bg = Bitmap.createBitmap(720,1200,Bitmap.Config.ARGB_8888);

        ImageView imageView = findViewById(R.id.imageView);
        Button part2 = findViewById(R.id.part2);
        imageView.setImageBitmap(bg);

        Canvas canvas = new Canvas(bg);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawText("Rectangle",400,100,paint);
        canvas.drawRect(410,200,590,600,paint);

        canvas.drawText("Circle",120,100,paint);
        canvas.drawCircle(180,300,50,paint);

        canvas.drawText("Line",100,750,paint);
        canvas.drawLine(150,800,180,1000,paint);

        canvas.drawText("Arc",400,750,paint);
        canvas.drawArc(410,900,600,1000,0,240,true,paint);

        part2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });
    }
}