public class FireBrother extends Calabash_Brother{
    FireBrother(int hp, int dp, int ap, int mp) {
        super(hp, dp, ap, mp);
        // TODO Auto-generated constructor stub
    }

    public void fire(Cup cup) {
        cup.temperature = 100;
        System.out.println(cup.name + " is on fire.");
        if (cup.isHot()==true) {
            System.out.println("Hot water!");
        }
    }
    
    public void fire(Stone stone,Monster bat) {
        stone.temperature = 200;
        System.out.println(stone.name + " is on fire.");
        this.attack(bat,10);
        bat.escape();
    }
}