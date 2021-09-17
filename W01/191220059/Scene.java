public class Scene {
    
    Human sanwa;
    Antman antman1;
    Xiezijing xiezijing;

    public Scene() {
        sanwa=new Human("sanwa",200,15);
        antman1 =new Antman("antman1");
        xiezijing =new Xiezijing("xiezijing");
    }

    public void play() {
        antman1.shout("“哇呀呀呀呀呀！”");
        sanwa.shout("“啊！！！”");
        antman1.hit(sanwa);
        sanwa.hit(antman1, 10);
        antman1.change_weapon(antweapons.arrow);
        antman1.hit(sanwa);
        sanwa.talkto(antman1, "“哈哈哈好痒，好痒啊！”");
        xiezijing.change_emotion(emotions.angry);
        xiezijing.hit(sanwa);
        xiezijing.change_form(forms.xiezi);
        xiezijing.change_weapon(weapons.hook);
        xiezijing.take_off_pants(sanwa);
        xiezijing.talkto(sanwa, "“哈哈！你逃不了了！”");
        xiezijing.change_form(forms.human);
        xiezijing.change_weapon(weapons.sword);
        sanwa.change_emotion(emotions.angry);
        sanwa.hit(xiezijing);
        sanwa.destroy_weapon(xiezijing);
        sanwa.shout("“哈哈哈啊哈哈啊！”");
        xiezijing.change_weapon(weapons.pliers);
        sanwa.talkto(xiezijing, "“来啊！”");
        xiezijing.hit(sanwa);
        xiezijing.weapon_broken();
        sanwa.shout("“哈哈哈哈哈！”");
        xiezijing.change_form(forms.cyclone);
        xiezijing.run_away();
        sanwa.shout("“别想跑！哪里走！”");
    }

    public static void main(String[] args)
    {
        Scene myscene=new Scene();
        myscene.play();
    }
}