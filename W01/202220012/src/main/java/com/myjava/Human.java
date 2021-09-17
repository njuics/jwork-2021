package com.myjava;

public class Human extends Creature {
    public Human() {
    }

    public Human(String name, int hp, int defense, int damage) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.damage = damage;
    }

    public void hug(Creature creature) {
        System.out.println(this.name + " hugs " + creature.name);
    }
}
