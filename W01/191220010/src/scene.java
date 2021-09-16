public class scene {
    
    dawa dawa_;
    monster snake;
    monster scorpion;
    monster centipede;

    public scene(){
        dawa_=new dawa("大娃");
        snake=new monster(200, 20, 5, "蛇精");
        scorpion=new monster(300, 40, 5, "蝎子精");
        centipede=new monster(200, 20, 7, "蜈蚣精");
    }

    public void play(){
        dawa_.speakTo(snake, "妖精，快...");
        snake.speakTo(dawa_, "可以可以，...");

        dawa_.speakTo(snake, "呸，不要脸");
        scorpion.speakTo(dawa_, "哈哈哈哈哈哈");
        dawa_.speakTo(snake, "今天要是不放...");
        scorpion.speakTo(dawa_, "哦？哈哈哈哈");
        scorpion.throwspear(dawa_);
        dawa_.Catchspear();
        dawa_.speakTo(scorpion, "哈哈哈哈哈哈");
        snake.freeze(dawa_);
        dawa_.icebreak();
        centipede.attack(dawa_, 20);
        dawa_.attack(centipede, 20);
        centipede.big();
        dawa_.big();
        dawa_.tread(centipede);
        centipede.runaway();
    }

    public static void main(String[] args) {
        new scene().play();
    }
}