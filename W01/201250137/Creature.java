

public class Creature extends Being{
    int memorySize;
    double aggressivity;
    String name;
    String[] memoryContent;
    int numberOfOnceRemembered = -1;        //指向最新记得的信息，从新到旧的顺序为当前指向的信息向左移动

    public Creature(double hp, int memorySize, double defence, double aggressivity, String name){
        this.hp = hp;
        this.defence = defence;
        this.aggressivity = aggressivity;
        this.memorySize = memorySize;
        this.name = name;
        memoryContent = new String[memorySize];
    }

    public void speakTo(String name, String content){
        System.out.println(this.toString() + "对" + name + "说:\"" + content + "\"");
    }

    public void listen(String name, String content){
        numberOfOnceRemembered++;
        memoryContent[numberOfOnceRemembered] = content;
        System.out.println(this.toString() + "听到" + name + "说" + ":\"" + content + "\"");
    }

    public void complacent(){
        System.out.println(this.toString() + ":哈哈哈哈哈哈！");
    }

    public void angery(){
        System.out.println(this.toString() + ":呀啊啊啊啊啊！");
    }

    public void shock(){
        System.out.println(this.toString() + ":啊？");
    }

    public void workHard(){
        System.out.println(this.toString() + ":");
    }

    public void attack(double strength, Creature victim){
        System.out.println(this.toString() + "攻击了" + victim.toString());
        victim.beAttacked(strength * aggressivity, this);
    }

    public void beAttacked(double strength, Creature attacker){
        hp -= (strength * (1 - defence));
        if (strength != 0){
            System.out.println(this.toString() + "受到了" + strength * (1 - defence) + "点伤害。");
        }
        else {
            System.out.println(this.toString() + "毫发无伤。");
        }
        
        if (!isDead()){
            System.out.println(this.toString() + "被击败了。");
        }
    }

    public void badAttack(double strength, Creature victim){    // 攻击将会被闪避
        System.out.println(this.toString() + "发动了攻击。");
        victim.miss(strength, this);
    }

    public void miss(double strength, Creature attacker){
        System.out.println(this.toString() + "躲避了攻击。");
    }

    public void runAway(){
        System.out.println((this.toString() + "怂了，开始逃跑了。"));
    }

    public String toString(){
        return name;
    }
}
