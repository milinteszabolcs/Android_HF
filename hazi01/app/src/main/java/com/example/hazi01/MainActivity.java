package com.example.hazi01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1 = findViewById(R.id.szam1);
        final EditText szam2 = findViewById(R.id.szam2);
        final TextView ossz=findViewById(R.id.eredmeny1);
        final TextView kivonas=findViewById(R.id.eredmeny2);
        final TextView szorzas=findViewById(R.id.eredmeny3);
        final TextView osztas=findViewById(R.id.eredmeny4);
        Button gomb1 = findViewById(R.id.button);
        Button gomb2 = findViewById(R.id.button2);
        Button gomb3 = findViewById(R.id.button3);
        Button gomb4 = findViewById(R.id.button4);

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                ossz.setText(Double.toString(osszeg));
            }
        });

        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kivon = Double.parseDouble(szam1.getText().toString()) - Double.parseDouble(szam2.getText().toString());
                kivonas.setText(Double.toString(kivon));
            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double szoroz = Double.parseDouble(szam1.getText().toString()) * Double.parseDouble(szam2.getText().toString());
                szorzas.setText(Double.toString(szoroz));
            }
        });
        gomb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oszt = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                osztas.setText(Double.toString(oszt));
            }
        });
    }
}