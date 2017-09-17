package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.helloworld.textgame.Strings.monsterName;

public class Combat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat);

        final Button button1 = (Button) findViewById(R.id.Combat1button1);
        final Button button2 = (Button) findViewById(R.id.Combat1button2);
        final Button button3 = (Button) findViewById(R.id.Combat1button3);

        final TextView text1 = (TextView) findViewById(R.id.Combat1text1);
        final TextView text2 = (TextView) findViewById(R.id.Combat1text2);
        final TextView text3 = (TextView) findViewById(R.id.Combat1text3);
        final TextView text4 = (TextView) findViewById(R.id.Combat1text4);

        text1.setText(Strings.monsterName);
        text2.setText(Strings.Combat1);

        button1.setText("Attack");
        button2.setText("Dodge");
        button3.setText("Defend");

        text3.setText(Strings.Combatresult);

        final calculator calc = new calculator();

        if(charstats.monsterhealth <= 0) {
            charstats.upXP(charstats.monsterbonus);
            Strings.Combatresult = "You defeated the " + monsterName + " and gained " + charstats.monsterbonus + " XP!";
            startActivity(new Intent(Combat.this, AfterCombat.class));
        }

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Attack
                int monsterchoice = calculator.monsterchoice();
                int temp;
                int heal;
                if(monsterchoice == 0) {
                    //monster tried to attack
                    calc.monsterattacked = true;
                }
                else if(monsterchoice == 1) {
                    //monster tried to dodge
                    calc.monsterdodged = true;
                }
                else {
                    //monster tried to defend
                    calc.monsterdefended = true;
                }

                if(calc.monsterdefended) {
                    heal = calc.heal(charstats.monsterdefense);
                    temp = 3 + calc.defensedamage(charstats.monsterdefense, charstats.attack);
                    charstats.monsterhealth -= temp;
                    charstats.mheal(heal);
                    Strings.Combatresult = "" + "The " + Strings.monsterName + " defended and took " + temp + " damage!\n" +
                            "It gained " + heal + " hp for defending!\n";
                }

                else if(calc.monsterdodged) {
                    temp = calc.attackdamage(charstats.attack, 5) * 2;
                    if(!calc.trydodge(charstats.monsterdexterity, charstats.attack)) {
                        charstats.monsterhealth -= temp;
                        Strings.Combatresult = ("" + "The " + Strings.monsterName + " failed to dodge and took " + temp + " critical damage!\n");

                    }
                    else {
                        Strings.Combatresult = ("" + "The " + Strings.monsterName + " dodged " + temp + " damage!\n");
                    }

                }
                else  {
                    temp = 3 + calc.attackdamage(charstats.attack, 5);
                    charstats.monsterhealth -= temp;
                    Strings.Combatresult = ("" + "The " + Strings.monsterName + " took " + temp + " damage!\n");
                }
                if (calc.monsterattacked) {
                    temp = calc.attackdamage(charstats.monsterattack, 0);
                    charstats.health -= temp;
                    Strings.Combatresult += "\nThe " + Strings.monsterName + " attacked and dealt " + temp + " damage!";
                }
                startActivity(new Intent(Combat.this, Combat.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Dodge
                int monsterchoice = calculator.monsterchoice();
                int temp;
                int heal;
                if(monsterchoice == 0) {
                    //monster tried to attack
                    calc.monsterattacked = true;
                }
                else if(monsterchoice == 1) {
                    //monster tried to dodge
                    calc.monsterdodged = true;
                }
                else {
                    //monster tried to defend
                    calc.monsterdefended = true;
                }
                if(calc.monsterattacked) {
                    temp = calc.attackdamage(charstats.monsterattack, 0);

                    if(!calc.trydodge(charstats.dexterity, charstats.monsterattack)) {
                        charstats.health -= temp;
                        Strings.Combatresult = ("You failed to dodge and took " + temp + " damage!\n");
                    }
                    else {
                        Strings.Combatresult = ("You dodged " + temp + " damage!\n");
                    }

                }
                else {
                    Strings.Combatresult = ("You dodged but " + Strings.monsterName + " didn't attack!\n");
                }
                if(calc.monsterdefended) {
                    heal = calc.heal(charstats.monsterdefense);
                    temp = calc.defensedamage(charstats.monsterdefense, charstats.attack);
                    charstats.monsterhealth -= temp;
                    charstats.mheal(heal);
                    Strings.Combatresult += " It gained " + heal + " hp for defending!\n";
                }
                startActivity(new Intent(Combat.this, Combat.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Defend
                int monsterchoice = calculator.monsterchoice();
                int temp;
                int heal;
                if(monsterchoice == 0) {
                    //monster tried to attack
                    calc.monsterattacked = true;
                }
                else if(monsterchoice == 1) {
                    //monster tried to dodge
                    calc.monsterdodged = true;
                }
                else {
                    //monster tried to defend
                    calc.monsterdefended = true;
                }
                if(calc.monsterattacked) {
                    temp = calc.defensedamage(charstats.defense, charstats.monsterattack);
                    charstats.health -= temp;
                    heal = calc.heal(charstats.defense);
                    charstats.heal(heal);
                    Strings.Combatresult = ("You took " + temp + " damage!\n" +
                            "You gained " + heal + " health for defending");

                }
                else {
                    heal = calc.heal(charstats.defense);
                    charstats.heal(heal);
                    Strings.Combatresult = ("You defended but " + Strings.monsterName + " didn't attack!\n" +
                            "You gained " + heal + " health for defending");
                }
                if(calc.monsterdefended) {
                    heal = calc.heal(charstats.monsterdefense);
                    temp = calc.defensedamage(charstats.monsterdefense, charstats.attack);
                    charstats.monsterhealth -= temp;
                    charstats.mheal(heal);
                    Strings.Combatresult += "It gained " + heal + " hp for defending!\n";
                }
                startActivity(new Intent(Combat.this, Combat.class));


            }
        });
        if(charstats.health <= 0) {
            startActivity(new Intent(Combat.this, Death.class));
        }


        text2.setText("Your current health: " + charstats.health +
                "\nYour attack stat: " + charstats.attack +
                "\nYour defense stat: " + charstats.defense +
                "\nYour dexterity stat: " + charstats.dexterity +
                "\nYour current level: " + charstats.level +
                "\nYour current XP: " + charstats.xp + "/" + charstats.xpcap + "\n\n" +
                Strings.monsterName + "'s health: " + charstats.monsterhealth + "\n" +
                Strings.monsterName + "'s attack stat: " + charstats.monsterattack + "\n" +
                Strings.monsterName + "'s defense stat: " + charstats.monsterdefense + "\n" +
                Strings.monsterName + "'s dexterity stat: " + charstats.monsterdexterity);

    }
}
