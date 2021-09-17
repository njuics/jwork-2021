package gourd;

public class Stalactite extends Being{
    public Stalactite(){
        name="钟乳";
    }
    public void dropWater(Being c){
        System.out.println(name+" I drop some water on "+c+"...");
    }
}