package gourd;

public class StoneGate extends Being{
    int state;
    public void changeState(){
        if(state==0)
            System.out.println("The gate opens...");
        else
            System.out.println("The gate closes...");
        state=state^1;
    }
}