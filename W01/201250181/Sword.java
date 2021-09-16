public class Sword extends Weapon{
    
    public Sword(int endure){
        super(endure, "Sword");
    }

    public void wear(int amount){
        super.wear(amount);
        restore(amount);
    }

    public void restore(int amount){
        this.endure += amount;
        System.out.println(this+"'s endure restores.");
    }
}