package com.example.administrator.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }

    private void initView() {
        mButton1= (Button) findViewById(R.id.button1);
        mButton2= (Button) findViewById(R.id.button2);
        mButton3= (Button) findViewById(R.id.button3);
        mButton4= (Button) findViewById(R.id.button4);
        mButton5= (Button) findViewById(R.id.button5);
        mButton6= (Button) findViewById(R.id.button6);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                Toast.makeText(this,"This button will launch my Popular Movies app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"This button will launch my Stock Hawk app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this,"This button will launch my Build IT Bigger app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"This button will launch my Make Your APP Material app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(this,"This button will launch my Go Ubiquitous app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(this,"This button will launch my Capstone app",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
