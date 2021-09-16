public class Scene{
    Cucumis thirdBro;
    Monster scorpion;
    Sword sword;
    Scene()
    {
        thirdBro=new Cucumis("三娃",100,50,50);
        scorpion=new Monster("蝎子精",100,10,10);
        sword=new Sword(100);
    }
    void play()
    {
        thirdBro.bePissed();
        thirdBro.attack(scorpion);
        scorpion.bePissed();
        scorpion.equipWeapon(sword);
        scorpion.missedAttack(thirdBro);
        scorpion.missedAttack(thirdBro);
        scorpion.missedAttack(thirdBro);
        thirdBro.attack(sword);
        scorpion.bePissed();
        thirdBro.strengthen();
        thirdBro.attack(sword);
        scorpion.beScared();
        thirdBro.laugh();
        scorpion.bePissed();


        scorpion.unequipWeapon();

        scorpion.strengthen();
        thirdBro.beScorned();
        scorpion.attack(thirdBro);
        thirdBro.laugh();
        scorpion.bePissed();
        scorpion.strengthen();
        thirdBro.beScorned();
        scorpion.attack(thirdBro);
        thirdBro.laugh();
        scorpion.beScared();
        scorpion.escape();

    }
    public static void main(String[] args) {
        new Scene().play();
    }
}

