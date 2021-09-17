package proj;

public class Pangolin extends Creature{
    private final static Pangolin pan=new Pangolin();
    private Pangolin(){
        name="小甲";
        health=100;
        attack=1;
    }
    public static Pangolin getInstance(){
        return pan;
    }

    @Override
    public void move(){
        System.out.println("欸嘿，哒哒哒");
    }
}
