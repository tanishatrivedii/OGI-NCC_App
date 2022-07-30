package com.example.ogi_ncc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class nccHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncc_home);
    }
    public void about(View view){
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

    public void aim(View view){
        Intent intent = new Intent(this, aim.class);
        startActivity(intent);
    }

    public void pledge(View view){
        Intent intent = new Intent(this, pledge.class);
        startActivity(intent);
    }

    public void achievements(View view){
        Intent intent = new Intent(this, achievements.class);
        startActivity(intent);
    }
}