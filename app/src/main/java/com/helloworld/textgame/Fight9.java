package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight9);

        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "The Dragon Barry Benson's Sleep";
        charstats.monsterhealth = 500;
        charstats.monsterattack = 0;
        charstats.monsterdefense = 1;
        charstats.monsterdexterity = 1;
        charstats.monsterbonus = 0;
        calculator.aftercombatscreen = 8;
        charstats.finalboss = true;

        startActivity(new Intent(Fight9.this, Combat.class));
    }
}
