package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight5);
        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "Not Starving Wolf";
        charstats.monsterhealth = 20;
        charstats.monsterattack = 4;
        charstats.monsterdefense = 3;
        charstats.monsterdexterity = 3;
        charstats.monsterbonus = 120;
        calculator.aftercombatscreen = 4;
        charstats.health = charstats.tothealth;

        startActivity(new Intent(Fight5.this, Combat.class));

    }
}
