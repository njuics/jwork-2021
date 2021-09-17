package CalabashBoys;

public class FlowerWine extends Thing{
    protected boolean isFull;

    public FlowerWine(){
        name="FlowerWine";
        isFull=true;
    }

    public void beEmpty(){
        isFull=false;
        System.out.println("FlowerWine is empty.");
    }
}
