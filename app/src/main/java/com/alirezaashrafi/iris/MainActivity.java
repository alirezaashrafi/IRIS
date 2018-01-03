package com.alirezaashrafi.iris;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

/*
        Paint paint = new Paint();

        new Canvas().drawBitmap(destinationImage, 0, 0, paint);

        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN ;  // choose a mode paint.setXfermode(new PorterDuffXfermode(mode));

        canvas.drawBitmap(sourceImage, 0, 0, paint);

*/
imageView.setImageDrawable(getResources().getDrawable(R.drawable.img1));
//imageView.setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);

    }


    private ImageView imageView;

    public void initViews() {
        imageView = (ImageView) findViewById(R.id.imageView);
    }

}
