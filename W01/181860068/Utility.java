
public class Utility extends Being{
    protected String state;
    
    public Utility(String name){
        super(name);
    }
    public Utility(String name, String stat){
        super(name);
        state = stat;
    }
    public void change(String stat){
        state = stat;
        System.out.println(name + " " + state);
    }
}
