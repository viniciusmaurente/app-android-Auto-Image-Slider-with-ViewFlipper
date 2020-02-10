package com.br.presentation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;



public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView( R.layout.activity_main );

        int images[]={R.drawable.slide24,R.drawable.slide25,R.drawable.slide26, R.drawable.slide2, R.drawable.slide3,R.drawable.slide4, R.drawable.slide5,R.drawable.slide6,R.drawable.slide7,R.drawable.slide8,R.drawable.slide9,R.drawable.slide10,
                R.drawable.slide11,R.drawable.slide12,R.drawable.slide13,R.drawable.slide14,R.drawable.slide15,R.drawable.slide16,R.drawable.slide17,R.drawable.slide18,R.drawable.slide19,R.drawable.slide20,R.drawable.slide21,R.drawable.slide22,
                R.drawable.slide23};
        v_flipper = findViewById( R.id.v_flipper);

       // for (int 1=0; i <images.length; i++ ){
       //     flipperImages( images[i] );

         for (int image: images){
             flipperImages( image );
        }
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView( this );
        imageView.setBackgroundResource(image);

        v_flipper.addView( imageView );
        v_flipper.setFlipInterval( 4000 );
        v_flipper.setAutoStart( true );


        //animation
        v_flipper.setInAnimation( this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation( this, android.R.anim.slide_out_right);
    }
}
