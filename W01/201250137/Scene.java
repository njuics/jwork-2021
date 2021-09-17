

public class Scene {
    Gourd gourdThird;
    Monster scorpion, snake, goblin;
    StoneDoor door;

    public Scene(){
        gourdThird = new Gourd(100, 20, 1, 1, "gourdThird");
        scorpion = new Monster(100, 20, 0.5, 1, "scorpion");
        snake = new Monster(100, 20, 0.5, 1, "snake");
        goblin = new Monster(50, 10, 0.2, 0.5, "goblin");
        door = new StoneDoor();
    }
    public void play(){
        door.open();

        gourdThird.attack(30, scorpion);
        gourdThird.complacent();

        scorpion.angery();
        scorpion.badAttack(20, gourdThird);

        gourdThird.workHard();
        gourdThird.attack(30, scorpion);

        scorpion.block(6);
        scorpion.shock();
        scorpion.angery();

        gourdThird.attack(30, scorpion);

        scorpion.block(7);
        scorpion.shock();

        gourdThird.complacent();

        scorpion.evolve();

        gourdThird.speakTo("scorpion", "来吧！");

        scorpion.attack(20, gourdThird);
        scorpion.speakTo("gourdThird", "啊呀呀呀呀呀呀！");
        scorpion.runAway();

        gourdThird.speakTo("scorpion", "你想跑？哪里走！");

        snake.speakTo("goblin", "通通给我出来！");

        goblin.speakTo("snake", "在！");

        snake.speakTo("snake", "赶快把所有石门给我关死，快！");

        door.nip(scorpion);

        scorpion.speakTo("goblin", "哎呀，自己人！");

        door.shutDown();
    }





    public static void main(String[] args){
        Scene scene = new Scene();
        scene.play();
    }

    
}
