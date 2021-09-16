package S191220159;

public class SixWa extends Creature{

    int status;
    public SixWa(String _name, int _status) {
        super(_name);
        status = _status;
    }

    public void use(Item item,Monster monster){
        System.out.println( name + " use " + item.name + " to attarct " + monster.name );
        item.beUsed(item,monster);
    }
    public void hide(){
        System.out.println( name + " disappeared");
        status = 1;
    }
    public void show(){
        System.out.println( name + " appeared");
        status = 0;
    }
}