package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fight1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight1);
        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        final Button button1 = (Button) findViewById(R.id.Fight1button1);
        final TextView text1 = (TextView) findViewById(R.id.Fight1text1);
        Strings.monsterName = "Starving Wolf";
        charstats.monsterhealth = 10;
        charstats.monsterattack = 1;
        charstats.monsterdefense = 1;
        charstats.monsterdexterity = 1;
        charstats.monsterbonus = 50;
        charstats.health = charstats.tothealth;
        calculator.aftercombatscreen = 0;
        button1.setText("Continue");

        text1.setText(Strings.Fight1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Fight1.this, Combat.class));
            }
        });

    }
}
