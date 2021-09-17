public class Goblin extends Creature {

    int magic = 5;

    public Goblin() {
        //live = true;
        health = 50;
        strength = 2;
        magic = 2;
    }

    public Goblin(String name, int health, int strength, int defense, int magic) {
        //live = true;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.magic = magic;
    }

    @Override
    public void attack(Creature cre) {
        int damage = strength*magic - cre.defense;
        System.out.println(name + ": I attack " + cre.name + ".");
        cre.underAttack(damage);
    }

    public void attack(Creature cre, Being object){
        int damage = strength*magic - cre.defense;
        System.out.println(name + ": I attack " + cre.name + " with my " + object.name + ".");
        cre.underAttack(damage);
    }
}