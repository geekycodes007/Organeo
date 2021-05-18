package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Card3 extends AppCompatActivity {


    EditText c3FullName,c3Gender,c3Age,c3Blood,c3Alcohol,c3Stone,c3Health;
    Button btn_sumbitck;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_card3);

        c3FullName = findViewById(R.id.patnamec3);
        c3Gender = findViewById(R.id.genderc3);
        c3Age = findViewById(R.id.agec3);
        c3Blood = findViewById(R.id.bgc3);
        c3Stone = findViewById(R.id.stonec3);
        c3Health = findViewById(R.id.healthc3);
        c3Alcohol = findViewById(R.id.alcoholc3);
        btn_sumbitck = findViewById(R.id.buttonc3);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("kidney");


        btn_sumbitck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertkidney();
            }
        });
    }
    private void insertkidney(){

        String name = c3FullName.getText().toString();
        String gender =c3Gender.getText().toString();
        String age = c3Age.getText().toString();
        String blood= c3Blood.getText().toString();
        String stone= c3Stone.getText().toString();
        String health= c3Health.getText().toString();
        String alcohol= c3Alcohol.getText().toString();



        kidney c3 =new kidney(name,age,gender,blood,stone,health,alcohol);

        databaseReference.push().setValue(c3);
        Toast.makeText(Card3.this, "Done", Toast.LENGTH_SHORT).show();

        btn_sumbitck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Success.class));
            }
        });
    }
}