package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);


        final Button button1 = (Button) findViewById(R.id.Task3button1);
        final Button button2 = (Button) findViewById(R.id.Task3button2);
        final Button button3 = (Button) findViewById(R.id.Task3button3);
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        final TextView text1 = (TextView) findViewById(R.id.Task3text1);
        text1.setText(Strings.Task3);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText("You found a nice hat that boosts your dexterity by 5");
                charstats.upDexterity(5);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                charstats.upDexterity(10);
                startActivity(new Intent(Task3.this, Task3P2.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText("You found some vodka someone left behind that gives you 75 XP");
                charstats.upXP(75);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3.this, Adv13.class));
                    }});
            }
        });

    }
}
