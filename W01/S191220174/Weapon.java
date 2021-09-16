public class Weapon extends Being{
    int durability;
    public Weapon(String n){
        name = n;
        durability = 100;
    }
    public void receivehurt(final int ap) {
        if(!isbroken()){
            durability -= ap;
            System.out.println(name +" got " + ap + "points attack");
        }
        isbroken();
    }
    public boolean isbroken(){
        if (durability<=0){
            System.out.println(name +" is broken");
            return true;
        }
        else return false;
    }
}