package proj;

public class Monster extends Creature{

    Monster(String hint,int sheath,int hiatal) {
        name=hint;
        health=sheath;
        attack=hiatal;
    }

    @Override
    public void attack(Creature creature, int hurt) {
        System.out.println(name+" attack " + creature.name + " of " + hurt + " points");
        creature.receiveAttack(hurt);
    }

    public void sleep(){
        System.out.println("zzzzz~~~~~");
    }
}
