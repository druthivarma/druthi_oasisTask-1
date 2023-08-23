package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText kgEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize your views and set click listeners here

        kgEditText = findViewById(R.id.kgEditText);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertKgToPounds();
            }
        });
    }

    private void convertKgToPounds() {
        try {
            double kilograms = Double.parseDouble(kgEditText.getText().toString());
            double pounds = kilograms * 2.20462; // 1 kg = 2.20462 lbs
            resultTextView.setText(kilograms + " kg = " + pounds + " lbs");
        } catch (NumberFormatException e) {
            resultTextView.setText("Invalid input. Please enter a number.");
        }
    }
}
