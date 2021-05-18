package com.example.myapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Card1 extends AppCompatActivity {

    EditText c1FullName,c1Gender,c1Age,c1Blood,c1Irr,c1Wear,c1Health;
    Button btn_sumbitce;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        c1FullName = findViewById(R.id.patnamec1);
        c1Gender = findViewById(R.id.genderc1);
        c1Age = findViewById(R.id.agec1);
        c1Blood = findViewById(R.id.bgc1);
        c1Irr = findViewById(R.id.irrc1);
        c1Wear = findViewById(R.id.wearc1);
        c1Health = findViewById(R.id.healthc1);
        btn_sumbitce = findViewById(R.id.buttonc1);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("eyes");


        btn_sumbitce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inserteyes();
            }
        });
    }
         private void inserteyes(){

             String name = c1FullName.getText().toString();
             String gender =c1Gender.getText().toString();
             String age = c1Age.getText().toString();
             String blood= c1Blood.getText().toString();
             String glass= c1Wear.getText().toString();
             String irri= c1Irr.getText().toString();
             String health= c1Health.getText().toString();


             eyes c1 =new eyes(name,age,gender,blood,glass,irri,health);

             databaseReference.push().setValue(c1);
             Toast.makeText(Card1.this, "Done", Toast.LENGTH_SHORT).show();

             btn_sumbitce.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(getApplicationContext(), Success.class));
                 }
             });
        }


                }
