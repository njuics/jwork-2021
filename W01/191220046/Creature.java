public class Creature {

    int health;
    int attack;
    String name;

    public void speakTo(Creature creature, String content) {
        System.out.println(name+" tell "+creature.name+" that "+content);
        creature.heardSomethingFrom(this,content);
    }

    public void heardSomethingFrom(Creature creature, String content) {
        System.out.println(name+" heard "+creature.name+" said that "+content);
    }

    public void attackACreature(Creature creature, int damage) {
        System.out.println(name+" attack "+creature.name+" and cause "+damage+" damage");
        creature.receiveAttackFrom(this,damage);
    }

    public void receiveAttackFrom(Creature creature, int damage) {
        health -= damage;
        System.out.println(creature.name+" hurt "+name+" and "+name+" got "+damage+" damage, " +
                "now"+name+"'s health is "+(Math.max(health, 0)));
        if (health <= 0) {
            dead();
        }
    }

    public void dead() {
        System.out.println("I am dead");
    }

}
