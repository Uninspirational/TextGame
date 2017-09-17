package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight10);


        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "The Dragon Barry Benson";
        charstats.monsterhealth = 1000;
        charstats.monsterattack = 100;
        charstats.monsterdefense = 50;
        charstats.monsterdexterity = 75;
        charstats.monsterbonus = 1000000;
        calculator.aftercombatscreen = 8;

        startActivity(new Intent(Fight10.this, Combat.class));
    }
}
