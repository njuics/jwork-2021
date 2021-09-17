public class Sanwa extends Huluwa {
    Sanwa(String nm, int hp, int ap, int dp, int mp){
        super(nm, hp, ap, dp, mp);
    }

    public void harder(){
        System.out.println(name + " uses the skill to become harder");
        attack += 50;
        defense = 999999;
    }
}