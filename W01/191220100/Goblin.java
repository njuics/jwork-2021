public class Goblin extends Creature{
    public Goblin(String init_name){
        super(init_name);
    }

    public void sleep(){
        System.out.println(this.getName() + " 睡着了！");
    }

    public void beSleeping() {
        System.out.println(this.getName() + " 正在睡觉。");
    }

    public void awake() {
        System.out.println(this.getName() + " 醒来了！");
    }
}