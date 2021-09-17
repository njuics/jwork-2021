public class Weapon{
    protected int endure;
    private String name;
    public Weapon(int endure,String name){
        this.endure = endure;
        this.name = name;
    }
    
    public String toString(){
        return name;
    }

    public void wear(int amount){
        if(endure >= amount)endure -= amount;
        else endure = 0;

        if(endure == 0)System.out.println(this+" is broken.");
    }

    public void playSkill(Creature attacked){

    }
}