package S191220159;

public class Item extends Being {

    public Item(String _name) {
        name = _name;
    }

    public void attract(Monster monster){
        System.out.println(name + " attract " + monster.name);
        monster.beAttracted();
    }
    
    public void stab(Monster monster){
        System.out.println(name + " stab " + monster.name);
        monster.beStabbed();
    }

    public void trap(Monster monster){
        System.out.println(name + " trap " + monster.name);
        monster.beTrapped();
    }

    public void beKicked(Item item,Monster monster) {
        item.attract(monster);
    }

    public void beUsed(Item item,Monster monster) {
        item.attract(monster);
    }

    public void open(){
        System.out.println(name + " open");
    }
    public void close(){
        System.out.println(name + " close");
    }
}
