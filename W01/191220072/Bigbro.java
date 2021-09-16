public class Bigbro extends Creature{
    private static Bigbro singleton = new Bigbro();
    private Bigbro(){
        super(2000, 200, 150, "Bigbro");
    }

    public static Bigbro getInstance(){
        return singleton;
    }

    public void dodge(){
        System.out.println(singleton + " surivived this attack ");
    }

    @Override
    public void receiveAttack(int ap){
        if(isDead())
            return;
        if(defense >= ap)
            dodge();
        else{
            health -= ap;
            System.out.println(name + " got " + ap + " points attack ");
        }
    }

    public void becomeMega(){
        System.out.println("Bigbro became MEGA BRO! ");
        health *= 2;
        attack *= 2;
        defense *= 2;
    }

    public void becomeNormal(){
        System.out.println("Time up! MEGA BRO became normal... ");
        health *= 2;
        attack *= 2;
        defense *= 2;
    }


}
