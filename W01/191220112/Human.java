public class Human extends Creature {

    Human(String name) {
        super(name);
        health = 100;
        attack = 20;
        defense = 1;
    }

    public void laugh() {
        this.tellName();
        System.out.println("HAHAHAHA... ");
    }

    public void stretchArms() {
        this.tellName();
        System.out.println("I stretch my arms. ");
    }

    public void takeOut(Entity something) {
        String name = "";

        if (something != null) {
            name = something.getName();
        } else {
            name = "nothing";
        }

        this.tellName();
        System.out.println("I take out " + name + ". ");

        if (something != null) {
            something.beTakenOut();
        }
    }

    public void throwOut(Entity something) {
        this.tellName();
        System.out.println("Hey!!!");
        if (something != null)
            something.beThrownOut();
    }

}
