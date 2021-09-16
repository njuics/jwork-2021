package com.myjava;

public class Calabash extends Creature{
    public Calabash() {
    }

    public Calabash(String name, int hp, int defense, int damage) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.damage = damage;
    }

    public Calabash(String name, int hp, int defense, int damage, String weapon) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.damage = damage;
        this.weapon = weapon;
    }
}
