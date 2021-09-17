public class Process{
    Character boy3;
    Character snake;
    Weapon stick;
    Rope rope;
    Shoe shoe;
    public Process(){
        boy3 = new Character("boy3", 400, 100);
        snake = new Character("snake", 500, 100);
        stick = new Weapon("stick", 50);
        shoe = new Shoe("shoe", 10);
        rope = new Rope("rope", 0);
    }
    public void process(){
        snake.tell(boy3, "You ready? I will come!");
        snake.attack(boy3, stick, true);
        boy3.miss();
        snake.tell(boy3, "hahahahaha 铁娃子 你的软裆让我看出来了 就怕打你的屁股 你想跑 我叫你跑不了");
        snake.attack(boy3, shoe, false);
        shoe.smaller(boy3);
        snake.tell(boy3, "hahahahaha");
        snake.attack(boy3, stick, false);
        snake.tell(boy3, "hahahahaha");
        snake.attack(boy3,stick,false);
        snake.tell(boy3, "hahahahaha");
        rope.tie(snake, boy3);
    }
    public static void main(String[] args) {
        new Process().process();
    }
}