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

import java.text.BreakIterator;

public class donor_card_reg extends AppCompatActivity {


    EditText regPatID,regFullName,regDob,regAge,regBlood,regFrst,regPhn,regAdd,regEmail;
    Button btn_donatereg;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_card_reg);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);





        regPatID =findViewById(R.id.patidreg);
        regFullName = findViewById(R.id.regname);
        regAge = findViewById(R.id.regage);
        regDob = findViewById(R.id.regdob);
        regBlood = findViewById(R.id.regbg);
        regEmail = findViewById(R.id.regemail);
        regFrst = findViewById(R.id.regfrst);
        regAdd = findViewById(R.id.regadd);
        regPhn = findViewById(R.id.regphn);
        btn_donatereg = findViewById(R.id.buttonreg);

            databaseReference = FirebaseDatabase.getInstance().getReference().child("donate");


            btn_donatereg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    insertdonate();
                }
            });
        }
        private void insertdonate(){

            String reg_patid = regPatID.getText().toString();
            String reg_name = regFullName.getText().toString();
            String reg_age =regAge.getText().toString();
            String reg_dob = regDob.getText().toString();
            String reg_blood= regBlood.getText().toString();
            String reg_email= regEmail.getText().toString();
            String reg_frst= regFrst.getText().toString();
            String reg_phn= regPhn.getText().toString();
            String reg_add= regAdd.getText().toString();



            donate reg =new donate(reg_patid,reg_name,reg_age,reg_dob,reg_blood,reg_email,reg_frst,reg_phn,reg_add);

            databaseReference.push().setValue(reg);
            Toast.makeText(donor_card_reg.this, "Done", Toast.LENGTH_SHORT).show();

            btn_donatereg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), Success.class));
                }
            });
    }
}