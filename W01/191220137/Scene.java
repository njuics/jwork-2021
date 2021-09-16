//package W01.191220137;

public class Scene {
    CalabashBrothers theThird;
    Monster snake;
    Monster scorpion;
    Crystal crystal;

    public Scene() {
        theThird = new CalabashBrothers(400, 30, 100, 2);
        snake = new Monster(200, 10, 20, 2);
        scorpion = new Monster(500, 50, 50, 2);
        crystal = new Crystal(50, 0, 0);
    }

    public void play() {
        snake.speakTo(theThird, "Ahh?");
        scorpion.speakTo(theThird, "Oops!");

        theThird.speakTo(snake, "I'm coming!");
        
        snake.speakTo(theThird, "En?");
        scorpion.speakTo(theThird, "Ahh?");
        
        snake.wink(theThird);

        theThird.speakTo(snake,"HEYYY!");
        theThird.attack(crystal,30);

        crystal.beBroken();

        snake.speakTo(scorpion, "Ah!");
        scorpion.speakTo(snake, "Ahh?!");

        scorpion.cry();
        scorpion.speakTo(theThird,"My precious!");
        snake.cry();

        theThird.speakTo(snake,"Hahahahahahaha!");

        snake.attack(theThird,10);

        theThird.speakTo(snake,"Surrender, you vermin!");

        snake.rolleyes();
        snake.speakTo(theThird,"You ...");

        theThird.speakTo(snake,"Hahahahaha ...");

        snake.speakTo(theThird,"OK!");
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
