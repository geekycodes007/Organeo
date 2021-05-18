package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.cardview.widget.CardView;

import android.content.Intent;

import android.view.View;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    public CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void donors(View view){
        startActivity(new Intent(getApplicationContext(),People.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.c1:
                i = new Intent(this,Card1.class);
                startActivity(i);
                break;


            case R.id.c2:
                i = new Intent(this,Card2.class);
                startActivity(i);
                break;

            case R.id.c3:
                i = new Intent(this,Card3.class);
                startActivity(i);
                break;


            case R.id.c4:
                i = new Intent(this,Card4.class);
                startActivity(i);
                break;


            case R.id.c5:
                i = new Intent(this,Card5.class);
                startActivity(i);
                break;


            case R.id.c6:
                i = new Intent(this,Card6.class);
                startActivity(i);
                break;
        }
    }
}