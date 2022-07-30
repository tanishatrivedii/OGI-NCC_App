package com.example.ogi_ncc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    int[] images= {R.drawable.n1,R.drawable.n32,
            R.drawable.n2, R.drawable.n3, R.drawable.n4,
            R.drawable.n5, R.drawable.n6, R.drawable.n7,
            R.drawable.n8, R.drawable.n9, R.drawable.n10,
            R.drawable.n12, R.drawable.n13, R.drawable.n14,
            R.drawable.n11, R.drawable.n15, R.drawable.n16,
            R.drawable.n17, R.drawable.n18, R.drawable.n19,
            R.drawable.n20, R.drawable.n21, R.drawable.n24,
            R.drawable.n22, R.drawable.n23, R.drawable.n25,
            R.drawable.n26, R.drawable.n27, R.drawable.n28,
            R.drawable.n29, R.drawable.n30, R.drawable.n31};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // image sliding
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

    //screen1---ncc home
    public void nccHome(View view){
        Intent intent = new Intent(this, nccHomeActivity.class);
        startActivity(intent);
    }

    //screen2---Notice and Forms
    public void notice(View view){
        Intent intent = new Intent(this, notice.class);
        startActivity(intent);
    }

    //screen3--- Syllabus and PDF's
    public void syllabus(View view){
        Intent intent = new Intent(this, syllabus.class);
        startActivity(intent);
    }

    //screen4--- Our Cadets
    public void cadets(View view){
        Intent intent = new Intent(this, cadets.class);
        startActivity(intent);
    }

    //screen5--- Gallery
    public void gallery(View view){
        Intent intent = new Intent(this, gallery.class);
        startActivity(intent);
    }

    //screen6--- Camps
    public void camps(View view){
        Intent intent = new Intent(this, camps.class);
        startActivity(intent);
    }

    //screen7--- FAQ's
    public void faq(View view){
        Intent intent = new Intent(this, faq.class);
        startActivity(intent);
    }

}