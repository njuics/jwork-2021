public class Monster extends Creature {
    public Monster(){}
    public Monster(String n,double sp,double he,double ad){
        super(n,sp,he,ad);
    }
    public void provideAlcohol(Creature c, int num, String s) {
        Wine m = magic(num, s);
        System.out.println(this.getName()+"提供给"+c.getName()+num+s);
        c.drinkAlcohol(m);
    }


    public Wine magic(int num, String s) {
        int degree;
        if (s.equals("冷泉清凉"))
            degree = 70;
        else if (s.equals("蝎子的坛坛酒"))
            degree = 20;
        else
            degree = 1000;
        return new Wine(s, degree, num);

    }

    public void sign1() {
        System.out.println(this.getName()+"大哭道：我的酒啊");
    }
    public void sign2(){
        System.out.println(this.getName()+"叹息道，"+"真是个毛孩子");
    }
    public void sign3(){
        System.out.println(this.getName()+"自言自语：如意如意随我心意快快显灵");

    }
}
