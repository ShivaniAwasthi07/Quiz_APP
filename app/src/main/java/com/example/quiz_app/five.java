package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class five extends AppCompatActivity {
    TextView t;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        b=(Button) findViewById(R.id.button5);
        t=(TextView) findViewById(R.id.textView2);
        t.setText(" Your score is : "+MainActivity.score);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(five.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}