package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        sum = 0;
    }

    public void sum(View view) {
        if (sum < 6) {
            sum++;
            button.setText("This is a click number:" + sum);
        }
        else {
                button.setText("Enough to click. Go to new start!");
                sum = 0;
            }
        }
    }