package com.helloworld.textgame;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv2 extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv2);
        TextView text = (TextView) findViewById(R.id.Adv2text);
        text.setText(Strings.line2);

        Button adv2button1 = (Button) findViewById(R.id.adv2button1);
        adv2button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                charstats.upAttack(2);
                startActivity(new Intent(Adv2.this, Adv3.class));
            }
        });
        Button adv2button2 = (Button) findViewById(R.id.adv2button2);
        adv2button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                charstats.upDefense(2);
                startActivity(new Intent(Adv2.this, Adv3.class));
            }
        });
        Button adv2button3 = (Button) findViewById(R.id.adv2button3);
        adv2button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                charstats.upDexterity(2);
                startActivity(new Intent(Adv2.this, Adv3.class));
            }
        });
        Button adv2button4 = (Button) findViewById(R.id.adv2button4);
        adv2button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                charstats.upXP(50);
                startActivity(new Intent(Adv2.this, Adv3.class));
            }
        });

    }
}
