public class WeaponFactory extends Factory{
    public static Weapon createWeapon(){
        return new Weapon();
    }

    public static Weapon createMagicWeapon(String type){
        if(type == "magic"){
            return new MagicWeapon();
        }
        return new Weapon();
    }
    public static Weapon createWeapon(String name,int health,int attack,int defense){
        Weapon weapon = new Weapon();
        weapon.setName(name);
        weapon.setHealth(health);
        weapon.setAttack(attack);
        weapon.setDefense(defense);
        return weapon;
    }
    public static Weapon createMagicWeapon(String name,int health,int attack,int defense){
        Weapon weapon = new MagicWeapon();
        weapon.setName(name);
        weapon.setHealth(health);
        weapon.setAttack(attack);
        weapon.setDefense(defense);
        return weapon;
    }
    public static Weapon createMagicWeapon(Weapon weapon){
        Weapon wp = new MagicWeapon();
        wp.setName(weapon.getName());
        wp.setDefense(weapon.getDefense());
        wp.setAttack(weapon.getAttack()*2);
        wp.setHealth(weapon.getHealth());
        return wp;
    }
}
