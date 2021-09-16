public class Entity extends Being {

    int status;

    public Entity(String name) {
        super(name);
    }

    public void open() {
        this.tellName();
        System.out.println("I open. ");
    }

    public void shine() {
        this.tellName();
        System.out.println("I shine. ");
    }

    public void beTakenOut() {
        this.tellName();
        System.out.println("I'm taken out. ");
    }

    public void beThrownOut() {
        this.tellName();
        System.out.println("I'm thrown out. ");
    }
}
