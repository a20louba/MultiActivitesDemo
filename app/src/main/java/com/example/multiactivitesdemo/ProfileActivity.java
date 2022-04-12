package com.example.multiactivitesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","ProfileActivity resumed.");
    }

    private Button signin;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","ProfileActivity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","ProfileActivity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","ProfileActivity destroyed.");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

}