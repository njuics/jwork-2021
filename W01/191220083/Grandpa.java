
public class Grandpa extends Creature{
    void sob()
    {
        System.out.println("Grandpa is sobbing.");
    }
    void touch(Gourd kid)
    {
        System.out.println("Grandpa gently touch "+kid.name+".");
        kid.getTouched();
    }
    void hug(Gourd kid)
    {
        System.out.println("Grandpa gently hug "+kid.name+".");
        kid.getHug();
    }
}
