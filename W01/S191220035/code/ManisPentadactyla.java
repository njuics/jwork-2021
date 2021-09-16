package W01.S191220035.code;
// package W01.S191220035;
public class ManisPentadactyla extends Character {
    public ManisPentadactyla(){
        this.name = "穿山甲";
    }

    public ManisPentadactyla(String mood){
        super(mood);
        this.name = "穿山甲";
    }

    public void breakStone(){
        System.out.println(name + "破坏石头，看到了爷爷搂着二娃");
        this.moodChange("开心");
    }

    public void turnBack(){
        System.out.println(name + "回头看了一眼");
    }

    public void runToGrandfather(){
        System.out.println(name + "跑向爷爷");
    }

    public void leadOthers(){//穿山甲带路
        System.out.println(name + "带领爷爷和二娃");
    }

    public void push(Thing thing){//推
        System.out.println(name + "推" + thing.getName());
    }

    public void getOut(){
        System.out.println(name + "爬出山洞");
    }
}
