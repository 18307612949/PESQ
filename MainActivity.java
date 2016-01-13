package com.bmstu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private String kit = "Hello, Kitty!";
    private String world = "Hello, World!";
    private int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView);
        mHelloTextView.setText(world);
    }


    public void onClick(View view) {
        String s = String.valueOf(k);
        mHelloTextView.setText("кошек всего " + s);
        k++;
    }
}
