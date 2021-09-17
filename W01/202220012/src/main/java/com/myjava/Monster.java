package com.myjava;

public class Monster extends Creature {
    int magic;

    public Monster() {
    }

    public Monster(String name, int hp, int defense, int damage, String weapon, int magic) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.damage = damage;
        this.weapon = weapon;
        this.magic = magic;
    }

    @Override
    public void attack(Creature creature) {
        System.out.println(this.getName() + " attacks " + creature.getName());
        creature.receiveAttack(this.getDamage() * magic);
    }

    public void rollEyes() {
        System.out.println(this.getName() + " rolls eyes");
    }
}
