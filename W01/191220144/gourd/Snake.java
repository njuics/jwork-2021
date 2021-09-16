package gourd;

public class Snake extends Monster{
    public Snake(){
        hp=100;
        atk=20;
        mp=3;
        name="蛇精";
    }
    public void throwOut(Creature from,Being to){
        System.out.println(name+" I throw "+from+" to "+to);
    }
    public void flashEyes(){
        System.out.println(name+" My eyes sparkle");
    }
}