

public class Scene{
  
   huluwa sanwa;
   monster scorpion;
   beesoldier beesoldier;
   arrow arrow;
   broadsword broadsword;
   largefork largefork;
   spear  spear;
   stone  stone;
   
   public Scene() {
    sanwa=new huluwa(100, 30, 300);
    scorpion=new  monster(200,40,100);
    beesoldier=new beesoldier(50,10,0);
    arrow=new arrow();
    broadsword= new broadsword();
    largefork=new largefork();
    spear=new spear();
    stone=new stone();
}
    public void play() {
    
    sanwa.laugh(sanwa);
    
    scorpion.laugh(scorpion);
    scorpion.brighteyes(scorpion);
   
    sanwa.takeup(sanwa, largefork);
    sanwa.throwto(sanwa,largefork,stone);

    largefork.insert(stone);

    sanwa.putstraight(sanwa, largefork);
    sanwa.pullout(sanwa, largefork);

    beesoldier.use(beesoldier, spear);
    spear.attack(spear,sanwa);

    sanwa.use(sanwa,largefork);
    largefork.resist(largefork, spear);
    largefork.fightback(largefork,beesoldier);
    beesoldier.receiveattack(beesoldier,30);

    arrow.attack(arrow, sanwa);
    sanwa.resist(sanwa, arrow);

    sanwa.talk(sanwa, "好痒，好痒...啊哈哈哈哈哈哈哈");
    sanwa.laugh(sanwa);

    scorpion.roar(scorpion);
    scorpion.talk(scorpion, "哇呀呀呀呀呀呀呀");
    scorpion.use(scorpion, broadsword);
   
    broadsword.attack(broadsword, sanwa); 
    sanwa.use(sanwa, largefork);
    largefork.resist(largefork, broadsword);
    
    broadsword.attack(broadsword, sanwa); 
    sanwa.dodge(sanwa);
    
    scorpion.attack(scorpion, sanwa);
    sanwa.fightback(sanwa, scorpion);
    largefork.breakintohalves();

    broadsword.attack(broadsword, sanwa); 
    sanwa.dodge(sanwa);
    sanwa.kick(sanwa, scorpion);
    sanwa.talk(sanwa, "去!");
    scorpion.slipdown(scorpion);

    sanwa.throwto(sanwa, largefork, scorpion);
    scorpion.catchon(scorpion, largefork);
    sanwa.throwto(sanwa, largefork, scorpion);
    scorpion.catchon(scorpion, largefork);

}
    public static void main(String []args){
        new Scene().play();
       }
}