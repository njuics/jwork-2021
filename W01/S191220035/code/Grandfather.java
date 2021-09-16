package W01.S191220035.code;

public class Grandfather extends Character{
    public Grandfather(){
        this.name = "爷爷";
    }

    public Grandfather(String mood){
        super(mood);
        this.name = "爷爷";
    }

    public void heardDamage(){//听到石头有动静
        System.out.println(name + "听到石头在响");
        this.moodChange("惊讶");
    }

    public void lookAtMp(){ //看穿山甲
        System.out.println(name + "惊讶地看向穿山甲");
    }

    public void hugMP(){//爷爷拥抱穿山甲
        System.out.println(name + "激动地抱住穿山甲");
    }

    public void followMP(){//爷爷跟着穿山甲
        System.out.println(name + "跟着穿山甲");
    }

    public void push(Thing thing){//推
        System.out.println(name + "推" + thing.getName());
    }

}
