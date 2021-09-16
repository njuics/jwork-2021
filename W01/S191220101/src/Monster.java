public class Monster extends Creatrue{
    Monster(int hp,int ap,int dp,String s){
        health=hp;
        attack=ap;
        defense=dp;
        name=s;
    }
    
    public void jump(Creatrue crea) {
        System.out.println(name + "跳到" + crea.name + "手上");
    }

    public void look() {
        System.out.print(name + "看到水晶石画面");
    }

    public void isLooked() {
        System.out.println(name + "被千里眼照到");
    }
}
