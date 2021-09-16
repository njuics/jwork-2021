public class Creature extends Being{
    int hp;
    int attack;
    int defense;
    String name;

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " speak to " + creature.name + ": " + something);
    }

    public void listen(String something) {
        System.out.println(name+" hearded: " + something);
    }

    public void laugh() {
        System.out.println(name+" laugh out loudly. ");
    }

    public void attack(Creature creature, int ap) {
        System.out.println(name +" trying to attack " + creature.name+" at " +  attack+ " points" );
        creature.receiveAttack(ap);
    }

    public void attack(Creature creature, int ap,String weakness) {
        System.out.println(name+" trying to attack " + creature.name+"on his weakness!" );
        creature.receiveAttack(ap,weakness);
    }

    public void receiveAttack(int ap) {
        if (defense < ap) {
            hp -= ap;
            System.out.println(name+" got " + (ap-defense) + "points attack");
            if(isDead()==true)
                System.out.println(name+"is dead");
        }
        else 
        System.out.println(this.name+" is too strong for this attack");
    }

    public void receiveAttack(int ap,String _weak) {
    }

    public boolean isDead() {

        if (hp <= 0) {
            return true;
        }
        return false;
    }

}