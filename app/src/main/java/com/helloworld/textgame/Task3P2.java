package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task3P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3_p2);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Task3P2.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();

        final Button button1 = (Button) findViewById(R.id.Task3P2button1);
        final Button button2 = (Button) findViewById(R.id.Task3P2button2);
        final Button button3 = (Button) findViewById(R.id.Task3P2button3);
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        final TextView text1 = (TextView) findViewById(R.id.Task3P2text1);
        text1.setText(Strings.Task3P2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                charstats.upXP(500);
                startActivity(new Intent(Task3P2.this, Task3P3.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText("You find a stick that increases your attack by 5");
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");

                charstats.upAttack(5);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                charstats.upDefense(5);
                text1.setText("You find a piece of driftwood that increases your defense by 5");
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task3P2.this, Adv13.class));
                    }});
            }
        });
    }
}
