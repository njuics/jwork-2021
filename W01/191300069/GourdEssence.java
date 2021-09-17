public class GourdEssence extends Goblin {

    int magic;

    public GourdEssence(String name) {
        //live = true;
        this.name = name;
        health = 50;
        strength = 5;
        magic = 10;
        defense = 2;
    }

    @Override
    public void attack(Creature cre) {
        int damage = strength*magic - cre.defense;
        System.out.println(name + ": I'm gourd King Kong! I attack " + cre.name + ".");
        cre.underAttack(damage);
    }
}