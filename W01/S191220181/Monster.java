package S191220181;

public class Monster extends Creature {

    public Monster(String _name) {
        super(_name);
    }

    public void hit(Creature x){
        System.out.println(name+"用棍敲打"+x.name);
    }

    public void runafter(Creature x){
        System.out.println(name+"追击"+x.name);
    }

    public void shoe(Creature x){
        System.out.println(name+"使用技能扔出鞋子"+x.name);
    }

    public void pick(Creature x){
        System.out.println(name+"举起"+x.name+"然后离开");
    }

    public void laugh(Creature x){
        System.out.println(name+"对着"+x.name+"哈哈大笑");
    }
}
