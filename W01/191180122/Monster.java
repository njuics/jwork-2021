public class Monster extends Creature{
    int magic;

    Monster(int hp,int dp,int ap,int mp){
        health = hp;
        defense = dp;
        attack = ap;
        magic = mp;
    }

    public void attack(Creature creature, int ap) {
        System.out.println(this.name + " attacks " + creature.name + " of " + ap + " points");
        creature.receiveAttack(ap * magic);
    }
    
    public void beHappy(){
        System.out.println(this.name + " : HaHaHa!");
    }

    public void beSurprised(){
        System.out.println(this.name + " : WoW!Amazing!");
    }
    public void escape(){
        System.out.println(this.name + " run away quickly!");
    }

    public void fillWater(Cup cup){
        cup.waterCapacity = 100;
        System.out.println(cup.name + " is filled with water");
    }
}