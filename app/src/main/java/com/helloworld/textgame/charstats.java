package com.helloworld.textgame;

/**
 * Created by william on 9/16/17.
 */

public class charstats {
    public static int attack = 1000;
    public static int defense = 1;
    public static int dexterity = 1;
    public static int health = 10;
    public static int tothealth = 10;
    public static int xp = 0;
    public static int xpcap = 100;
    public static int level = 0;

    public static int monsterattack = 1;
    public static int monsterdefense = 1;
    public static int monsterdexterity = 1;
    public static int monsterhealth = 1;
    public static int monsterbonus = 0;
    public static boolean finalboss = false;


    public static void upAttack(int i) {
        attack += i;
    }

    public static void upDefense(int i) {
        defense += i;
    }

    public static void upDexterity(int i) {
        dexterity += i;
    }

    public static void upHealth(int i) {
        tothealth += i;
        health += i;
    }
    public static void heal(int i) {
        health += i;
        if (health > tothealth) {
            health = tothealth;
        }
    }
    public static void mheal(int i) {
        monsterhealth += i;
    }
    public static void upXP(int i) {
        xp += i;
        while(xp >= xpcap) {
            xp -= xpcap;
            level += 1;
            attack += 2;
            defense += 2;
            dexterity += 2;
            tothealth += 10;
            health = tothealth;
            xpcap += level * 75;
        }
    }

    public static void upLevel(int i ) {
        level += i;
    }

    public static String displayall() {
        return "\n\n" +
                "Level: " + level +
                "\nXP: " + xp + "/" + xpcap +
                "\nAttack: " + attack +
                "\nDefense: " + defense +
                "\nDexterity: " + dexterity +
                "\nHealth: " + health + "/" + tothealth;
    }
}
