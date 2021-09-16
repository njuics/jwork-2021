public class Creature {
    public String name; // 名称
    public int hp; // 血量
    public int speed; // 速度
    public int defense;// 防御

    public Creature(String name, int hp, int speed, int defense) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.defense = defense;
    }

    public void speakTo(Creature creature, String mesg) {
        System.out.println(this.name + " tell " + creature.name + ": " + mesg);
    }

    public void listenFrom(Creature creature, String mesg) {
        System.out.println(this.name + " heard " + creature.name + " said: " + mesg);
    }

    public void move(String moveMethod) {
        System.out.println(this.name + " " + moveMethod);
    }

    public void beAttacked(int type, int hurt) {
        if (type == 0) {
            if (hurt > defense) {
                int preHp = hp;
                hp -= hurt - defense;
                if (isDead()) {
                    System.out.println(this.name + " is dead.");
                } else {
                    System.out.println(this.name + " be attacked, and hp from" + preHp + " to " + hp);
                }
            } else {
                System.out.println("The attack is invalid.");
            }
        } else if (type == 1) {
            int preSpeed = speed;
            speed -= hurt;
            if (speed <= 0) {
                System.out.println(this.name + " can't move.");
            } else {
                System.out.println(this.name + "be attacked, and speed from " + preSpeed + " to " + speed);
            }
        }
    }

    public boolean isDead() {
        if (hp <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
