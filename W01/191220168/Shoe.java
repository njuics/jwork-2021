public class Shoe extends Weapon{
    public Shoe(String name, int damage){
        super(name, damage);
    }
    public void smaller(Character target){
        System.out.println("Shoe became smaller. " + target.name + " got hurt!");
    }
}