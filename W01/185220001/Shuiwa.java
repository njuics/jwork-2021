package W01;

public class Shuiwa extends Creature {

    public Shuiwa() {
        name = "Shuiwa";
        health = 100;
        attack = 1;
        defense = 10; 
    }

    public void water(Item item) {
        System.out.println(name +" water " + item);
        item.receiveWater();
    }
    

}
