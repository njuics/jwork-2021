public class beesoldier extends  creature
{   public beesoldier(int hp,int ap,int dp) {
    health=hp;
    attack=ap;
    defense=dp;
    }
    public void receiveattack(beesoldier beesoldier,int attack){
        System.out.println( " beesoldier has received "+attack+" points of attack");
        if(attack>health) System.out.println("beesoldier is dead");
        else  {health-=attack; System.out.println(beesoldier + " 's hp has been reduced to "+health +" points!");}
    }}
