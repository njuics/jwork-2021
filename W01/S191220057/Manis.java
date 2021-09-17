//package W01.S191220057;

public class Manis extends Creature {

    Manis(){
        name = "Manis";
        health = 100;
        attack = 20;
        defense = 1;
    }

    public void escape()
    {
        System.out.println("Manis is escaping");
    }

    public void struggle()
    {
        System.out.println("Manis struggles to get free");
    }
}
