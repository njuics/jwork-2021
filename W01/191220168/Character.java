public class Character{
    protected String name;
    protected int hp;
    protected int attackpower;
    public Character(String name, int hp, int attackpower){
        this.name = name;
        this.hp = hp;
        this .attackpower = attackpower;
    }

    public void attack(Character target, Weapon weapon, boolean miss){
        if (miss){
            System.out.println(this.name + " attacks " +target.name);
        }
        else{
            target.hurt(this.attackpower + weapon.damage);
            System.out.println(this.name + " attacks " +target.name);
        }
    }

    public void hurt(int damage){
        hp = hp - damage;
        System.out.println(name + " got " + damage + " points attack.");
        if (hp <= 0){
            System.out.println(name + " was defeated!");
        }
    }

    public void hear(String comment){
        System.out.println(this.name +" hear " + "'" + comment + "'");
    }

    public void tell(Character target, String comment){
        System.out.println(this.name + " tell " + target.name + " '" + comment + "'");
        target.hear(comment);
    }

    public void miss(){
        System.out.println(name + " miss attack!");
    }
}