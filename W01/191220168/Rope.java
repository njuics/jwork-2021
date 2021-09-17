public class Rope extends Weapon{
    public Rope(String name, int damage){
        super(name, damage);
    }
    public void tie(Character src, Character target){
        System.out.println(src.name + " use rope tie " + target.name);
    } 
}