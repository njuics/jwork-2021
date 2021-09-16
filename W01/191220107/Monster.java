//package W01.191220107;

public class Monster extends Creature {
    Monster(String _name) {
        name = _name;
        health = Integer.MAX_VALUE;
        attack = Integer.MAX_VALUE;
        defence = Integer.MAX_VALUE;
        //the monster is Invincible now.
    }

    public void _catch(Creature target) {
        System.out.println(name + " catched " + target);
    }

    public void _throw(Creature target) {
        System.out.println(name + " throwed " + target);
    }

    public void angry(){
        System.out.println(name +" got angry.");
    }
}
