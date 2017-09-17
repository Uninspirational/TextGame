package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task1P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1_p2);
        final Button button1 = (Button) findViewById(R.id.Task1P2button1);
        final Button button2 = (Button) findViewById(R.id.Task1P2button2);
        final Button button3 = (Button) findViewById(R.id.Task1P2button3);
        final TextView text1 = (TextView) findViewById(R.id.Task1P2text1);
        text1.setText(Strings.line7);
        button1.setText("Go left");
        button2.setText("Go straight");
        button3.setText("Go right");
        button1.setText("Left");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.Task1);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                charstats.attack += 4;
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
            }
        });
        button2.setText("Turn back");
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.failedTask1);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
            }
        });
        button3.setText("Right");
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.failedTask1);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1P2.this, Adv5.class));
                    }});
            }
        });
    }
}
