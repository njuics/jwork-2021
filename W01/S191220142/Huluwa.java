public class Huluwa extends Creature {
    int magic;

    Huluwa(){
        name = "No_name";
        health = 200;
        attack = 10;
        defense = 20;
        magic = 1;
    }

    Huluwa(String nm, int hp, int ap, int dp, int mp) {
        super(nm, hp, ap, dp);
        magic = mp;
    }

    @Override
    public void attack(Creature c) {
        System.out.println(name + " attacks " + c.getName() + " of " + attack*magic + " points");
        c.receiveAttack(attack * magic);
    }
}