package W01;

public class Bucket extends Item {

    boolean fill;

    public Bucket() {
        fill = false;
        name = "Bucket";
    } 
    
    @Override
    public void receiveWater() {
        String tmp = "";
        if (isFull())
            tmp = "spill";
        else
            tmp = "fill";

        System.out.println(name + " get water(" + tmp + ")");
    }

    public boolean isFull() {
        if (fill == false) {
            fill = true;
            return false;
        }
        return false;
    }
}
