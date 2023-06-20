package com.example.ejercicio_individual_6;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textLastName;
        EditText textMail;
        EditText textPass;

        textName = findViewById(R.id.textName);
        textLastName = findViewById(R.id.textLastName);
        textMail = findViewById(R.id.textMail);
        textPass = findViewById(R.id.textPass);

        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String email = textMail.getText().toString();
                String pass = textPass.getText().toString();

                if (name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@")) {
                    makeText(getBaseContext(), "faltan campos por completar", LENGTH_SHORT).show();
                    return;
                }
                String texto = "Usuario" + name + " " + lastName + " " + "Email" + " " + pass;
                makeText(getBaseContext(), texto, LENGTH_LONG).show();
            }
        });








    }
}