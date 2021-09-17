public class Creature extends Being{
    public Creature(){
        name = "x";
        health = 100;
        attack = 10;
        defense = 5;
    }
    public Creature(String _name,int _health,int _attack, int _defense){
        name = _name;
        health = _health;
        attack = _attack;
        defense = _defense;
    }
    @Override
    protected void logForReceiveAttack(int ap) {
        System.out.println(name + ": I got " + Math.max(ap,0) + " points attack");
    }

    @Override
    protected void logForDead() {
        System.out.println(name + ": I'm dead");
    }
    public void speakTo(Creature creature, String something) {
        System.out.println(name +" tell " + creature + "'" + something + "'");
        creature.listen(something);
    }
    public void listen(String something) {
        System.out.println(name+" heard: " + something);
    }
    public void receiveControl(Weapon weapon) {
        logForReceiveControl(weapon);
    }

    protected void logForReceiveControl(Weapon weapon) {
        System.out.println(name + ": I'm controlled by " + weapon.getName());
    }
}
