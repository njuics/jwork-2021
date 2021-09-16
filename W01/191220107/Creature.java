public class Creature extends Being {
    int health;
    int attack;
    int defence;

    public boolean isDead() {
        if (health <= 0) {
            System.out.println(name + " is DEAD.");
            return true;
        } else
            return false;
    }

    public void getHurt(int damage) {
        health -= damage - defence;
        System.out.println(name + " get hurt by " + (damage - defence) + " point.");
        System.out.println("Now the HP of " + name + " is " + health);
    }

    public void attack(Creature target) {
        System.out.println(name + " attack " + target + " by " + attack + " points.");
        target.getHurt(attack);
    }

    public void cleanObstruction(Obstruction target) {
        System.out.println(name + " do " + target.operation + " on item " + target);
    }

    public void speakTo(Creature target, String words) {
        System.out.println(name + " says to " + target + ": " + words);
    }

    public void speak(String words) {
        System.out.println(name + " says: " + words);
    }

    public void move() {
        System.out.println(name + " moved.");
    }
}
