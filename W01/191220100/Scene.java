public class Scene {
    Item yuruyi;
    Scorpion scorpion_goblin;
    Snake snake_goblin;
    StealthBoy six_boy;

    public Scene(){
        yuruyi = new Item("玉如意");
        scorpion_goblin = new Scorpion("蝎子精");
        snake_goblin = new Snake("蛇精");
        six_boy = new StealthBoy("六娃");
    }

    void play(){
        this.scorpion_goblin.beSleeping();
        this.snake_goblin.beSleeping();
        this.six_boy.tryCatch(this.yuruyi);
        this.six_boy.stealth();
        this.snake_goblin.awake();
        this.snake_goblin.sleep();
        this.scorpion_goblin.lickLips();
        this.six_boy.showUp();
        this.six_boy.tryCatch(this.yuruyi);
        this.scorpion_goblin.humph();
        this.six_boy.scratchHead();
        this.scorpion_goblin.hold(yuruyi);
        this.six_boy.thinking();
        do{
            this.six_boy.tickle(this.scorpion_goblin);
        } while(!this.scorpion_goblin.beTickled(this.six_boy));
        this.six_boy.get(this.yuruyi);
        this.six_boy.ridicule();
        this.six_boy.stealth();
        this.six_boy.leave();
    }

    public static void main(String[] args){
        Scene sc = new Scene();
        sc.play();
    }
}