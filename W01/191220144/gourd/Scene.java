package gourd;
public class Scene{
    Stone s;
    StoneGate sg;
    Gourd g6,g7;
    CalaBro c6;
    Stalactite st;
    Vat v;
    Snake sn;
    Scorpion sc;
    public Scene(){
        s=new Stone();
        sg=new StoneGate();
        g6=new Gourd();
        g7=new Gourd();
        st=new Stalactite();
        v=new Vat();
        sn=new Snake();
        sc=new Scorpion();
    }
    public void play(){
        sn.shout("哈哈哈哈哈哈哈");
        sc.listen("哈哈哈哈哈哈哈");
        g6.swing();
        g7.swing();
        sc.speakTo(sn,"夫人深谋远虑，七个葫芦终于都抓到手了，还要请夫人趁早把它们炼成七心丹");
        sn.listen("夫人深谋远虑，七个葫芦终于都抓到手了，还要请夫人趁早把它们炼成七心丹");
        sn.flashEyes();
        sn.speakTo(sc,"我看小葫芦长的很嫩，趁它还没有成熟，Ummm,可以把它培育成我们的葫芦娃");
        sc.listen("我看小葫芦长的很嫩，趁它还没有成熟，Ummm,可以把它培育成我们的葫芦娃");
        sg.changeState();
        st.dropWater(v);
        v.receiveWater();
        sn.shout("嘿");
        sc.listen("嘿");
        sn.throwOut(g6, st);
        st.dropWater(g6);
        g6.receiveWater();
        g6.swing();
        g6.getRid();
        g6.jump();
        g6.attack(sn);
        sn.hurt(g6.atk);
        g6.attack(sc);
        sc.hurt(g6.atk);
        c6=g6.bomb();
        c6.stealth();
        sn.mad();
        sn.shout("哎呀不好！葫芦娃跑了");
        sc.listen("哎呀不好！葫芦娃跑了");
        sc.mad();
        sn.shout("快抓住他");
        sc.listen("快抓住他");
        c6.attack(sn);
        sn.hurt(c6.atk);
        c6.attack(sc);
        sc.hurt(c6.atk);
        s.collide(sc);
        sc.hurt(s.atk);
        sc.shout("哎呀，抓住他");
        sn.listen("哎呀，抓住他");
        c6.appear();
        c6.run();
        c6.stealth();
    }
    public static void main(String[] args) {
        new Scene().play();
    }
}