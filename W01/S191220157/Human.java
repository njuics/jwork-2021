
public class Human extends Creature {
    int drunk;
    public Human () {
        drunk = 0;
        name = "葫芦娃";
    }

    public boolean drink(Wine wine) {
        System.out.println(name + "进行一个酒的喝");
        drunk += wine.drink(10);
        if (drunk > 50 && drunk < 60) {
            dance();
        }
        else if (drunk > 100) {
            System.out.println(name + "醉了，睡睡");
            return false;
        }
        return true;
    }

    public void dance () {
        System.out.println(name + "面色大改，站不稳了");
    }
}
