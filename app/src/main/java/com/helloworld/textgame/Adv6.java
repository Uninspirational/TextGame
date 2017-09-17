package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv6);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(Adv6.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();

        TextView text1 = (TextView) findViewById(R.id.Adv6text1);
        text1.setText(Strings.line9);
        final Button button1 = (Button) findViewById(R.id.Adv6button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv6.this, Fight3.class));
            }
        });
    }
}
