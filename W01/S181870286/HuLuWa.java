package W01.S181870286;

import java.util.ArrayList;

class HuLuWa extends Creature{

    HuLuWa(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    HuLuWa(String name) {
        super(name, 100, 20);
    }

    void bigmove(Entity[] targets) {
        ;
    }
}


// 三娃钢筋铁骨
class SanWa extends HuLuWa {

    SanWa() {
        super("三娃", 100, 300);
        //TODO Auto-generated constructor stub
    }

}
// 四娃喷火
class SiWa extends HuLuWa{

    SiWa() {
        super("四娃", 100, 20);
        //TODO Auto-generated constructor stub
    }
    @Override
    void bigmove(Entity[] targets) {
        System.out.print("四娃喷出地狱烈焰, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.println("烧着了。");
        for (Entity target : targets) {
            target.getHarm(50);
        }
    }
}
// 五娃喷水
class WuWa extends HuLuWa{

    WuWa() {
        super("五娃", 100, 10);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void bigmove(Entity[] targets) {
        System.out.print("五娃喷出灭绝洪水, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.println("淹着了。");
        for (Entity target : targets) {
            target.getHarm(50);
        }
    }
}
