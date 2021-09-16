package gourd;

public class CalaBro extends Creature{
    int state;
    public CalaBro(){
        System.out.println(name+ "I was born...");
        state=0;
        atk=20;
        hp=100;
        name="六娃";
    }
    public void stealth(){
        if(state==1){
            System.out.println(name+" I disappear...");
            state=0;
        }
    }
    public void appear(){
        if(state==0){
            System.out.println(name+" I appear...");
            state=1;
        }
    }
    public void run(){
        System.out.println(name+" I run away...");
    }
}