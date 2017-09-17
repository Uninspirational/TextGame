package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight8);

        Strings.monsterName = "Giant Koala";
        charstats.monsterhealth = 100;
        charstats.monsterattack = 3;
        charstats.monsterdefense = 6;
        charstats.monsterdexterity = 10;
        charstats.monsterbonus = 300;
        calculator.aftercombatscreen = 7;

        startActivity(new Intent(Fight8.this, Combat.class));
    }
}
