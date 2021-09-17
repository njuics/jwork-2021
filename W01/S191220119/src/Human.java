public class Human extends Creature{
    int energy;

    Human(String sname, int hp, int ap, int dp){
        name = sname;
        health = hp;
        attack = ap;
        defense = dp;
        energy = 100;
    }

    @Override
    public void attack(Creature creature, int ap){
        if(energy > 0){
            System.out.println(String.format("%s attack %s of %d points", name, creature.name, ap));
            creature.receiveAttack(ap);
            energy -= 1;
        }
        else{
            System.out.println(String.format("%s does not have enough energy to attack %s", name, creature.name));
        }
    }

    @Override
    public void attack(Creature creature, int ap, Prob wp){
        if(energy > 0){
            int totalAp = ap + wp.addition;
            System.out.println(String.format("%s attack %s with %s of %d points", name, creature.name, wp.name, totalAp));
            creature.receiveAttack(totalAp);
            energy -= 1;
        }
        else{
            System.out.println(String.format("%s does not have enough energy to attack %s", name, creature.name));
        }
    }
}
