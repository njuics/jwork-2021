public class Creature extends Being{
    int HP;
    String name;
    public Creature(){

    }
    public String getName(){
        return name;
    }
    public void laugh(String sth){
        System.out.println(this.getName() + " laugh: " + sth);
    }

    public void speakTo(Creature creature,String sth){
        System.out.println(this.getName() + " " + "tell" + " " + creature.getName() + ": " + "'" + sth + "'");    
        creature.listen(sth);    
    }
    
    public void listen(String sth){
        System.out.println(this.getName() + " hear: " + sth);
    }

    public void attack(Creature creature,int ap,String action){
        System.out.println(this.getName() + " attack " + creature.getName() + " of " + ap + " points (" + action + ")");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap){
        HP -= ap;
        System.out.println(this.getName() + " get " + ap + " HP attack");
    }
}
