package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fbtn = findViewById(R.id.convert_btn);
        Button lbsbtn = findViewById(R.id.convert_btn2);

        EditText finput = findViewById(R.id.fahrenheit_input);
        TextView ctxt = findViewById(R.id.celcius_text);
        EditText lbsinput = findViewById(R.id.pounds_input);
        TextView kgtxt = findViewById(R.id.kilograms_text);


        fbtn.setOnClickListener(v -> {
            if (finput.getText().length() == 0)
                return;
            double celcius = Converter.toCelcius(Float.parseFloat(finput.getText().toString()));
            ctxt.setText(String.format("%.2f ºC", celcius));
        });

        lbsbtn.setOnClickListener(v -> {
            if (lbsinput.getText().length() == 0)
                return;
            double kilograms = Converter.toKilograms(Float.parseFloat(lbsinput.getText().toString()));
            kgtxt.setText(String.format("%.2f kg", kilograms));
        });
    }
}