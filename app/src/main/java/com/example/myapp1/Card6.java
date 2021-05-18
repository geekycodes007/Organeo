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

public class Card6 extends AppCompatActivity {

    EditText c6FullName,c6Gender,c6Age,c6Blood,c6Alcohol,c6Smoke,c6Stroke,c6Health;
    Button btn_sumbitch;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_card6);

            c6FullName = findViewById(R.id.patnamec6);
            c6Gender = findViewById(R.id.genderc6);
            c6Age = findViewById(R.id.agec6);
            c6Blood = findViewById(R.id.bgc6);
            c6Alcohol = findViewById(R.id.alcoholc6);
            c6Smoke = findViewById(R.id.smokec6);
            c6Stroke = findViewById(R.id.strokec6);
            c6Health = findViewById(R.id.healthc6);
            btn_sumbitch = findViewById(R.id.buttonc6);

            databaseReference = FirebaseDatabase.getInstance().getReference().child("heart");


            btn_sumbitch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    insertheart();
                }
            });
        }
        private void insertheart(){

            String name = c6FullName.getText().toString();
            String gender =c6Gender.getText().toString();
            String age = c6Age.getText().toString();
            String blood= c6Blood.getText().toString();
            String alcohol= c6Alcohol.getText().toString();
            String smoke= c6Smoke.getText().toString();
            String stroke= c6Stroke.getText().toString();
            String health= c6Health.getText().toString();



            heart c6 =new heart(name,age,gender,blood,alcohol,smoke,stroke,health);

            databaseReference.push().setValue(c6);
            Toast.makeText(Card6.this, "Done", Toast.LENGTH_SHORT).show();

            btn_sumbitch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), Success.class));
                }
            });
    }
}