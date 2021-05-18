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

public class Card4 extends AppCompatActivity {


    EditText c4FullName,c4Gender,c4Age,c4Blood,c4Alcohol,c4Smoke,c4Health;
    Button btn_sumbitcb;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_card4);

        c4FullName = findViewById(R.id.patnamec4);
        c4Gender = findViewById(R.id.genderc4);
        c4Age = findViewById(R.id.agec4);
        c4Blood = findViewById(R.id.bgc4);
        c4Smoke = findViewById(R.id.smokec4);
        c4Health = findViewById(R.id.healthc4);
        c4Alcohol = findViewById(R.id.alcoholc4);
        btn_sumbitcb = findViewById(R.id.buttonc4);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("blood");


        btn_sumbitcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertblood();
            }
        });
    }
    private void insertblood(){

        String name = c4FullName.getText().toString();
        String gender =c4Gender.getText().toString();
        String age = c4Age.getText().toString();
        String blood= c4Blood.getText().toString();
        String smoke= c4Smoke.getText().toString();
        String health= c4Health.getText().toString();
        String alcohol= c4Alcohol.getText().toString();



        blood c4 =new blood(name,age,gender,blood,smoke,health,alcohol);

        databaseReference.push().setValue(c4);
        Toast.makeText(Card4.this, "Done", Toast.LENGTH_SHORT).show();

        btn_sumbitcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Success.class));
            }
        });
    }
}