public class HuluKingKong extends Creature {
    public HuluKingKong(int hp, int ap, int dp){
        health=hp;
        attack=ap;
        defense=dp;
    }
    public void fireAttack(Creature c, int ap){
        System.out.println(name+" uses fireAttack to "+c.name+".");
        this.attack(c,ap);
    }
    public void evade(){
        System.out.println(this.name+" evades！");
    }
    public void angry(){
        System.out.println(this.name+" is angry!");
    }
    public void spit(){System.out.println(this.name+" spits.");}
    public void rockAttack(Creature c, int ap, Rock rock, boolean isHit){
        System.out.println(name+" uses rockAttack to "+c.name+". The rock weighs "+rock.weight+"kg and is "+rock.sharpDegree+"!");
        rock.beThrownAt(c);
        if(isHit){
            System.out.println(" and hits it.");
            this.attack(c,ap);
        }
        else{
            System.out.println("but the attack failed!");
        }


    }

}
