public class creature extends being{
    int health;
    int attack;
    int defense;
    
   
    
    public void talk(creature creature,String something){
        System.out.println(creature+" says "+something);
    }
    
    public void laugh(creature creature){
        System.out.println(creature + " laughs loudly.");
      }
    public void use(creature creature,goods goods){
        System.out.println(creature + " start to use "+goods);
    }
    
}
