package com.example.multiactivitesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","MainActivity resumed.");
    }

    private Button signin;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","MainActivity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","MainActivity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","MainActivity destroyed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>","MainActivity created.");

        signin = findViewById(R.id.signinbutton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Sign in button pressed.");

            }
        });


        }
    }


