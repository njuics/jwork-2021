public class MonsterFactory extends Factory{
    public static Monster createMonster(String name){
        if(name.indexOf("snake")!=-1){
            return new Snake(name);
        }
        else if(name.indexOf("scorpion")!=-1){
            return new Scorpion(name);
        }
        return null;
    }
    public static Monster createMonster(String name,int health,int attack,int defense){
        Monster monster = createMonster(name);
        if(monster!=null){
            monster.setName(name);
            monster.setAttack(attack);
            monster.setDefense(defense);
            monster.setHealth(health);
        }
        return monster;
    }

}
