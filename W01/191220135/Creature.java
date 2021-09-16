public class Creature extends Being {
    
    int hp;

    public Creature(String _name, int _hp) {
        super(_name);
        hp = _hp;
    }

    public void laugh() {
        System.out.println(name + ": hhhh...");
    }

    public void speak(String something) {
        System.out.println(name + ": " + something);
    }

    public void speakTo(Creature c, String something) {
        System.out.println(name + " speak to " + c.name + ": " + something);
    }

    public boolean isDead() {
        if(hp <= 0) {
            System.out.println(name + " is dead");
            return true;
        }
        return false;
    }
}