package hw01;

public class Scene {

    Monster snake;
    Monster scorpion;
    Hulu dawa;

    public Scene(){
        snake = new Monster(200,10,20,40,8,"snake");
        scorpion = new Monster(500,20,20,10,2,"scorpion");
        dawa = new Hulu(300,20,100,"dawa");
    }

    public void play(){

        dawa.speakTo(snake,"Monster, pay my grandfather soon!");

        snake.rolleyes();
        snake.speakTo(dawa,"OK,You are a filial child.I am your mother");

        dawa.speakTo(snake,"Fuck off");

        scorpion.setMood(7);
        scorpion.laugh();

        dawa.speakTo(scorpion,"Otherwise, your home will be destroyed.");

        scorpion.setMood(-7);
        scorpion.laugh();
        scorpion.attack(dawa,"P");

        scorpion.bePissed();

        snake.attack(dawa,"M");

    }
    
    public static void main(String[] args){
        new Scene().play();
    }

   
}
