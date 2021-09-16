enum forms{human,xiezi,cyclone};
enum weapons{sword,hand,pliers,hook};
public class Xiezijing extends Creature{
    forms form;
    weapons weapon;
    Xiezijing(String name)
    {
        super();
        this.name="xiezijing";
        HP=150;
        form=forms.human;
        weapon=weapons.sword;
        
    }
    public void change_form(forms form)
    {
        this.form=form;
        if(form==forms.human)
        {
            agile=0;
            System.out.println(name + " change the" + " form" + " to" + " human");
        }
        else if(form==forms.xiezi){
            agile=10;
            System.out.println(name + " change the" + " form" + " to" + " xiezi");
        }
        else if(form==forms.cyclone)
        {
            agile=20;
            System.out.println(name + " change the" + " form" + " to" + " cyclone");
        }
    }
    public void change_weapon(weapons weapon)
    {
        this.weapon=weapon;
        if(weapon==weapons.sword)
        {
            attack_value=15;
            System.out.println(name + " change the" + " weapon" + " to" + " sword");
        }
        else if(weapon==weapons.hand){
            attack_value=10;
            System.out.println(name + " change the" + " weapon" + " to" + " hand");
        }
        else if(weapon==weapons.pliers)
        {
            attack_value=20;
            System.out.println(name + " change the" + " weapon" + " to" + " pliers");
        }
        else if(weapon==weapons.hook)
        {
            attack_value=20;
            System.out.println(name + " change the" + " weapon" + " to" + " hook");
        }
    }
    public void hit(Creature someone) {
        if(weapon==weapons.sword)
        {
            System.out.println(this.name + " hit " + someone.name + " with sword");
            someone.gethurt(15);
        }
        else if(weapon==weapons.hand){
            System.out.println(this.name + " hit " + someone.name + " with hands");
            someone.gethurt(10);
        }
        else if(weapon==weapons.pliers)
        {
            System.out.println(this.name + " hit " + someone.name + " with pliers");
            someone.gethurt(20);
        }
    }
    public void weapon_broken()
    {
        System.out.println(name + "'s " + this.weapon + " is broken");
        change_weapon(weapons.hand);
    }
    public void take_off_pants(Creature a)
    {
        System.out.println(name + " take off " + a.name +"'s pants");
    }
}