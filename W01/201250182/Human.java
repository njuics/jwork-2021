/**
 * @author Zyi
 */
public class Human extends Creature{

    public Human() {
        this.health = 100;
        this.defense = 1;
        this.attack = 0;
        this.isHaveWeapon = false;
        this.name = "grandFather";
    }

    public void stumble(Creature creature) {
        // 被绊倒扣10点血量
        creature.receiveAttack(10);
        creature.say("Ouch! I am stumbled!");
    }

    public void kickStone(Creature creature) {
        System.out.println(this.name + " kicked the stone to stumbled " + creature);
    }

}
