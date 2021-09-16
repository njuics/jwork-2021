public class Sword extends Being {

    public Sword(String name){
        this.name = name;
    }

    public void revive(){
        System.out.println(name + ": I am reborn.");
    }
}