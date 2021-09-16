public class Hero extends Human {
    boolean visiable;

    public Hero(String _name,int _hp,int _attack,int _defence){
        super(_name,_hp, _attack,_defence);
        visiable=true;
      }

    public void giantMode(){
        System.out.println(name + "turn into a giant,hp,attack and defence is highly rising!");
        giantmod=true;
        hp=hp*10;
        attack=attack*10;
        defense=defense*10;
    }

    public void smallMode(){
        System.out.println(name + "is no more a giant.");
        hp=hp%10;
        attack=attack%10;
        defense=defense%10;
    }

    public void turnInvisiable(){
        System.out.println(name + "uses magic,now he is invisiable and no more grabed");
        visiable=false;
        grabed=false;
    }
    public void apparence(){
        System.out.println(name + "is now visiable");
        visiable=true;
    }
    public void finalAttack(Boss monster){
        this.attack(monster,attack*10000,monster.weakness);
    }
    @Override
    public void receiveAttack(int ap) {
        if(visiable==false){
            System.out.println(name+"is invisialbe,can't be attacked.");
        }
        else  {
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