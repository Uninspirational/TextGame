package com.helloworld.textgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv7 extends AppCompatActivity {
//after you defeat the unarmed man
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv7);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Adv7.this);
        builder1.setMessage("Your current stats are as follows" + charstats.displayall())
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder1.show();
        TextView text1 = (TextView) findViewById(R.id.Adv7text1);
        text1.setText(Strings.Combatresult + "\n" + Strings.line10);

        Button button1 = (Button) findViewById(R.id.Adv7button1);
        button1.setText("Fight");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv7.this, Fight4.class));
            }
        });
    }
}
