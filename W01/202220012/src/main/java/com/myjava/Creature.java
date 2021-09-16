package com.myjava;

public class Creature extends Being {
    int hp;
    int defense;
    int damage;
    String weapon;

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        System.out.println(this.getName() + " gets a weapon " + weapon);
        this.weapon = weapon;
    }

    public void speak(Creature creature, String sentence) {
        System.out.println(this.name + ": I speak to " + creature.getName() + " -- " + sentence);
        creature.hear(this, sentence);
    }

    public void hear(Creature creature, String sentence) {
        System.out.println(this.name + ": I hear " + creature.getName() + " said -- " + sentence);
    }

    public void jump() {
        System.out.println(this.name + " jumps");
    }

    public void attack(Creature creature) {
        System.out.println(this.getName() + " attacks " + creature.getName());
        creature.receiveAttack(this.getDamage());
    }

    public void receiveAttack(int damage) {
        int hp = this.getHp();
        if (hp > 0) {
            System.out.println(this.getName() + "'s hp - " + damage);
            this.setHp(hp - damage);
            if (this.getHp() <= 0) {
                this.die();
            }
        }
    }

    public void kickStone() {
        System.out.println(this.getName() + " kicks a stone");
    }

    public void fallOver() {
        System.out.println(this.getName() + " falls over");
    }

    public void weaponFall() {
        System.out.println(this.getName() + "'s weapon " + this.getWeapon() + " falls");
        this.weapon = null;
    }

    public void die() {
        System.out.println(this.getName() + " dies");
    }

    public void runAway() {
        System.out.println(this.getName() + " runs away");
    }
}
