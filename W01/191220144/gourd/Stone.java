package gourd;

public class Stone extends Being{
    int atk;
    public Stone(){
        atk=30;
    }
    public void collide(Creature c){
        System.out.println(c+"collides with the stone...");
    }
}