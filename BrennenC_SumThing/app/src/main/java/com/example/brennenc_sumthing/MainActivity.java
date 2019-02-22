package com.example.brennenc_sumthing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.AddBtn);
        Button SubBtn = (Button) findViewById(R.id.SubBtn);
        Button MulBtn = (Button) findViewById(R.id.MulBtn);
        Button DivBtn = (Button) findViewById(R.id.DivBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                Float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                Float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                Float result = num1 +num2;
                resultTextView.setText(result + "");

            }
        });
        SubBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                Float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                Float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                Float result = num1 - num2;
                resultTextView.setText(result + "");

            }
        });
        MulBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                Float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                Float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                Float result = num1 * num2;
                resultTextView.setText(result + "");

            }
        });
        DivBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                Float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                Float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                Float result = num1 / num2;
                resultTextView.setText(result + "");

            }
        });
    }
}
