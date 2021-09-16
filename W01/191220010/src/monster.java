public class monster extends Creature {
    
    public monster(int hp,int ap,int dp,String s){
        health=hp;
        attack=ap;
        defense=dp;
        name=s;
    }

    public void freeze(Creature c){
        System.out.println(name+"冻住"+c.name);
    }

    public void runaway(){
        System.out.println(name+"跑了");
    }

    public void big(){
        System.out.println(name+"变大");
    }

    public void throwspear(Creature c){
        System.out.println(name+"扔枪打"+c.name);
    }
}