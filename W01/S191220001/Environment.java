public class Environment extends Being{
    boolean isChanged=false;
    Environment(String myname){
        name=myname;
    }
    public void change()
    {
        isChanged=!isChanged;
        System.out.println("The " + this.name +" has changed...");
    }
    
    public void change(String condition)
    {
        isChanged=!isChanged;
        System.out.println("The " + this.name +" is " + condition);
    }
}