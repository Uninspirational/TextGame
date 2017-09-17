package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task2P4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2_p4);

        final TextView text1 = (TextView) findViewById(R.id.Task2P4text1);
        text1.setText(Strings.Task2P4);

        charstats.upXP(75);

        Button button1 = (Button) findViewById(R.id.Task2P4button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Task2P4.this, Adv6.class));
            }
        });
    }
}
