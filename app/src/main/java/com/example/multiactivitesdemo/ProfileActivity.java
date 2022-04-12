package com.example.multiactivitesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    private Button signout_button;
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
        Log.d("==>","ProfileActivity created.");
        signout_button = findViewById(R.id.button);

        Intent intent= getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>", "Username from intent:" + username);

        signout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign Out");
            }
        });
    }

}