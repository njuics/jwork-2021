package W01.S191220035.code;
// package W01.S191220035;
public class KidTwo extends Character{
    public KidTwo(){
        this.name = "二娃";
    }

    public KidTwo(String mood){
        super(mood);
        this.name = "二娃";
    }

    public void heardDamage(){//听到石头有动静
        System.out.println(name + "听到石头在响");
        this.moodChange("惊讶");
    }

    public void lookAtMp(){ //看穿山甲
        System.out.println(name + "惊讶地看向穿山甲");
    }

    public void followMP(){//二娃跟着穿山甲
        System.out.println(name + "跟着穿山甲");
    }

    public void push(Thing thing){//推
        System.out.println(name + "推" + thing.getName());
    }
}
