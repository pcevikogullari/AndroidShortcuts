package com.pamir.shortcuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String ACTION_1 = "action1";
    private final static String ACTION_2 = "action2";
    private final static String ACTION_3 = "action3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textview);

        switch (getIntent().getAction()){
            case ACTION_1:
                textView.setText(ACTION_1);
                break;
            case ACTION_2:
                textView.setText(ACTION_2);
                break;
            case ACTION_3:
                textView.setText(ACTION_3);
                break;
            default:
                break;
        }
    }
}
