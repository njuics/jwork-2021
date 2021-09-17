/**
 * @author Zyi
 */
public abstract class Creature extends Being {

    /**
     * 生物类的血量
     */
    int health;
    /**
     * 生物的攻击力
     */
    int defense;
    /**
     * 生物的防御力
     */
    int attack;
    /**
     * 是否拥有武器，如果有武器的话，攻击力提高10
     */
    boolean isHaveWeapon;
    /**
     * 生物的名字
     */
    String name;

    public void speakTo(Creature creature, String message) {
        System.out.println(this.name + " told " + creature.name + "," + message);
        creature.listen(message);
    }

    public void speakTo(Creature[] creatures, String message) {
        // 同时告诉多人消息
       StringBuilder tellMessage = new StringBuilder();
       tellMessage.append(this.name).append(" told ");
       for (int i = 0; i < creatures.length; i++) {
           if (i != creatures.length - 1) {
               tellMessage.append(creatures[i].name).append(" and ");
           } else {
               tellMessage.append(creatures[i].name).append(", ");
           }
       }

       tellMessage.append(message);
       System.out.println(tellMessage);
       for (Creature creature : creatures) {
           creature.listen(message);
       }
    }

    public void listen(String message) {
        System.out.println(this.name + " listened " + message);
    }

    /**
     * 攻击动作
     * @param somebody 受到攻击的人
     */
    public void attack(Creature somebody) {
        // 先判断是否有武器，有武器则增加十点伤害
        if (this.isHaveWeapon) {
            System.out.println(this.name + " have weapon!");
            if (this.attack + 10 > somebody.defense) {
                System.out.println(this.name + " attacked " + somebody.name + ", and cause " + (this.attack + 10) + " damage");
                somebody.receiveAttack(this.attack + 10);
            }
        } else {
            if (this.attack > somebody.defense) {
                System.out.println(this.name + " attacked " + somebody.name + ", and cause " + this.attack + " damage");
                somebody.receiveAttack(attack);
            }
        }


    }

    /**
     * 受到攻击。需要先判断伤害是否大于防御力，如果小于防御力就不造成伤害。反之则造成伤害
     * @param hp 受到的伤害
     */
    public void receiveAttack(int hp) {
        if (!isDead()) {
            if (this.defense < hp) {
                this.health -= hp;
                System.out.println(this.name + " has received " + hp + " damage.");
            } else {
                System.out.println(this.name + " defensed the attack");
            }
        }
    }

    /**
     * 判断某生物是否死了
     * @return true：死了，false：活着
     */
    public boolean isDead() {
        if (this.health <= 0) {
            this.dead();
            return true;
        }

        return false;
    }

    /**
     * 死亡
     */
    public void dead() {
        System.out.println(this.name + " is dead!");
    }

    /**
     * 移动，暂时不需要其中的具体功能
     */
    public void move() {
        // not implemented yet
    }

    /**
     * 单独的说话，打架时候的呐喊。
     * @param message 说话的内容
     */
    public void say(String message) {
        System.out.println(this.name + " say: " + message);
    }

    /**
     * 摔倒扣血
     */
    public void fallDown() {
        this.health -= 10;
    }

    public void loseWeapon() {
        this.isHaveWeapon = false;
        System.out.println(this.name + " lose weapon!");
    }

    public void laugh() {
        System.out.println(this.name + " say : 哈哈哈哈哈哈...");
    }
}
