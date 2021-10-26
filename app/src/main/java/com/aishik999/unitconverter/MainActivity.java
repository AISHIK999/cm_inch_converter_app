package com.aishik999.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;  //sets private variable of the components of the XML
private TextView textView;
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.convert);    //variable = findViewById(R.id.<id of the variable as set in XML file>);
        textView = findViewById(R.id.numOutput);
        editText = findViewById(R.id.numInput);

        //set operations after button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "test toast", Toast.LENGTH_SHORT).show(); //shows toast
                //set what happens when button is clicked
                String s = editText.getText().toString();
                int cm = Integer.parseInt(s);
                double in = 0.393701 * cm;
                textView.setText("The corresponding value in inch is: " + in);

            }
        });

    }
}