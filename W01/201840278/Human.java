public class Human extends Creature{
    String color;

    Human(String _name, String _color, String _skill) {
        name = _name;
        color = _color;
        skill = _skill;
    }

    @Override
    public void useSkill(int num) {
        if(mana >= 50) {
            System.out.println(name + " 消耗了 "+ num + " 魔力," + " 使用了 " + skill);
            mana -= num;
        }else{
            System.out.println("魔力值不足，无法使用技能");
        }

    };
}
