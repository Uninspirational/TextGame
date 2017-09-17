package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);

        final TextView text1 = (TextView) findViewById(R.id.Task4text1);
        text1.setText(Strings.line18);
        final Button button1 = (Button) findViewById(R.id.Task4button1);
        final Button button2 = (Button) findViewById(R.id.Task4button2);
        final Button button3 = (Button) findViewById(R.id.Task4button3);
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText("You eat some strange berries that increase your max health by 50");
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");

                charstats.upHealth(50);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                charstats.upXP(1000);
                text1.setText("You eat some strange mushrooms that give you 1000 xp");
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task4.this, Task4P2.class));
                    }});
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Task4.this, Adv15.class));
            }
        });
    }
}
