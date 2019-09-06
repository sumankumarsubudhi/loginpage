package com.example.sumankumarsubudhi.loginpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowCredential(View view) {
        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);

        if ((Username.getText().toString().trim().equals("")) || Password.getText().toString().trim().equals("")) {
            Toast.makeText(getApplicationContext(), "Username/Password is empty", Toast.LENGTH_LONG).show();
        } else {

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("user", Username.getText().toString());
            intent.putExtra("pass", Password.getText().toString());
            startActivity(intent);
        }

    }


}
