package com.example.ejercicio_individual_6;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio_individual_6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

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