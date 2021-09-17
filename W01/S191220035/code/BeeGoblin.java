package W01.S191220035.code;

public class BeeGoblin extends Character{
    public BeeGoblin(){
        this.name = "黄蜂精";
    }

    public BeeGoblin(String mood){
        super(mood);
        this.name = "黄蜂精";
    }

    public void flyIn(){//飞入山洞中
        System.out.println(name + "飞入山洞");
    }

    public void jumpWithAngry(){
        System.out.println(name + "跳起来");
        moodChange("愤怒");
    }

    public void flyOut(){//飞出山洞
        System.out.println(name + "飞出山洞");
    }
}
