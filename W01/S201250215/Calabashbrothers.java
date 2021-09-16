package W01.S201250215;

public class Calabashbrothers extends Creature{

    Calabashbrothers(String name, int hp, int ap,int dp, int xp, int cost, int x, int y){
        super(name,x,y);
        health = hp;
        attack = ap;
        defense = dp;
        shock = xp;
        healthcost = cost;
    }

    public void attackByWeapon(Creature c, int way, Weapon weapon) {
        //用武器不耗费体力 用不同招式使用同一武器，加倍的招式有体力要求
        if(!weapon.hasUser(name)){
            System.out.println(name + " doesn't have the right to use " + weapon.getName() + ".");
        }
        else {
            switch (way) {
                case 1:
                    System.out.println(name + " attacks " + c.getName() + " of " + weapon.getAttack() + " points by knocking " + weapon.getName()+".");
                    c.receiveAttack(weapon.getAttack());
                    break;
                case 2:
                    if(health > shock * 1.2)
                    System.out.println(name + " attacks " + c.getName() + " of " + (int)(weapon.getAttack() * 1.2) + "points by rotating " + weapon.getName()+".");
                    c.receiveAttack((int) (weapon.getAttack() * 1.2));
                    break;
                case 3:
                    if (health > shock * 1.5) {
                        System.out.println(name + " attacks " + c.getName() + " of " + (int)(weapon.getAttack()*1.5) + "points by cloning " + weapon.getName()+".");
                        c.receiveAttack((int) (weapon.getAttack() * 1.5));
                        break;
                    }
            }
        }
    }

    public void CrowFliesbyPlane(Creature c){
        //乌鸦坐飞机，非常强的招式，需要体力值和距离值符合条件
        if(health>shock*2 && relativeDistance(c)<10){
            System.out.println(name + " attacks " + c.getName() + " of " + attack*3 + "points by CrowFliesbyPlane.");
            c.receiveAttack( attack*3);
            health -= healthcost;
        }
        else {
            System.out.println( name + " is too weak to use CrowFliesbyPlane.");
        }
    }

    public void Expelliarmus(Creature c, Weapon weapon){
        //除你武器，需要体力值和对方休克（无法保护武器）
        if(health > shock*1.5 && c.health<c.shock) {
            System.out.println(name + " gets " + weapon.getName() + " from " + c.getName()+".");
            c.loseWeapon(weapon);
            this.hasWeapon(weapon);
            health -= healthcost;
        }
    }

    public void cloaking(){
        //隐身技能，待完善
        System.out.println(name + " is cloaking.");
    }
}
