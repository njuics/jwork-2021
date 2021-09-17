public class Human extends Creature{
    public Human(){}
    public Human(String n,double sp,double he,double ad){
        super(n,sp,he,ad);
    }
    public void Drukensaying(){
        System.out.println("这酒好凉，我不行了");
    }
    public void sign1(){
        System.out.println(this.getName()+"大喊四哥四哥，哎！");
    }
    public void sign(){
        System.out.println(this.getName()+"嘲笑道：你们真小气，我还没尝出味道就没了");
    }
}
