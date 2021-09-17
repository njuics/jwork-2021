public class Chain extends Weapon{
    
    public Chain(int endure){
        super(endure, "Chain");
    }

    public void playSkill(Creature attacked){
        System.out.println(attacked+" is bound by the chain!");
    }
}