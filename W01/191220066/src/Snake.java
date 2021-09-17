public class Snake extends Monster{
    public Snake(String name){
        super();
        this.name = name;
    }
    void updateWeapon(){
        System.out.println(name + ": update the " + weapon.getName()+"!");
        weapon = weapon.update();
        //setWeapon(weapon);
    }
    protected void attackWithWeapon(Creature b){
        weapon.attack(b);
    }

    @Override
    public void attack(Creature b) {
        attackWithWeapon(b);
    }
}
