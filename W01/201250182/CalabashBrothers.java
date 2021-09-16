/**
 * @author Zyi
 */
public class CalabashBrothers extends Creature {

    Skill skill;
    String color;

    public CalabashBrothers(int health, int defense, int attack, boolean isHaveWeapon, String color) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.isHaveWeapon = isHaveWeapon;
        this.color = color;
        this.skill = chooseSkill(this.color);
        this.name = chooseName(this.color);
    }

    public String chooseName(String color) {
        String name = "";

        switch (color) {
            case "yellow":
                name = "yellowBaby";
                break;
                // 其他颜色日后添加
            default:
        }

        return name;
    }

    public Skill chooseSkill(String color) {
        Skill localSkill = null;

        switch (color) {
            case "yellow":
                localSkill = Skill.invulnerable;
                break;
            case "red":
            case "orange":
            case "green":
            case "blue":
            case "cyanBlue":
            case "purple":
            default:
        }

        return localSkill;
    }

    public void activateSkill() {
        // 这里先只加黄娃的技能
        if (this.skill == Skill.invulnerable) {
            this.defense += 1000;
            System.out.println(this.name + " 发动技能：金刚不坏之身！");
        }
    }

    public void grabWeapon(Creature creature) {
        // 将creature的武器抢夺过来
        if (creature.isHaveWeapon && !this.isHaveWeapon) {
            this.isHaveWeapon = true;
            creature.isHaveWeapon = false;
            System.out.println(this.name + " grab " + creature.name + "'s weapon,");
        }
    }

    public void kick(Creature creature) {
        System.out.println(this.name + " 踢走了 " + creature.name);
    }

    public void throwWeapon(Creature creature) {
        // 扔武器受到的伤害和平时伤害一样
        creature.receiveAttack(this.attack + 10);
    }

    public void moveBackward() {
        System.out.println(this.name + " is at a disadvantage.");
    }

    public void crushStone() {
        System.out.println(this.name + " crush the stone!");
    }
}
