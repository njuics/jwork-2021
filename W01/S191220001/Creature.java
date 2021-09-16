public class Creature extends Being{
    int health;//hp
    int attack;
    int defense;
    int magic;//mp
    boolean alive;

    String memory;

    public Creature() {
        memory="";
        alive=true;
    }
    public void speakTo(Creature creature, String words) {
        System.out.println(this.name + " tell " + creature.name + "'" + words + "'");
        creature.listen(words);
    }
    
    public void listen(String words) {
        System.out.println(this.name + " heard: " + words);
        memory = words;
    }

    public void attack(Creature creature, int ap) {
        System.out.println(this.name + " attack " + creature.name + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (defense < ap) {
            if (health>ap)
            {
                health -= ap;
                System.out.println(this.name + " got " + ap + "points attack");
            }
            else
            {
                System.out.println(this.name + " got " + health + "points attack");
                health = 0;
                this.beDead();
            }
        }
    }
    public void useMagic(Creature creature, int mp) {//使用魔法打人
        if (magic>=mp)
        {
            System.out.println(this.name + " use " + mp + " magic points on " + creature.name);
            creature.receiveMagic(mp);
            this.magic-=mp;
        }
        else
        System.out.println(this.name + " tried to use magic on" + creature.name + "but failed");
    }
    public void useMagic(Environment environment, int mp) {//使用魔法改变地形
        if (magic>=mp)
        {
            System.out.println(this.name + " use " + mp + " magic points on " + environment.name);
            environment.change();
            this.magic-=mp;
        }
        else
        System.out.println(this.name + " tried to use magic on" + environment.name + "but failed");
    }
    public void useMagic(Environment environment, int mp,String condition) {//使用魔法改变地形（具体）
        if (magic>=mp)
        {
            System.out.println(this.name + " use " + mp + " magic points on " + environment.name);
            environment.change(condition);
            this.magic-=mp;
        }
        else
        System.out.println(this.name + " tried to use magic on" + environment.name + "but failed");//没蓝了
    }
    public void receiveMagic(int mp) {//被魔法打
        int att=mp/10;
            if (health>att)
            {
                health -= att;
                System.out.println(this.name + " got " + att + "points magic attack");
            }
            else
            {
                System.out.println(this.name + " got " + health + "points magic attack");
                health = 0;
                this.beDead();
            }
    }
    public void beDead() {
            alive=false;
            System.out.println(this.name + " is dead");
    }

    public boolean isDead(){
        return alive;
    }
    public void move(Environment environment){
        System.out.println(this.name + " passed the " + environment.name);
    }
    public void look(Environment environment){
        System.out.println(this.name + " looked at the " + environment.name);
    }
}
