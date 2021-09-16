public class Creature extends Being {
    public Creature(String s) {
        super(s);
        body = new Being(s + "的身体");
        arms = new Being(s + "的胳膊");
        hands = new Being(s + "的手");
    }
    public void fallOn(Being being) {
        System.out.println(name + "跌倒在了" + being.name + "上。\n");
    }
    public void dodge(Being being) {
        System.out.println(name + "躲开了" + being.name + "。\n");
    }
    public void laugh(boolean degree) {
        if(degree)
            System.out.println(name + "笑得很开心。\n");
        else
            System.out.println(name + "笑了。\n");
    }
    public void angry(int degree) {
        switch (degree) {
            case 2 : System.out.println(name + "很生气。\n"); break;
            case 3 : System.out.println(name + "非常生气。\n"); break;
            case 4 : System.out.println(name + "极度愤怒。\n"); break;
            default : System.out.println(name + "生气了。\n"); break;
        }
    }
    public void attack(Being arms, Being target) {
        System.out.println(name + "用" + arms.name + "攻击了" + target.name + "。\n");
    }
    public void see(Being target) {
        System.out.println(name + "看了看" + target.name + "。\n");
    }
    public void speak(String s) {
        System.out.println(name + "说：“" + s + "”。\n");
    }
    public void hurt() {
        System.out.println(name + "感到了疼痛。\n");
    }
    public void run() {
        System.out.println(name + "跑了。\n");
    }
    public void runAfter(Being being) {
        System.out.println(name + "追赶" + being.name + "。\n");
    }
    public void climbUp(Being being) {
        System.out.println(name + "从" + being.name + "上爬了起来。\n");
    }
    public void afraid() {
        System.out.println(name + "害怕了。\n");
    }
    public void hold(Being being) { System.out.println(name + "拿着" + being.name + "。\n");}
    public void _throw(Being being) {
        System.out.println(name + "把" + being.name + "扔掉了。\n");
    }

    public Being body;
    public Being arms;
    public Being hands;
}
