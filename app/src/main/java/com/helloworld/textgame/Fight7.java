package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight7);

        Strings.monsterName = "Polar bear";
        charstats.monsterhealth = 70;
        charstats.monsterattack = 7;
        charstats.monsterdefense = 5;
        charstats.monsterdexterity = 3;
        charstats.monsterbonus = 250;
        calculator.aftercombatscreen = 6;

        startActivity(new Intent(Fight7.this, Combat.class));
    }
}
