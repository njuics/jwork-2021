package proj;

public class Scene {

    Human theold;
    Human blinder;
    Pangolin bigsmart;
    Monster frog1;
    Monster frog2;
    proj.Trident mvp;


    public Scene()
    {
        bigsmart=Pangolin.getInstance();
        theold=new Human("爷爷",100,2);
        blinder=new Human("二娃",100,0);
        frog1=new Monster("小黄",100,10);
        frog2=new Monster("小蓝",100,10);
        mvp=new Trident(20);
    }

    public void play() {
        frog1.speakTo(frog2,"站岗好烦，我要睡觉");
        frog2.speakTo(frog1,"是啊是啊");
        frog1.sleep();
        frog2.sleep();

        theold.move();
        blinder.move();
        bigsmart.move();

        AccidentInjure.play(mvp,theold,frog2);
        frog2.speakTo(frog1,"你打我干啥");
        frog1.speakTo(frog2,"我没有");
        frog2.attack(frog1, frog2.attack);
        frog1.attack(frog2, frog1.attack);
        bigsmart.move();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
