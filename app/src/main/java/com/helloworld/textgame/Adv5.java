package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.id.button1;

public class Adv5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv5);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Adv5.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();
        Strings words = new Strings();
        TextView text1 = (TextView) findViewById(R.id.Adv5text1);
        text1.setText(words.Combatresult + "\n" + Strings.line8);
        final Button button1 = (Button) findViewById(R.id.Adv5button1);
        final Button button2 = (Button) findViewById(R.id.Adv5button2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv5.this, Fight2.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv5.this, Task2.class));
            }
        });



    }
}
