package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Fourth extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1=(Button) findViewById(R.id.button4);
        r1=(RadioButton) findViewById(R.id.radioButton13);
        r2=(RadioButton) findViewById(R.id.radioButton14);
        r3=(RadioButton) findViewById(R.id.radioButton15);
        r4=(RadioButton) findViewById(R.id.radioButton16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r3.isChecked())
                    ++MainActivity.score;
                else
                    --MainActivity.score;
                Intent i=new Intent(Fourth.this,five.class);
                startActivity(i);
                finish();
            }
        });
    }
}