public class Snake extends Monster {
    private static Snake singleton = new Snake();
    private Snake(){
        super(1000, 200, 0, "Snake");
    }

    public static Snake getInstance(){
        return singleton;
    }

    public void magic(Creature victim){
        attack(victim);
    }

    public void pondering(int n){
        System.out.println("Snake pondered " + n + " seconds. ");
        try{
        Thread.sleep(n*1000);
        }
        catch(Exception e){
            Thread.currentThread().interrupt();
        }

    }
    public static void main(String args[]){
        Snake snake = Snake.getInstance();
        snake.pondering(3);
        snake.speak("fxxx");
    }
}
