package CalabashBoys;

public class Bat extends Organism{
    public Bat(){
        name="Bat";
    }

    public void push(Thing thing){
        System.out.println("Bat pushes "+thing.name+".");
        thing.getPushed();
    }

    public void fly(){
        System.out.println("Bat flys.");
    }

    public void attack(Organism organism){
        System.out.println("Bat attack "+organism.name+".");
        organism.takeDamage();
    }

    public void stealGemStone(Organism organism){
        for(int i=0;i<organism.possession.size();i++){
            if(organism.possession.get(i).getClass()==GemStone.class){
                Thing g=organism.possession.get(i);
                grab(g);
                organism.lose(g);
                return;
            }
        }
    }

    @Override
    public void laugh(){
        System.out.println(name+" laugh: 嘿嘿嘿嘿");
    }
}
