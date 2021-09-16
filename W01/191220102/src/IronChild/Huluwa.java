package IronChild;

public class Huluwa extends Yaojing {

    public Huluwa(String n, int hp, int ap, int dp, int mp) {
        super(n, hp, ap, dp, mp);
    }

    public void gift() {
        defense *= 10000;
        System.out.println(name + "'s gift launch: I'm invulnerable.");
    }
}
