public class monster  extends creature{
    public monster(int hp,int ap,int dp) {
        health=hp;
        attack=ap;
        defense=dp;
        }
    
    public void slipdown(monster monster){
        System.out.println(monster+" slip down heavily.");
        health-=50;
        System.out.println(monster+" 's hp has been reduced to 150 points!");}
    
         public void brighteyes(monster monster){
        System.out.println(monster+"'s eyes become bright.");
    }
    public void roar(monster monster){
        System.out.println(monster+" roar angrily.");
    }
    public void catchon(monster monster,goods goods){
        System.out.println(monster+" catch on the "+goods+".");
    }
   
}
