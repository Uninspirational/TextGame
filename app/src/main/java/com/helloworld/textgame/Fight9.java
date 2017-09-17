package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fight9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight9);

        /*
        Strings.Combatresult = "";
        Strings.Combatresult2 = "";
        Strings.monsterName = "The Dragon Barry Benson's Sleep";
        charstats.monsterhealth = 500;
        charstats.monsterattack = 0;
        charstats.monsterdefense = 1;
        charstats.monsterdexterity = 1;
        charstats.monsterbonus = 1;
        calculator.aftercombatscreen = 9;
        charstats.finalboss = true;


        startActivity(new Intent(Fight9.this, Combat.class));
        */
        TextView text1 = (TextView) findViewById(R.id.Fight9text1);
        text1.setText("You try to attack the sleeping dragon,\n" +
                "yelling and screaming at the top of your lungs.");
        Button button1 = (Button) findViewById(R.id.Fight9button1);
        button1.setText("Continue");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Fight9.this, Adv16.class));
            }
        });
    }
}
