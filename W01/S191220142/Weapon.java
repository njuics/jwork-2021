public class Weapon extends Being{
    int value;
    String name;

    public Weapon(){
        value = 20;
    }

    public Weapon(String nm, int vl){
        name = nm;
        value = vl;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }
}