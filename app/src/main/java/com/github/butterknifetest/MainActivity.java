package com.github.butterknifetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt1)
    Button bt1;
    @BindView(R.id.bt2)
    Button bt2;
    @BindView(R.id.bt3)
    Button bt3;
    @BindView(R.id.bt4)
    Button bt4;
    @BindView(R.id.bt5)
    Button bt5;
    @BindView(R.id.bt6)
    Button bt6;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt1:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.bt2:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.bt3:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.bt4:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.bt5:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.bt6:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
        }
    }
}
