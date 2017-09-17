package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fight2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight2);

        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "Random woman";
        charstats.monsterhealth = 1000;
        charstats.monsterattack = 2;
        charstats.monsterdefense = 1000;
        charstats.monsterdexterity = 1;
        charstats.monsterbonus = 50;
        charstats.health = charstats.tothealth;
        charstats.health = charstats.tothealth;
        calculator.aftercombatscreen = 1;

        TextView text1 = (TextView) findViewById(R.id.Fight2text1);
        text1.setText(Strings.Fight2);
        final Button button1 = (Button) findViewById(R.id.Fight2button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Fight2.this, Combat.class));
            }
        });

    }
}
