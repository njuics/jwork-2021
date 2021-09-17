public class Monster extends Creature{
    Monster(String cname,int hp){
        HP = hp;
        name = cname;
    }
    public void kiss(Creature creature){
        System.out.println(this.getName() + " kiss " + creature.getName());
    }
    public void shout(String str){
        System.out.println(this.getName() + "shout: " + str);
    }
    public void bePissed(String str){
        System.out.println(this.getName() + " is bepissed: " + str);
    }
}
