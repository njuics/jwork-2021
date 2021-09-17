public class Scene {
    Weapon knife;
    Weapon  claw1;
    Weapon claw2;
    Monster scorpion;
    Calabash threeboy;

    public Scene(){
        knife = new Weapon("knife");
        claw1 = new Weapon("claw1");
        claw2 = new Weapon("claw2");
        scorpion = new Monster(500, 50, 50, 2,"scorpion");
        threeboy = new Calabash(9999, 100, 999,"threeboy");
    }

    public void play(){
        threeboy.putPants();
        scorpion.sneer(threeboy, "haha, you are in the nude.");
    
        threeboy.attack(scorpion, threeboy.attack);
        scorpion.fall();
        threeboy.laugh();
        scorpion.wave(threeboy);
        scorpion.wave(threeboy);
        threeboy.destory(knife, 66);
        scorpion.getmad();
        threeboy.destory(knife, 34);
        scorpion.surprise();
        threeboy.laugh();
        scorpion.getmad();
        scorpion.magical();
        threeboy.speakTo(scorpion, "Come on!Let's van you see.");
        scorpion.attack(threeboy, scorpion.attack);
        threeboy.destory(claw1, 100);
        scorpion.magical();
        threeboy.speakTo(scorpion, "Come again!I will show you the deep dark fantasy.");
        scorpion.attack(threeboy, scorpion.attack);
        threeboy.attack(scorpion, threeboy.attack);
        scorpion.getmad();
        threeboy.sneer(scorpion, "Just this?");
        
    }
    public static void main(String[] args) {
        new Scene().play();
    }
}