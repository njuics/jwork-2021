public class Monster extends Creature{
    Monster(int health, int attack, int defense, String name){
        super(health, attack, defense, name);
    }

    public static void main(String args[]){
        Monster Snake = new Monster(100, 5, 0, "Snake");
        Snake.attack(Snake);
    }
    
    public void transform(){
        System.out.println(name + " got much bigger ");
    }
}
