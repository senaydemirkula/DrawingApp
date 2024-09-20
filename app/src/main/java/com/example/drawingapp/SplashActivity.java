package com.example.drawingapp;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
            getWindow().getInsetsController().hide(WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_SWIPE);
        }


        TextView appName = findViewById(R.id.appName);
        appName.post(() -> {
            float startX = appName.getWidth();
            ObjectAnimator animation = ObjectAnimator.ofFloat(appName, "translationX", startX, 0f);
            animation.setDuration(1000);
            animation.start();
        });


        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(SplashActivity.this, DrawingActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
