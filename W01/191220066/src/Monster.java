public class Monster extends Creature{
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Weapon weapon;
    public Monster(){
        health = 100;
        defense = 5;
        attack = 10;
    }
    void updateWeapon(){
        System.out.println("To do nothing");
    }
    public void attack(Creature b) {
        super.attack(b, getAttack());
    }
    public void fear(){
        System.out.println(name + ": I'm feard..");
    }
}
