package gourd;

public class Gourd extends Creature{
    //CalaBro c;
    int state;
    public Gourd(){
        state=0;
        atk=1;
        hp=10000;
        name="葫芦";
    }
    //int calaNum;
    public void receiveWater(){
        System.out.println(name+" I receive a drop of water...");
    }
    public void swing(){
        System.out.println(name+" I swing from side to side...");
    }
    public void getRid(){
        state=1;
        System.out.println(name+" I get rid of the cane...");
    }
    public void jump(){
        System.out.println(name+" I jump to the ground...");
    }
    public CalaBro bomb(){
        state=2;
        System.out.println(name+" I bombed!!!");
        return new CalaBro();
    }
};