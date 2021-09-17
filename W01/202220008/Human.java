package hw01;

public class Human extends Creature{
    
    String[] badwords={"fuck","shit","die","mother"};
    String[] goodwords={"beautiful","handsome","nice"};

    Human(int hp,int ap,int dp,String na){
        health = hp;
        attack = ap;
        defense = dp;
        name = na;
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
}