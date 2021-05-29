package com.myapplicationdev.android.worldattraction;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    ImageView iv2, ivFt1, ivFt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        iv2 = findViewById(R.id.iv2);
        ivFt1 = findViewById(R.id.ivFt1);
        ivFt2 = findViewById(R.id.ivFt2);
    }
}
