public class monster extends Creature{
    String weakness;

    public monster(String _name,int _hp,int _attack,int _defence,String _weakness){
        hp=_hp;
        attack=_attack;
        defense=_defence;
        name=_name;
        weakness=_weakness;
    } 

}