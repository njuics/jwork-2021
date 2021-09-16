package W01.S201250215;

public class Creature extends Being{
    int health;//血量
    int attack;//不靠武器的能力值
    int defense;//防御值
    int shock;//休克值
    int healthcost;//发动技能消耗的值

    String[] memory;
    int memoryOffset;

    public Creature(String name, int x, int y) {
        super(name,x,y);
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println( name + " tells " + creature.getName() + ":'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heards: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        if(health <= shock){
            System.out.println(name + "is too weak to attack.");
        }
        else {
            System.out.println( name + " attacks " + creature.getName()  + " of " + ap + "points.");
            creature.receiveAttack(ap);
            health -= healthcost;//发动技能耗体力
        }
    }

    public void receiveAttack(int ap) {
        if (!judgeLife()) {
            if (defense < ap) {
                health -= ap;
                System.out.println( name + " got " + ap + "points attack.");

            }
        }
    }

    public boolean judgeLife() {
        //判断死亡，休克只会输出不会返回true
        if (health <= 0) {
            System.out.println(name + " gg.");
            return true;
        }
        if(health < shock ){
            System.out.println(name + " shocks.");
        }
        return false;
    }

    public void move(int x, int y) {
        positionX += x;
        positionY += y;
        System.out.println(name + " moves to ( " + positionX + ", " + positionY + " )");
    }

    public double relativeDistance(Creature creature){
        double temp = Math.pow((creature.getPositionX() - positionX), 2) + Math.pow((creature.getPositionY() - positionY), 2);
        return Math.sqrt(temp);
    }

    public void hasWeapon(Weapon weapon){
        //武器权限
        weapon.addUser(name);
        System.out.println(name + " can use weapon " + weapon.getName() + " now.");
    }

    public void loseWeapon(Weapon weapon){
        weapon.deleteUser(name);
        System.out.println(name + " can't use weapon " + weapon.getName() +" now.");
    }
}
