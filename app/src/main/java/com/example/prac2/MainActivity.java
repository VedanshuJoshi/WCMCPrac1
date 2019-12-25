package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.add);
        e1=(EditText) findViewById(R.id.a);
        e2=(EditText) findViewById(R.id.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Enter All Values", Toast.LENGTH_LONG).show();
                }
                else{
                    int a= Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());
                    int c=a+b;
                    String str= Integer.toString(c);
                    Toast.makeText(getApplicationContext(),str , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
