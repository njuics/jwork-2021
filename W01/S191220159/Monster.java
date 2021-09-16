package S191220159;

public class Monster extends Creature {

    public Monster(String _name) {
        super(_name);
    }

    public void kick(Item item,Monster monster){
        System.out.println(name + " kick " + item.name + " to attarct " + monster.name );
        item.beKicked(item,monster);
    }

    public void beStabbed(){
        System.out.println(name + " is stabbed");
    }

    public void beTrapped(){
        System.out.println(name + " is trapped");
    }

    public void beAttracted(){
        System.out.println(name + " is attracted");
    }

    public void triggar(Item item){
        System.out.println(name + " triggar " + item.name);
        item.trap(this);
    }
}
