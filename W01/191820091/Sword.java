public class Sword extends Weapon {
    public int speedReduce;

    public Sword(String name, int type, int hurt) {
        this.name = name;
        this.type = type;
        this.hurt = hurt;
    }

    public void changeSwordType(int type) {
        System.out.println("The sword's type has changed.");
        this.type = type;
        this.speedReduce = 100;
    }
}
