package CalabashBoys;
import java.util.*;

public class Organism extends Being {
    protected String state;
    protected ArrayList<Thing> possession;

    public Organism(){
        state="normal";
        possession= new ArrayList<Thing>();
    }

    public void talk(Organism organism, String content) {
        System.out.println(name+" tell "+organism.name+": \""+content+"\".");
        organism.hear(this,content);
    }

    public void talk(String content) {
        System.out.println(name+" says "+": \""+content+"\".");

    }

    public void hear(Organism organism, String content) {
        if(state=="blackout"){
            System.out.println(name+"can't hear anything.");
            return ;
        }
        System.out.println(name+" hear "+organism.name+"says: \""+content+"\".");
    }

    public void laugh(){
        System.out.println(name+" laugh: 哈哈哈哈哈哈");
    }

    public void move(){

    }

    public void grab(Thing thing){
        possession.add(thing);
        System.out.println(name+" grab "+thing.name+".");
    }

    public void lose(Thing thing){
        if(possession.contains(thing)){
            possession.remove(thing);
            System.out.println(name+" lose "+thing.name+".");
        }
    }

    public void handTo(Organism organism,Thing thing){
        organism.grab(thing);
        this.lose(thing);
    }

    public void takeDamage(){
        state="injured";
        System.out.println(name+" is injured.");
    }
}
