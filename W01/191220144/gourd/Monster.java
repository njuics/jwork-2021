package gourd;
public class Monster extends Creature{
    int mp;
    public void mad(){
        System.out.println(name+" I'm so freakin pissed!!!");
        atk+=20;
    }
    @Override
    public void attack(Creature c){
        System.out.println(name+" I attack " + c + " of " + atk*mp + "points");
        c.hurt(atk*mp);
    }
}