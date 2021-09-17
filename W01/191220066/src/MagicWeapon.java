public class MagicWeapon extends Weapon{
    public MagicWeapon(){
        super();
        attack *= 2;
    }

    @Override
    public void attack(Creature b, int ap) {
        super.attack(b, ap);
        magicAttack(b);
    }

    protected void magicAttack(Creature b){
        logForControl(b);
        b.receiveControl(this);
    }
    protected void logForControl(Creature b){
        System.out.println("magic " + name + " control the " + b.getName());
    }
}
