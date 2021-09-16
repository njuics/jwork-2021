public class Chain extends Being {

    public Chain(String name){
        this.name = name;
        strength = 3;
    }

    public void beSmashed(Creature cre){
        System.out.println(name + ": I am smashed to pieces by " + cre.name + ".");
    }

    public void trip(Creature cre){
        System.out.println(name + ": I have tripped " + cre.name + ".");
        cre.underAttack(strength);
    }

    public void twine(Creature cre){
        System.out.println(name + ": I have twined " + cre.name + ".");
        cre.underAttack(strength*2);
    }

}