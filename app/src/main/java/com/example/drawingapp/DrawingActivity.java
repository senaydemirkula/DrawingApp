package com.example.drawingapp;
import android.graphics.Color;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DrawingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        CanvasView canvasView = findViewById(R.id.drawingCanvas);

        findViewById(R.id.colorRed).setOnClickListener(v -> canvasView.setColor(Color.RED));
        findViewById(R.id.colorBlue).setOnClickListener(v -> canvasView.setColor(Color.BLUE));
        findViewById(R.id.colorGreen).setOnClickListener(v -> canvasView.setColor(Color.GREEN));
        findViewById(R.id.colorBlack).setOnClickListener(v -> canvasView.setColor(Color.BLACK));
        findViewById(R.id.colorYellow).setOnClickListener(v -> canvasView.setColor(Color.YELLOW));


        findViewById(R.id.brushSmall).setOnClickListener(v -> canvasView.setBrushSize(10f));
        findViewById(R.id.brushMedium).setOnClickListener(v -> canvasView.setBrushSize(20f));
        findViewById(R.id.brushLarge).setOnClickListener(v -> canvasView.setBrushSize(30f));

        findViewById(R.id.clearCanvas).setOnClickListener(v -> canvasView.clearCanvas());

    }

}

