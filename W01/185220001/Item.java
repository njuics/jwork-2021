package W01;

public class Item {
    

    String name;

    public Item() {
        name = "";
    }

    public Item(String name) {
        this.name = name;
    }

    public void receiveWater() {
        System.out.println(name + " get water");
    }

    public void receiveFire() {
        System.out.println(name + " caught fire");
    }

}
