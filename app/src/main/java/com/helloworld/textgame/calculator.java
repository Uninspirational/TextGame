package com.helloworld.textgame;

import java.util.Random;

/**
 * Created by william on 9/16/17.
 */

public class calculator {
    public static int aftercombatscreen = 0;
    public boolean monsterattacked = false;
    public boolean monsterdefended = false;
    public boolean monsterdodged = false;
    public int attackdamage(int statbonus, int baseattack) {
        Random r = new Random();
        return r.nextInt(statbonus + baseattack);
    }
    public boolean trydodge(int dodgestat, int attack) {
        Random r = new Random();
        return (r.nextInt(dodgestat) > attack);
    }
    public int defensedamage(int defenderdef, int attackerattack) {
        int i = defenderdef - attackerattack;
        if (i < 0) {
            i = 0;
        }
        return i;
    }
    public int heal(int def) {
        Random R = new Random();
        return R.nextInt(def);
    }
    public static int monsterchoice() {
        Random r = new Random();
        return r.nextInt(3);
    }
}
