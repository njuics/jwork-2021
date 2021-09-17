

public class Scene {
    Human human;//父类类型能声明子类对象，构造函数也调用子类的，但调用不了子类方法。
    Monster snake, scorpion;
    
    public Scene() {
        human = new Human();
        snake = new Monster("蛇精");
        scorpion = new Monster("蝎子精");
    }

    public void play() {
        Wine wine = snake.prepare_wine(1);
        human.drink(wine);
        human.speak("哼!");
        snake.speak("啊？");
        scorpion.speak("我的酒哇，全让这小子喝光了，呜呜呜...");
        human.speak("哈哈哈哈，你们也太小气了，只给我这么点酒喝，我还没尝出味儿来呢就没了。");
        snake.speak("如意如意，按我心意，快快显灵。");
        human.speak("妖精你在唠叨什么，还不把酒拿来！");
        snake.speak("美酒美酒快出来");
        wine = snake.prepare_wine(2);
        while(human.drink(wine)) {
            snake.get_satisfied();
        }
    }
    public static void main(String[] args) {
        new Scene().play();
    }
}
