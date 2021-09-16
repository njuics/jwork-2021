package S191220181;

public class Sanwa extends Creature{

    public Sanwa(String _name) {
        super(_name);
    }

    public void verb(){
        System.out.println( name + "躲开了攻击");
    }

    public void trap(){
        System.out.println( name + "被困住");
    }

    public void turn(){
        System.out.println( name + "转身");
    }
    public void protect(){
        System.out.println( name + "捂着屁股");
    }
}
