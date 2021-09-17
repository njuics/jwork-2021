public class StretchHandMonster extends Monster {
    public StretchHandMonster(int hp, int ap, int dp){
        super(hp,ap,dp);
    }
    public void catchAttack(Creature c, int ap){
        System.out.println(this.name+" stretches its body and catches "+c.name+"!");
        this.attack(c,ap);
    }
}
