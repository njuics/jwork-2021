public class Item {
    String name;

    public Item(String init_name){
        this.name = new String(init_name);
    }

    protected String getName(){
        return this.name;
    }
}