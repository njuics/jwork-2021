package CalabashBoys;

public class Leaf extends Thing{
    protected boolean isOpen;
    public Leaf(){
        name="Leaf";
        isOpen=false;
    }

    public void open(){
        isOpen=true;
        System.out.println("Leaf is open.");
    }

    @Override
    public void getPushed(){
        this.open();
    }
}
