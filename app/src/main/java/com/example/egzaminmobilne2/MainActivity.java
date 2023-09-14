package com.example.egzaminmobilne2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        TextView textALert = findViewById(R.id.textAlert);
        EditText textEmail = findViewById(R.id.textEmail);
        EditText textPass1 = findViewById(R.id.textPass1);
        EditText textPass2 = findViewById(R.id.textPass2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = textEmail.getText().toString();
                String pass1 = textPass1.getText().toString();
                String pass2 = textPass2.getText().toString();
                if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    if(pass1.equals(pass2)){
                        textALert.setText("WItaj "+ email);
                    } else {
                        textALert.setText("Hasła się róźnią");
                    }
                } else{
                    textALert.setText("Nieprawidłowy email!");

                }
            }
        });
    }
}