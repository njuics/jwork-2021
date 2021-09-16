public class Calabash_Brother extends Creature {
    int magic;
    Calabash_Brother(int hp,int dp,int ap,int mp){
        health = hp;
        defense = dp;
        attack = ap;
        magic = mp;
    }
    public void rolleyes(){
        System.out.println(this.name + " rolls eyes.");
    }
    public void standUp(){
        System.out.println(this.name + " stands up.");
    }
    public void drinkWater(Cup cup){
        System.out.println(this.name + " drinks water.");
        System.out.println(cup.name + " is empty.");
        cup.temperature=25;
        cup.waterCapacity=0;
    }

}