package proj;

public class Trident extends proj.Weapon {
    Trident(int att) {
        super(att);
    }

    @Override
    public void attack(Creature creature1,Creature creature2) {
        System.out.println(creature1.name+ "使用三叉戟对" + creature2.name+"造成了一次牛逼的攻击");
        creature2.receiveAttack(attack);
    }


}
