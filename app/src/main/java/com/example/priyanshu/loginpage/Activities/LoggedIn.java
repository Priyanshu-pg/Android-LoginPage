package com.example.priyanshu.loginpage.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanshu.loginpage.R;

public class LoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        getSupportActionBar().hide();

    }
}
