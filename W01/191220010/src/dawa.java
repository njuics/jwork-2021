public class dawa extends Creature {
    
    public dawa(String s){
        health=100;
        defense=1;
        attack=20;
        name=s;
    }

    
    public void Catchspear(){
        System.out.println(name+"接枪并掰断");
    }

    public void icebreak(){
        System.out.println(name+"破冰");
    }
    
    public void big(){
        System.out.println(name+"变大");
    }

    public void tread(Creature c){
        System.out.println(name+"踩"+c.name);
    }
}