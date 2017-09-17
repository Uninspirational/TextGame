package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task3P3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3_p3);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(Task3P3.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();

        final Button button1 = (Button) findViewById(R.id.Task3P3button1);

        final TextView text1 = (TextView) findViewById(R.id.Task3P3text1);

        text1.setText("You secretly steal and drink some valuable looking booze.\n" +
                "You don't know what it is but it was pretty good.\n" +
                "It also gave you 500 XP");
        button1.setText("Continue");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Task3P3.this, Adv13.class));
            }});
    }
}
