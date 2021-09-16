package W01;

public class Kettle extends Item {

    public Kettle() {
        name = "Kettle";
    } 
    
    @Override
    public void receiveFire() {

        System.out.println(name + " caught fire(boiling)");
    }

}
