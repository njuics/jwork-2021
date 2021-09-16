public class Creature extends Being{
    boolean isSit;
    String name;
    int mana = 100;
    String skill;
    int anger = 0;

    public Creature() {
        isSit = true;
    }

    public void speakTo(Creature creature,String words) {
        System.out.println(name + " 对 " + creature.name + " 说 " + " '" + words + "'");
    }

    public void speakTo(Creature creature1,Creature creature2,String words) {
        System.out.println(name + " 对 " + creature1.name +" 和 "+ creature2.name + " 说 " + " '" + words + "'");
    }

    public void stand() {
        isSit = false;
        System.out.println(name + " 站起来了");
    }

    public void sit() {
        isSit = true;
        System.out.println(name + " 坐下了");
    }

    public void drink(BottleOfWine wine, int num) {
        wine.volume -= num;
        if(wine.volume <= 0) {
            wine.volume = 0;
        }
        System.out.println("酒被 " + name + " 喝光了");
        anger -= 20;
        if(anger <= 0) {
            anger = 0;
        }
    }

    public void useSkill(int num) {
        if(mana >= 80) {
            System.out.println(name + " 消耗了 "+ num + " 魔力," + " 使用了 " + skill);
            mana -= num;
        }else{
            System.out.println("魔力值不足，无法使用技能");
        }

    };
}
