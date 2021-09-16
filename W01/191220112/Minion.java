public class Minion extends Monster {

    public Minion(String name, int hp, int ap, int dp, int mp) {
        super(name, hp, ap, dp, mp);
    }

    public void untie(Creature c) {
        this.tellName();
        System.out.println("I untie " + c.getName() + ". ");
        c.beUntied();
    }

}
