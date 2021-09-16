

public class CalabashBrother extends Creature {

    CalabashBrother(String _name) {
        super(_name);
        health = 114514;
        attack = 100;
        defense = 1000;
    }

    @Override
    public void receiveRock(Rock rock , Creature attacker) {
        health-=1;
        System.out.println(name + " catches " + rock.get_name() + " and throw it back to " + attacker.get_name()+"!");
        attacker.receiveRock(rock, this);
    }

    @Override
    public void attack(Creature creature, int ap , String type){
        System.out.println(name + " uses " + type + "  and attack " + creature.get_name()+" of " + ap +" points!");
        creature.receiveAttack(ap);
    }

}
