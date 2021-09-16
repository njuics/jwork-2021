public class SixthBro extends CalabashBro {

    boolean visible;
    
    public SixthBro(String _name, int _hp) {
        super(_name, _hp);
        visible = true;
    }

    public void hideSelf() {
        visible = false;
        System.out.println(name + " becomes invisible!");
    }

    public void gotIdea() {
        System.out.println(name + " rolls his eyes and gets an idea");
        System.out.println(name + " takes the pot and pours the wine");
    }

    public void enter() {
        System.out.println(name + " enters the door");
    }
}