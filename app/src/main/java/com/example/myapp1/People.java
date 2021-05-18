package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;



    public class People extends AppCompatActivity implements View.OnClickListener {
            public CardView donorcards1,donorcards2,donorcards3,donorcards4,donorcards5,donorcards6,donorcards7,donorcards8,donorcards9,donorcards10;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
                setContentView(R.layout.activity_people);

                donorcards1 = (CardView) findViewById(R.id.donorcard1);
                donorcards2 = (CardView) findViewById(R.id.donorcard2);
                donorcards3 = (CardView) findViewById(R.id.donorcard3);
                donorcards4 = (CardView) findViewById(R.id.donorcard4);
                donorcards5 = (CardView) findViewById(R.id.donorcard5);
                donorcards6 = (CardView) findViewById(R.id.donorcard6);
                donorcards7 = (CardView) findViewById(R.id.donorcard7);
                donorcards8 = (CardView) findViewById(R.id.donorcard8);
                donorcards9 = (CardView) findViewById(R.id.donorcard9);
                donorcards10 = (CardView) findViewById(R.id.donorcard10);



                donorcards1.setOnClickListener(this);
                donorcards2.setOnClickListener(this);
                donorcards3.setOnClickListener(this);
                donorcards4.setOnClickListener(this);
                donorcards5.setOnClickListener(this);
                donorcards6.setOnClickListener(this);
                donorcards7.setOnClickListener(this);
                donorcards8.setOnClickListener(this);
                donorcards9.setOnClickListener(this);
                donorcards10.setOnClickListener(this);


            }


            @Override
            public void onClick(View v) {
                Intent i;

                switch (v.getId()){
                    case R.id.donorcard1:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;


                    case R.id.donorcard2:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;

                    case R.id.donorcard3:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;


                    case R.id.donorcard4:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;


                    case R.id.donorcard5:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;


                    case R.id.donorcard6:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;

                    case R.id.donorcard7:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;

                    case R.id.donorcard8:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;

                    case R.id.donorcard9:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;

                    case R.id.donorcard10:
                        i = new Intent(this,donor_card_reg.class);
                        startActivity(i);
                        break;
                }
            }
        }