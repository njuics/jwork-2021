public class Hammer extends Being {

    public Hammer(String name) {
        this.name = name;
        strength = 3;
    }

    public void hit(Creature cre){
        System.out.println(name + ": I have hit " + cre.name + ".");
        cre.underAttack(strength);
    }
}