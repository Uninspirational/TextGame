package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv3);
        charstats stats = new charstats();
        TextView text1 = (TextView) findViewById(R.id.Adv3text1);
        TextView text2 = (TextView) findViewById(R.id.Adv3text2);
        text1.setText(Strings.line3);
        text2.setText(Strings.line4);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Adv3.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();

        final Button button1 = (Button) findViewById(R.id.Adv3button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv3.this, Fight1.class));
            }
        });

        final Button button2 = (Button) findViewById(R.id.Adv3button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv3.this, Task1.class));
            }
        });



    }
}
