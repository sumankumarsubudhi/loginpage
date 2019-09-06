package com.example.sumankumarsubudhi.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView username_txt, password_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        username_txt = (TextView) findViewById(R.id.textView1);
        username_txt.setText(getIntent().getStringExtra("user"));

        password_txt = (TextView) findViewById(R.id.textView2);
        password_txt.setText(getIntent().getStringExtra("pass"));

    }

    public void GoBack(View view)
    {

        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
