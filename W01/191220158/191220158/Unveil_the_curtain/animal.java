public class animal extends Creature {
    animal(String _name){
        name=_name;hp=1;attack=1;defense=1;
    }
    public void xijuren(){
        System.out.println(name+"is fall off a cliff");
        System.out.println(name+" speaks: Aa Aa Aa Aa Aa Aa Aa Aa Aa Aa Aa Aa Aa!");
        System.out.println("And a big rock fall on"+name);
        this.receiveAttack(100000);
    }
}