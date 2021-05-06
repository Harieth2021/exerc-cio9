package com.example.exerci9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text_euros;
    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_euros=findViewById(R.id.edt_valoreEuros);
        bt1=findViewById(R.id.btn_kwanza);
        bt2=findViewById(R.id.btn_real);
        bt3=findViewById(R.id.btn_dolar);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vEuros =Double.parseDouble(text_euros.getText().toString());
                double vKwanza=vEuros *300;
                Toast.makeText(MainActivity.this, vEuros+""+ vKwanza+"kz", Toast.LENGTH_SHORT);

            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vEuros =Double.parseDouble(text_euros.getText().toString());
                double vReal=vEuros *4.4;
                Toast.makeText(MainActivity.this, vEuros+"€ São"+ vReal+"R$", Toast.LENGTH_SHORT).show();

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vEuros =Double.parseDouble(text_euros.getText().toString());
                double vDolar=vEuros *1.20;
                Toast.makeText(MainActivity.this, vEuros+"€ São"+ vDolar+"$", Toast.LENGTH_SHORT).show();


            }
        });

    }
}