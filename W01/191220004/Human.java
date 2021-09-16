public class Human extends Creature{
    Human(String cname,int hp){
        HP = hp;
        name = cname;
    }
    public void awake(){
        System.out.println(this.getName() + " open the eyes");
    }
    public void rollEyes(){
        System.out.println(this.getName() + " roll the eyes");
    }
    public void shock(){
        System.out.println(this.getName() + " open the eyes and mouth shocked");
    }
}
