public class Door extends Being{
    
    public Door(String _name) {
        super(_name);
    }

    public void open() {
        System.out.println("The door is open");
    }

    public void close() {
        System.out.println("The door is closed");
    }
}