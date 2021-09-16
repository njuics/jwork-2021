package IronChild;

public class Creature extends Being {
    int health;
    int attack;
    int defense;

    String memory[];
    int num;

    public Creature() {
        memory = new String[15];
        num = 0;
    }

    public void speakTo(Creature sb, String sth) {
        System.out.println(name + ":I tell " + sb.name + " '" + sth + "'");
        sb.listenFrom(name, sth);
    }

    public void listenFrom(String sb, String sth) {
        System.out.println(name + ":I hear '" + sth + "' from " + sb);
        memory[num % memory.length] = sth;
    }

    public void attack(Creature creature, int damage) {
        System.out.println(name + ":I attack " + creature.name + " of " + damage + " points.");
        creature.receiveAttack(name, damage);
    }

    public void receiveAttack(String sb, int damage) {
        if (isDead()) {
            System.out.println(name + ":Although I am dead, I still got " + damage + " points attack from " + sb + ".");
        } else {
            if (defense < damage) {
                health -= damage - defense;
                if (health > 0)
                    System.out.println(name + ":I got " + damage + " points attack from " + sb + ".");
                else
                    System.out.println(name + ":I got " + damage + " points attack from " + sb + " and I am dead.");
            } else {
                System.out.println(name + ":I got 0 points attack from " + sb + ".");
            }
        }
    }

    public boolean isDead() {
        if (health <= 0)
            return true;
        else
            return false;
    }

    public void jump() {
        System.out.println(name + " jumps down.");
    }

    public void dance() {
        System.out.println(name + " dances.");
    }

    public void struggle() {
        System.out.println(name + " struggles.");
    }

    public void trap() {
        System.out.println(name + " is tied up.");
    }
}
