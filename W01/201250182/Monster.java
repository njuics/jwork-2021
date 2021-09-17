/**
 * @author Zyi
 */
public class Monster extends Creature{

    public Monster(int health, int defense, int attack, boolean isHaveWeapon, String name) {
        // 设定怪物的生命值、防御力和攻击力
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.isHaveWeapon = isHaveWeapon;
        this.name = name;
    }

    /**
     * 怪物飞行的技能
     */
    public void flyAndMove() {
        // not implemented yet
    }

    public void wantToAttack(Creature creature) {
        // 偷袭攻击，比普通攻击伤害高。
    }

    /**
     * 小怪出现
     */
    public void appear() {
        System.out.println(this.name + " appear.");
    }

    public void waitAndThink() {
        // not implemented yet
    }

    public void throwStone() {
        System.out.println(this.name + " throw the stone!");
        // not implemented yet
    }

    public void afraid() {

    }

    public void flyAndEscape() {
        System.out.println(this.name + " escape!");
    }
}
