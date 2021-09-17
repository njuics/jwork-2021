public class Bee_Bomber extends Monster {

    Bee_Bomber(String n) {
        name = n;
        health = 20;
        attack = 50;
        defense = 10;
    }

    public void launch(Human human) {
        System.out.println(name + ": Taking off from the air base. Mission: Distroy " + human.name + ".");
        human.detect();
    }

    @Override
    public void attack(Creature creature) {
        System.out.println(name + ": Bombs away! Attacking " + creature.name + " of " + attack + " points!");
        creature.receiveAttack(this, attack);
    }

    @Override
    public void receiveAttack(Creature creature, int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health += (defense - ap);
                System.out.println(name + ": I'm hit! I'm hit! I got " + (ap - defense) + " points attack from " + creature.name + "!");
                if (isDead()){
                    System.out.println(name + ": Mayday! Mayday! Going down! Going down!");
                    creature.watch();
                }
                else
                    System.out.println("(" + name + ") AP remains: " + ap);
            } else
                System.out.println(name + ": Successfully defended against an attack from " + creature.name + "!");
        }
    }

}
