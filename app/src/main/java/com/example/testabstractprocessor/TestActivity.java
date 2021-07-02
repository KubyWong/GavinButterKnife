package com.example.testabstractprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gavin_butterknife_annotation.GavinBindView;

public class TestActivity extends AppCompatActivity {

    @GavinBindView
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}