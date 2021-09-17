package S218354149;

public class Creature extends Being {
    int health;
    int attack;
    int defense;
    int XP;
    int level;
    int patience = 10;
    boolean pissed = false;
    String name;

    String[] memory;
    int memoryOffset;

    Creature() {
        memory = new String[7];
        memoryOffset = 0;
    };

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " said to " + creature.name + " :' " + something + "'");
        creature.listen(creature, something);
    }

    public void listen(Creature creature, String something) {
        System.out.println(creature.name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        if (pissed) {
            ap += 5; // 被激怒時ap值+5
        }
        System.out.println(name + " attack " + creature.name + " of " + ap + " points");
        creature.receiveAttack(ap);
        dropXP(creature, ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(name + " got " + ap + " points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(name + " said: I am dead.");
            return true;
        }
        return false;
    }

    public void move() {
        // not implemented yet
        System.out.println(name + " moved.");
    }

    public void dropXP(Creature creature, int XP) {
        System.out.println(creature.name + " drops " + XP + "XP");
        gainXP(XP);
    }

    public void gainXP(int newXP) {
        System.out.println(name + " gains " + newXP + "XP");
        if ((XP + newXP) / 10 > 0) {
            level = (XP + newXP) / 10;
            XP = (XP + newXP) % 10;
            System.out.println("Level UP!");
        } else {
            XP += newXP;
        }
        System.out.println(name + " now have " + XP + " XP");
        System.out.println(name + " now have " + level + " Level");
    }

    public void emotion(Creature c, String emo) {
        String res;
        switch (emo) {
            case "pissed":
                patience -= 2;
                System.out.println(name + " is losing patience! " + patience + " patience left.");
                res = "I'm freakin pissed.";
                break;
            case "scared":
                defense += 10;
                res = "OMG I'm so scared.";
                break;
            case "laugh":
                attack += 5;
                res = "HAHAHAHA";
                break;
            default:
                return;
        }
        c.speakTo(c, res);
    }
}
