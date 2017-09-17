package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AfterCombat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_combat);
        switch(calculator.aftercombatscreen) {
            case 0:
                startActivity(new Intent(AfterCombat.this, Adv5.class));
                break;
            case 1:
                startActivity(new Intent(AfterCombat.this, Adv6.class));
                break;
            case 2:
                startActivity(new Intent(AfterCombat.this, Adv7.class));
                break;
            case 3:
                startActivity(new Intent(AfterCombat.this, Adv8.class));
                break;
            case 4:
                startActivity(new Intent(AfterCombat.this, Fight6.class));
                break;
            case 5:
                startActivity(new Intent(AfterCombat.this, Fight7.class));
                break;
            case 6:
                startActivity(new Intent(AfterCombat.this, Fight8.class));
                break;
            case 7:
                startActivity(new Intent(AfterCombat.this, Adv14.class));
                break;
            case 8:
                startActivity(new Intent(AfterCombat.this, Adv21.class));
                break;
            default:
                startActivity(new Intent(AfterCombat.this, Death.class));
                break;
        }
    }
}
