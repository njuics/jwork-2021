
public class Human extends Creature{
    Human(String name)
    {
        super();
        this.name=name;
    }

    public Human(String name,int HP,int attack_value) {
        super();
        this.name=name;
        this.HP=HP;
        this.attack_value=attack_value;
    }
    @Override
    public void gethurt(int value) {
        System.out.println("It's useless");
    }

    public void hit(Creature someone) {
        super.hit(someone, attack_value);
    }
    public void destroy_weapon(Xiezijing xzj)
    {
        System.out.println(name + " destroy " + xzj.name +"'s weapon!");
        xzj.change_weapon(weapons.hand);
    }
}
