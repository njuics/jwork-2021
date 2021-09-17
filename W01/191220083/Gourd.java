
public class Gourd extends Creature {
    public Gourd(String str)
    {
        name = str;
    }
    void getTouched()
    {
        System.out.println(name+" get touched");
    }
    void getHug()
    {
        System.out.println(name+" get hug");
    }
    @Override
    void generate()
    {
        System.out.println("I, "+name+", was born.");
    }
}
