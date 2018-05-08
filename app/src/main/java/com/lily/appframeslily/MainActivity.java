package com.lily.appframeslily;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img,img2,img3;
    Button bailar, detener, cof;
    boolean i;

    @SuppressLint("NewApi")

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        bailar = (Button) findViewById(R.id.button2);
        cof = (Button) findViewById(R.id.button1);
        detener = (Button) findViewById(R.id.button3);

        i = true ;

        img.post(new Runnable() {

            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
                ((AnimationDrawable) img2.getBackground()).start();
                ((AnimationDrawable) img3.getBackground()).start();
            }


        });

        bailar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 img.setVisibility(View.GONE);
                 img3.setVisibility(View.GONE);
                 img2.setVisibility(View.VISIBLE);

                img.post(new Runnable() {

                    @Override
                    public void run() {
                        ((AnimationDrawable) img.getBackground()).start();
                        ((AnimationDrawable) img2.getBackground()).start();
                        ((AnimationDrawable) img3.getBackground()).start();
                    }


                });

            }


        });

        cof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setVisibility(View.GONE);
                img3.setVisibility(View.VISIBLE);
                img2.setVisibility(View.GONE);

                img.post(new Runnable() {

                    @Override
                    public void run() {
                        ((AnimationDrawable) img.getBackground()).start();
                        ((AnimationDrawable) img2.getBackground()).start();
                        ((AnimationDrawable) img3.getBackground()).start();
                    }


                });

            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    img.post(new Runnable() {

                        @Override
                        public void run() {
                            ((AnimationDrawable) img.getBackground()).stop();
                            ((AnimationDrawable) img2.getBackground()).stop();
                            ((AnimationDrawable) img3.getBackground()).stop();
                        }

                    });

                    i = false ;

                    detener.setText("(INICIAR ANIMACIÓN TOTAL)");
                }
                else{
                    img.post(new Runnable() {

                        @Override
                        public void run() {
                            ((AnimationDrawable) img.getBackground()).start();
                            ((AnimationDrawable) img2.getBackground()).start();
                            ((AnimationDrawable) img3.getBackground()).start();
                        }

                    });
                    i = true ;

                    detener.setText("(DETENER ANIMACIÓN TOTAL)");
                }






            }




        });


    }
}





