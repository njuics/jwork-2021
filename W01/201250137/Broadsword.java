

public class Broadsword extends Being{
    public Broadsword(double hp){
        this.hp = hp;
    }

    public void cutOff(){
        System.out.println("大宝剑裂开来");
    }

    public void broken(){
        System.out.println("大宝剑又被戳了个洞彻底报废了");
    }

    public void broke(double strength){
        hp -= strength;
        if (hp <= 0){
            broken();
        }
        else if (hp <= 5){
            cutOff();
        }
    }
}
