public class Human extends Creature {
    boolean grabed=false;
    boolean giantmod=false;
    public Human(String _name,int _hp,int _attack,int _defence){
        hp=_hp;
        attack=_attack;
        defense=_defence;
        name=_name;
        grabed=false;
        giantmod=false;
    } 
    public void rolleyes() {
        System.out.println(name+" roll his eyes. ");
    }
    public void grabable(){
        if(giantmod==false)
        System.out.println(name+" skipped this grab. ");
        else
        {
            grabed=false;
            System.out.println(name+" is being grabbed. ");
        }
    }
    public void angry() {
        System.out.println(name+" becomes angry ");
        System.out.println(name+" speaks: yeeeeeeeeeeeeeeeeeeeeeee!!!!!!!!! ");
    }
}