public class Scene {
    Monster snake;
    Monster scorpion;
    Gourd gourd3;
    Weapon sword;
    public Scene(){
        snake = MonsterFactory.createMonster("snake",100,15,10);
        scorpion = MonsterFactory.createMonster("scorpion");
        gourd3 = GourdFactory.createGourd(Color.YELLOW);
        sword = WeaponFactory.createWeapon("sword",100,30,10);
        snake.setWeapon(sword);
    }
    public static void main(String[] args) {
        Scene scene = new Scene();
        scene.play();
    }
    void play(){
        gourd3.speakTo(snake,"hahaha...");
        snake.speakTo(gourd3,"Don't you fear my sword?");
        gourd3.speakTo(snake,"that's all?");
        snake.speakTo(gourd3,"I would surrender if you accept 3 attack");
        gourd3.speakTo(snake,"ok.");
        snake.attack(gourd3);
        snake.attack(gourd3);
        gourd3.speakTo(snake,"hahahaha...");
        scorpion.fear();
        snake.updateWeapon();
        snake.attack(gourd3);
        snake.speakTo(gourd3,"hahaha...");
        scorpion.speakTo(gourd3,"hahaha...");
    }
}
