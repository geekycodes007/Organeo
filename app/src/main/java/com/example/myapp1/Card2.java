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

public class Card2 extends AppCompatActivity {

    EditText c2FullName,c2Gender,c2Age,c2Blood,c2Smoke,c2Breathe,c2Alcohol,c2Health;
    Button btn_sumbitcl;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_card2);


        c2FullName = findViewById(R.id.patnamec2);
        c2Gender = findViewById(R.id.genderc2);
        c2Age = findViewById(R.id.agec2);
        c2Blood = findViewById(R.id.bgc2);
        c2Smoke = findViewById(R.id.smokec2);
        c2Breathe = findViewById(R.id.bic2);
        c2Alcohol = findViewById(R.id.alcoholc2);
        c2Health = findViewById(R.id.healthc2);
        btn_sumbitcl = findViewById(R.id.buttonc2);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("lungs");


        btn_sumbitcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertlungs();
            }
        });
    }
    private void insertlungs(){

        String name = c2FullName.getText().toString();
        String gender =c2Gender.getText().toString();
        String age = c2Age.getText().toString();
        String blood= c2Blood.getText().toString();
        String smoke= c2Smoke.getText().toString();
        String breathe= c2Breathe.getText().toString();
        String alcohol= c2Alcohol.getText().toString();
        String health= c2Health.getText().toString();


        lungs c2 =new lungs(name,age,gender,blood,smoke,breathe,alcohol,health);

        databaseReference.push().setValue(c2);
        Toast.makeText(Card2.this, "Done", Toast.LENGTH_SHORT).show();

        btn_sumbitcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Success.class));
            }
        });
    }

}
