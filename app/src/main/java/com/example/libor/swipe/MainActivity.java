package com.example.libor.swipe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float x1,x2,y1,y2;
    public int left, right, up, down;
    int cards[][] = {{R.drawable.one_black_flower,R.drawable.one_black_spade,R.drawable.one_red_diamond, R.drawable.one_red_heart},
            {R.drawable.two_black_flower,R.drawable.two_black_spade,R.drawable.two_red_diamond,R.drawable.two_red_hearts},
            {R.drawable.three_black_flower,R.drawable.three_black_spade,R.drawable.three_red_diamond,R.drawable.three_red_heart},
            {R.drawable.four_black_flower,R.drawable.four_black_spade,R.drawable.four_red_diamond,R.drawable.four_red_heart}};
    ImageView imgCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCards = (ImageView)findViewById(R.id.imageCard);
        left = right = up = down = 0;


        imgCards.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this)
        {

        });


    }

//    public boolean onTouchEvent(MotionEvent motionEvent) {
//
//        switch(motionEvent.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                x2 = motionEvent.getX();
//                y2 = motionEvent.getY();
//                if (x1 < x2) {
//                    if (right > 3) {
//                        right = 0;
//                    }
//                    imgCards.setImageResource(cards[0][right]);
//                    Toast.makeText(MainActivity.this, "right[" + right + "]", Toast.LENGTH_SHORT).show();
//                    right++; break;
//                }
//                if (y1 > y2) {
//                    if (down > 3) {
//                        down = 0;
//                    }
//                    imgCards.setImageResource(cards[2][down]);
//                    Toast.makeText(MainActivity.this, "downward[" + down + "]", Toast.LENGTH_SHORT).show();
//                    down++; break;
//                }
//                break;
//            case MotionEvent.ACTION_UP:
//                x1 = motionEvent.getX();
//                y1 = motionEvent.getY();
//                if(x1 > x2)
//                {
//                    if(left > 3){
//                        left = 0;
//                    }
//                    imgCards.setImageResource(cards[1][left]);
//                    Toast.makeText(MainActivity.this,"left["+left+"]",Toast.LENGTH_SHORT).show();
//                    left++; break;
//                }
//                if(y1 < y2)
//                {
//                    if(up > 3){
//                        up = 0;
//                    }
//                    imgCards.setImageResource(cards[3][up]);
//                    Toast.makeText(MainActivity.this,"upward["+up+"]",Toast.LENGTH_SHORT).show();
//                    up++; break;
//                }
//                break;
//        }
//        return false;
//    }
}