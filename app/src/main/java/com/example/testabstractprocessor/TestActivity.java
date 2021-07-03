package com.example.testabstractprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gavin_butterknife.GavinButterKnife;
import com.example.gavin_butterknife_annotation.GavinBindView;

public class TestActivity extends AppCompatActivity {

    @GavinBindView(R.id.textView)
    public TextView textView;
    @GavinBindView(R.id.textView2)
    public TextView textViewxx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        new TestActivity$ViewBinder().bind(this);
        textView.setText("没有手动findById");
        textViewxx.setText("未封装api，直接使用Javapoet生成的类");
    }
}