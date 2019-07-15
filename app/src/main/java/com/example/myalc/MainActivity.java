package com.example.myalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button Profile1;
    Button About1;

    ImageView bpapp,clover;
    LinearLayout textsplash, texthome,menu;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Animation Code reView*/
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);

        bpapp=(ImageView)findViewById(R.id.bgapp);
        clover=(ImageView)findViewById(R.id.clover);
        textsplash=(LinearLayout) findViewById(R.id.textsplash);
        texthome=(LinearLayout)findViewById(R.id.texthome);
        menu=(LinearLayout)findViewById(R.id.menus);

        bpapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menu.startAnimation(frombottom);

        //end of Animation CODE

        /*Button Codes*/
        Profile1=(Button)findViewById(R.id.myProfile);
        About1=(Button)findViewById(R.id.about1);

        Profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MyProfileActivity.class));
            }
        });//end myProfileView

        About1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
            }
        });///end of AboutClick
        /*end of buttons end text*/

    }///end of onCreate

}//end of MAIN




