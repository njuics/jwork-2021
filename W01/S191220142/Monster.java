public class Monster extends Creature {
    int magic;

    Monster(String nm, int hp, int ap, int dp, int mp) {
        super(nm, hp, ap, dp);
        magic = mp;
    }

    @Override
    public void attack(Creature c) {
        System.out.println(name + " attacks " + c.getName() + " of " + attack*magic + " points");
        c.receiveAttack(attack * magic);
    }

    public void useWeapon(Weapon wp){
        System.out.println(name + " uses weapon: " + wp.getName() +", " + wp.getValue() + " atks up");
        attack += wp.getValue();
    }

    public void loseWeapon(Weapon wp){
        System.out.println(name + " loses weapon: " + wp.getName() +", " + wp.getValue() + " atks down");
        attack -= wp.
        getValue();
    }
    
    public void dance(){
        System.out.println(name + " is dancing");
    }
}