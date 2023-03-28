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
        //100
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int b=1;
                double faranheit = 0;
                double celcius=0;
                try {

                    faranheit = Integer.parseInt(s);
                    celcius = (faranheit - 32) / 1.8;

                } catch (NumberFormatException e) {
                    b=0;
                    System.err.println(faranheit + " is not a number.");
                }
              if(b==1){
                    textview2.setText("It is =" + celcius +"celcius");
                    Toast.makeText(MainActivity.this, "It is = " + celcius +" celcius", Toast.LENGTH_SHORT).show();
                }
              else{
                  System.out.println("enter proper input to convert");
              }

            }
        });
    }
}