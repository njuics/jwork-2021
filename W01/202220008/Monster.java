package hw01;

public class Monster extends Creature{

    int magic;
    int magicCost;
    String[] badwords={"fuck","shit","die","mother"};
    String[] goodwords={"beautiful","handsome","nice"};

    Monster(int hp,int ap,int dp,int mp,int cost,String na){
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
        magicCost = cost;
        name = na;
    }

    @Override
    public void attack(Creature c,String way){
        //way:P physical, M magic
        if(way=="M")
        {
            if(magic<magicCost){
                System.out.println(name + " fails to attack " + c.name + " , with " + magic + "mp remaining");
            }
            else{
                System.out.println(name + " uses magic to attack " + c.name + " of " + (attack+mood) + "points");
                c.receiveAttack((attack+mood)*magicCost);
                magic = magic - magicCost;
            }
        }
        else{
            System.out.println(name + " attacks " + c + " of " + (attack+mood) + " points");
            c.receiveAttack(attack+mood);
        }
    }

    public void reaction(){
        for(String word:badwords){
            if(recall(word)) mood = mood - 2;
        }
        for(String word:goodwords){
            if(recall(word)) mood = mood + 2;
        }

        if(mood>=5) beHappy();
        if(mood<=-5) bePissed();
    }

    public void laugh(){

        System.out.println(name + " :HaHaHaHa");
        if(mood>=5) beHappy();
        if(mood<=-5) bePissed();
    }

    public void rolleyes(){
        System.out.println(name + " rolls eyes.");
    }

}