package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv14);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(Adv14.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();

        TextView text1 = (TextView) findViewById(R.id.Adv14text1);
        text1.setText(Strings.line17);
        Button button1 = (Button) findViewById(R.id.Adv14button1);
        Button button2 = (Button) findViewById(R.id.Adv14button2);

        button1.setText("Sleep");
        button2.setText("Wander");


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv14.this, Adv15.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv14.this, Task4.class));
            }
        });

    }
}
