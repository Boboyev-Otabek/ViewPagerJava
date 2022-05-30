package com.example.viewpagerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        Button b_open=findViewById(R.id.b_open);
        b_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPegerActivity();
            }
        });
    }
    void openViewPegerActivity(){
        Intent intent=new Intent(this, ViewPegerActivity.class);
        startActivity(intent);
    }
}