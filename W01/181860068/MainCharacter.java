public class MainCharacter extends Creature {

    public MainCharacter(String name, int damage, int defence) {
        super(name, damage, defence);
    }

    private void listen(String word){
        System.out.println(name + " heard "+ "\""+word + "\"");
    }

    public void speek(MainCharacter target, String word){
        System.out.println(name + " speak to " + target.name);
        target.listen(word);
    }   

    public void control(String stat){
        System.out.println(name + " controls " + equipment.name);
        equipment.change(stat);
    }
}
