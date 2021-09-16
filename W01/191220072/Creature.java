public class Creature {
    
    String name;
    int health;
    int attack;
    int defense;
    Creature(int health, int attack, int defense, String name){
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
   }

   public String toString(){
       return name;
   }

   public void speak(String lines){
       System.out.println(name + " says :"+ lines);
   }

   public void move(){
       //TODO
   }
   public void attack(Creature victim){
    System.out.println(name + " attacked " + victim);
    victim.receiveAttack(attack);

    }
   public void receiveAttack(int ap) {
    if (!isDead()) {
        if (defense < ap) {
            health -= ap;
            System.out.println(name + " got " + ap + " points attack ");
            }
        }
    }   

    public boolean isDead() {
        if (health <= 0) {
            System.out.println(name + " is dead ");
            return true;
        }
    return false;
    }

    public static void main(String args[]){
        Creature nobody = new Creature(100, 5, 0, "nobody");
        Creature victim = new Creature(100, 5, 0, "victim");
        nobody.attack(victim);
    }
}
