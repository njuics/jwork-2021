package gourd;

public class Creature extends Being{
    int hp;
    int atk;
    String[] memory;
    int memptr;
    public Creature(){
        memory=new String[7];
        memptr=0;
    }
    public void speakTo(Creature c,String content){
        System.out.println(name+" I speak to "+ c +":'"+content+"'...");
        //c.listen(content);
    }
    public void listen(String content){
        System.out.println(name+" I hear:"+content+"...");
        memory[memptr++]=content;
        memptr=memptr%7;
    }
    public void shout(String content){
        System.out.println(name+" I shout:"+content+"...");
    }
    public void attack(Creature c){
        System.out.println(name+" I attack " + c + " of " + atk + "points");
        //c.hurt(atk);
    }
    public void hurt(int atk){
        if(!isDead()){
            hp-=atk;
            System.out.println(name+" I got "+atk+" points attack");
        }
        isDead();
        
    }
    public boolean isDead(){
        if(hp<=0){
            System.out.println("I am dead");
            return true;
        }
        return false;
    }
}