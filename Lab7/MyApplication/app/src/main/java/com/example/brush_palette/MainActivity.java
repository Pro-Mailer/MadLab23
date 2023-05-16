package com.example.brush_palette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isPalette=true;
    public void change (View view)
    {
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView4 = findViewById(R.id.imageView4);
        if(isPalette)
        {
            imageView4.animate().alpha(0).setDuration(2500);
            imageView.animate().alpha(1).setDuration(2500).rotation(36);
            isPalette=false;
        }
        else
        {
            imageView4.animate().alpha(1).setDuration(2500);
            imageView.animate().alpha(0).setDuration(2500).rotation(0);
            isPalette=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
    }
}