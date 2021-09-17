public class Monster extends Creature {
    String weakness;

    public Monster(String _name,int _hp,int _attack,int _defence,String _weakness){
        hp=_hp;
        attack=_attack;
        defense=_defence;
        name=_name;
        weakness=_weakness;
    } 
 
}