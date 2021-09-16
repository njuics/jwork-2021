
public class Scene {

    public void play(){
        MainCharacter boy       = new MainCharacter("boy", 50, 99);
        MainCharacter scorpion  = new MainCharacter("scorpion", 80, 70);
        Creature hornets         = new Creature("hornet", 10, 60);
        Utility wind            = new Utility("wind");
        Utility fork            = new Utility("fork","broken");
        scorpion.equip(wind);
        scorpion.control("wind comes");
        scorpion.action("appears");
        hornets.action("appears");
        scorpion.control("wind fades");
        scorpion.speek(boy, "waaaaa!");        
        boy.speek(scorpion, "ahahahahaha!");
        boy.equip(fork);
        boy.control("repaired");
        hornets.attack(boy);
        hornets.attack(boy);
        boy.speek(boy, "itch!!! itch!");
        scorpion.attack(boy);
        boy.action("rush");
        boy.action("stab");
        scorpion.action("chop");
        boy.control("broken");
        boy.speek(boy, "ya!");
        scorpion.action("heavy chop");
        boy.action("evade");
        boy.attack(scorpion);
        boy.attack(scorpion);
        boy.attack(scorpion);
        scorpion.attack(boy);
        scorpion.action("throw");
        boy.action("throwed");
    }
    public static void main(String[] args) {
        new Scene().play();
    }
}
