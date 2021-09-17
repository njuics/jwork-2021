public class Scorpion extends Monster{
    private static Scorpion  singleton = new Scorpion();
    String weapon;
    private Scorpion(){
        super(2000, 100, 50, "Scorpion");
        weapon = "tail";
    }

    public static Scorpion getInstance(){
        return singleton;
    }
    
    public void getArmed(String arm, int inc){
        System.out.println("Scorpion armed a " + arm);
        weapon = arm;
        attack += inc;
    }

    public void lostArm(){
        System.out.println("Scorpion lost its weapon !");
        weapon = "tail";
        attack = 100;
    }

    public static void main(String args[]){
        Scorpion scorpion = Scorpion.getInstance();
        Snake snake = Snake.getInstance();
        scorpion.attack(snake);
        scorpion.getArmed("spear", 50);
        scorpion.attack(snake);
        scorpion.lostArm();
    }
}
