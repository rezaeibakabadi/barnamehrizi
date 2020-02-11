package com.example.barnamehrizi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/badrb.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_main);
        LinearLayout linearLayout1 = findViewById(R.id.linear1);
        LinearLayout linearLayout2 = findViewById(R.id.linear2);
        LinearLayout linearLayout3 = findViewById(R.id.linear3);
        LinearLayout linearLayout4 = findViewById(R.id.linear4);
        LinearLayout linearLayout5 = findViewById(R.id.linear5);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FehrestActivity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, FavActivity.class);
                startActivity(intent1);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SourcesActivity.class);
                startActivity(intent2);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent3);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, ExitActivity.class);
                startActivity(intent4);
            }
        });

    }
}
