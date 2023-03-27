package com.example.test_final;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview2 = findViewById(R.id.textView2);
        //10
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                double faranheit = Integer.parseInt(s);
                double celcius = (faranheit - 32) / 1.8;
                textview2.setText("It is =" + celcius +"celcius");
                Toast.makeText(MainActivity.this, "It is = " + celcius +" celcius", Toast.LENGTH_SHORT).show();
            }
        });
    }
}