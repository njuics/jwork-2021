package W01.S201250215;

public class Monster extends Creature {
    int magic;//攻击加倍！

    Monster(String name, int hp, int ap, int dp, int xp, int cost, int magic, int x,int y) {
        super(name,x,y);
        health = hp;
        attack = ap;
        defense = dp;
        shock = xp;
        healthcost = cost;
        this.magic = magic;
    }


    public void attack(Creature creature) {
        if (health <= shock) {
            System.out.println(name +" is too weak to attack.");
        } else {
            System.out.println(name + " attacks " + creature.getName() + " of " + attack * magic + " points.");
            creature.receiveAttack(attack * magic);
            health -= healthcost;//发动技能耗体力
        }
    }

    public void attackByWeapon(Creature c, Weapon weapon) {
        //用武器不耗费体力
        if(health <= shock){
            System.out.println(name + "is too weak to use weapon.");
        }
        else {
            System.out.println(name + " attacks " + c.getName() + " of " + weapon.getAttack() + " points by throwing " + weapon.getName()+".");
            c.receiveAttack(weapon.getAttack()*magic);
        }
    }

    public void increaseHealth(int h){
        //奇怪的设定：妖怪可以回血，具体逻辑未构建，目前是打死小兵可给休克中的妖怪回血
        health += h;
        System.out.println(name + " returns "+ h + " points.");
    }

    public void hugHead(){
        //抱头
        System.out.println( name + " wants to protect the stupid brain.");
        System.out.println( name + "os: OMG!!");
    }
}
