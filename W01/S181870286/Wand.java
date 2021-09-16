package W01.S181870286;

import java.util.ArrayList;

abstract class Wand extends Entity {

    Wand(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    abstract void useMagic(Entity[] targets);


}

class AsYouWish extends Wand {
    AsYouWish() {
        super("如意", 20, 20);
        //TODO Auto-generated constructor stub
    }

    void useMagic(Entity[] targets) {
        System.out.print("如意放出一阵妖风, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.println("刮着了。");
        for (Entity target : targets) {
            target.getHarm(10);
        }
    }
}
