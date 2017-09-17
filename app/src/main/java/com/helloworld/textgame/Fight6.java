package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight6);

        Strings.monsterName = "Three Dog Amalgamation";
        charstats.monsterhealth = 50;
        charstats.monsterattack = 5;
        charstats.monsterdefense = 7;
        charstats.monsterdexterity = 1;
        charstats.monsterbonus = 200;
        calculator.aftercombatscreen = 5;

        startActivity(new Intent(Fight6.this, Combat.class));
    }
}
