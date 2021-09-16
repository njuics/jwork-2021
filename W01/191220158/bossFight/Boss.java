public class Boss extends Monster {
    
    public Boss(String _name,int _hp,int _attack,int _defence,String _weakness){
      super(_name,_hp, _attack,_defence,_weakness);
      
    }
    public void showWeakness(){
        System.out.println(name + " looked at his "+ weakness);
    } 
    public void grabAttack(Human _human){
        System.out.println(name + " try to grab "+ _human.name);
        _human.grabable();
    }

    public void seeInvisiable(Hero _human){
        System.out.println(name + "is using thousand eye,he can see invisiable people!");
        _human.apparence();
    }

    @Override
    public void receiveAttack(int ap,String _weak) {
      if(weakness==_weak){
          hp=-1;
        System.out.println(name+" got " + (ap-defense) + "points attack on the weakness!");
        System.out.println(name+"is dead");
    }
     else {
            if (defense < ap) {
              hp -= ap;
             System.out.println(this.name+" got " + (ap-defense) + "points attack");
             if(isDead()==true)
                System.out.println(this.name+"is dead");
            }
            else 
            System.out.println(this.name+" is too strong for this attack");
         }
    }
}