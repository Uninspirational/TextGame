package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight4);

        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "Strange swordman";
        charstats.monsterhealth = 10;
        charstats.monsterattack = 4;
        charstats.monsterdefense = 2;
        charstats.monsterdexterity = 5;
        charstats.monsterbonus = 100;
        calculator.aftercombatscreen = 3;

        startActivity(new Intent(Fight4.this, Combat.class));
    }
}
