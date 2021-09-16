public class Weapon extends Being{
    public Weapon(){
        name = "weapon";
        health = 50;
        attack = 10;
        defense = 5;
    }

    @Override
    protected void logForReceiveAttack(int ap) {
        System.out.println("The " + getName() + "got " + ap + "points attack");
    }

    @Override
    protected void logForDead() {
        System.out.println("The " + getName() + "is damaged");
    }

    Weapon update(){
        System.out.println("the weapon is updated!");
        return WeaponFactory.createMagicWeapon(this);
    }

}
