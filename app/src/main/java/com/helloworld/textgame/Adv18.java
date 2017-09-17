package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv18);

        final TextView text1 = (TextView) findViewById(R.id.Adv18text1);
        text1.setText(Strings.line23);

        final Button button1 = (Button) findViewById(R.id.Adv18button1);
        final Button button2 = (Button) findViewById(R.id.Adv18button2);
        button1.setText("Eat");
        button2.setText("Steal");

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv18.this, Adv19.class));
                charstats.upXP(1000000);
                charstats.upAttack(1000);
                charstats.upDefense(1000);
                charstats.upHealth(1000);
                charstats.upDexterity(1000);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv18.this, Adv20.class));
            }
        });

    }
}
