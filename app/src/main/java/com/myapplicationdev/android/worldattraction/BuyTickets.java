package com.myapplicationdev.android.worldattraction;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BuyTickets extends AppCompatActivity {

    ImageView ivLogo2, ivAttraction;
    TextView tvDescription;
    Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_tickets);

        ivLogo2 = findViewById(R.id.ivLogo2);
        ivAttraction = findViewById(R.id.ivAttraction);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuyTickets.this, BuyTickets.class) {
                    intent.putExtra("Unversial Studios");
                    startActivty(intent);
                };
            }
        });
    }
}
