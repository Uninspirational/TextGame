package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight3);

        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "Strange unarmed man";
        charstats.monsterhealth = 15;
        charstats.monsterattack = 2;
        charstats.monsterdefense = 1;
        charstats.monsterdexterity = 4;
        charstats.monsterbonus = 75;
        charstats.health = charstats.tothealth;
        calculator.aftercombatscreen = 2;

        startActivity(new Intent(Fight3.this, Combat.class));

    }
}
