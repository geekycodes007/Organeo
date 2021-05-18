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

public class Card5 extends AppCompatActivity {

    EditText c5FullName,c5Gender,c5Age,c5Blood,c5Alcohol,c5Allergy,c5Health;
    Button btn_sumbitcs;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_card5);

        c5FullName = findViewById(R.id.patnamec5);
        c5Gender = findViewById(R.id.genderc5);
        c5Age = findViewById(R.id.agec5);
        c5Blood = findViewById(R.id.bgc5);
        c5Allergy = findViewById(R.id.allec5);
        c5Health = findViewById(R.id.healthc5);
        btn_sumbitcs = findViewById(R.id.buttonc5);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("skin");


        btn_sumbitcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertskin();
            }
        });
    }
    private void insertskin(){

        String name = c5FullName.getText().toString();
        String gender =c5Gender.getText().toString();
        String age = c5Age.getText().toString();
        String blood= c5Blood.getText().toString();
        String allergy= c5Allergy.getText().toString();
        String health= c5Health.getText().toString();



        skin c5 =new skin(name,age,gender,blood,allergy,health);

        databaseReference.push().setValue(c5);
        Toast.makeText(Card5.this, "Done", Toast.LENGTH_SHORT).show();

        btn_sumbitcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Success.class));
            }
        });
    }
}