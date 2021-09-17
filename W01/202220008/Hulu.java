package hw01;

public class Hulu extends Creature{
    
    Hulu(int hp, int ap, int dp,String na) {
        health = hp;
        attack = ap;
        defense = dp;
        name = na;
    }

    @Override
    public void attack(Creature c,String way){

        System.out.println(name + " attacks " + c.name + " of " + (attack+mood) + " points");
        c.receiveAttack(attack+mood);
        
    }

    @Override
    public void receiveAttack(int ap)
    {
        ap = ap/2;    //huluwa suffers half damage from monster

        if(defense>=ap) noDamage();
        else health = health - ap;

        if(isDead()) System.out.println(name + " am dead");
        else System.out.println(name + " got " + ap + "points attack");

    }

    public void noDamage(){

        System.out.println(name + "says 'Your attack is useless.'");

    }
}