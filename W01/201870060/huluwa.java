public class huluwa extends creature{
    public huluwa(int hp,int ap,int dp) {
        health=hp;
        attack=ap;
        defense=dp;
        }
   public void kick(huluwa huluwa,creature creature) {
        System.out.println(huluwa + " kick "+ creature+" heavily");
    }
    public void putstraight(huluwa huluwa,goods goods){
        System.out.println(huluwa+" put the "+goods+" straight");
    }
    public void takeup(huluwa huluwa,goods goods){
        System.out.println(huluwa+" take up the "+goods);
    }
    public void pullout(huluwa huluwa,goods goods){
        System.out.println(huluwa +" pull out the "+goods);
    }
    public void throwto(huluwa huluwa,being being1,being being2){
        System.out.println(huluwa+" throw "+being1+" to "+being2);
    }
    public void dodge(huluwa huluwa){
        System.out.println(huluwa+" dodge to avoid the attack");
        System.out.println("hp remains!");
    }
   
}
