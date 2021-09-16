public class Hammer extends Weapon{
    public Hammer(int endure){
        super(endure, "Hammer");
    }

    public void playSkill(Creature attacked){
        System.out.println(attacked + " is hit heavily by the hammer!");
    }


} 