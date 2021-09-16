public class Scene {
    Human Dawa;
    Spider spider;
    Monster snake;
    Monster scorpion;

    public Scene(){
        Dawa = new Human("Dawa",100);
        spider = new Spider();
        snake = new Monster("Snake",200);
        scorpion = new Monster("Scorpion",200);
    }

    public void play(){
        scorpion.laugh("Haha! Hehehehe...");
        Dawa.awake();
        snake.speakTo(Dawa,"Hey, Huluwa. How is it? Have a good dream?");
        Dawa.rollEyes();
        snake.speakTo(Dawa,"I'm telling you, your dantian has been sealed by me, so don't want to go wild anymore");
        spider.pull();
        snake.speakTo(Dawa,"Ah, I really don’t want to kill you, you are so stupid, brute and cute");
        Dawa.rollEyes();
        snake.speakTo(Dawa,"You are so likable, as long as you are willing,");
        snake.kiss(Dawa);
        snake.kiss(Dawa);
        Dawa.shock();
        snake.speakTo(Dawa,"you be my baby!");
        scorpion.laugh("Hehehehe...");
        Dawa.attack(snake,10,"spit");
        Dawa.attack(scorpion,5,"spit");
        snake.shout("Ah oh!");
        scorpion.shout("Aaa...");
        Dawa.laugh("Hahahahahahahahaha");
        scorpion.bePissed("Wayayayayayaya...");
        snake.bePissed("Yayayaya! You, youyouyou...");
        scorpion.attack(Dawa,50,"throw iron fork");
        Dawa.shock();
    }

    public static void main(String[] args){
        new Scene().play();
    }
}
