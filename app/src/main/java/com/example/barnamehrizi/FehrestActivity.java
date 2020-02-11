package com.example.barnamehrizi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class FehrestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fehrest);

        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text3);
        TextView textView4 = findViewById(R.id.text4);
        TextView textView4a = findViewById(R.id.texta4);
        TextView textView5 = findViewById(R.id.text5);
        TextView textView6 = findViewById(R.id.text6);
        TextView textView7 = findViewById(R.id.text7);
        TextView textView8 = findViewById(R.id.text8);
        TextView textView9 = findViewById(R.id.text9);
        TextView textView10 = findViewById(R.id.text10);
        TextView textView11 = findViewById(R.id.text11);
        TextView textView12 = findViewById(R.id.text12);
        TextView textView13 = findViewById(R.id.text13);
        TextView textView14 = findViewById(R.id.text14);
        TextView textView15 = findViewById(R.id.text15);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, Nokte8Activity.class);
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, MakanmotaleActivity.class);
                startActivity(intent);
            }
        });

        textView4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, MaziyatmoActivity.class);
                startActivity(intent);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, RaveshmotaleahActivity.class);
                startActivity(intent);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, PaskhetanActivity.class);
                startActivity(intent);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, SoratmoActivity.class);
                startActivity(intent);
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, NoktetalaeiActivity.class);
                startActivity(intent);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, OsolbrnamehActivity.class);
                startActivity(intent);
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, HadarvaghtActivity.class);
                startActivity(intent);
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, MorovtekrarActivity.class);
                startActivity(intent);
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, LightnerActivity.class);
                startActivity(intent);
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, ZamanmororActivity.class);
                startActivity(intent);
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, VazeitbadanActivity.class);
                startActivity(intent);
            }
        });
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, HefziyatActivity.class);
                startActivity(intent);
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FehrestActivity.this, DoamotaleaActivity.class);
                startActivity(intent);
            }
        });


    }
}
