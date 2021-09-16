/**
 * @author Zyi
 */
public class Scene {

    Monster batOne;
    Monster batTwo;
    Human grandfather;
    CalabashBrothers yellowBaby;
    Music bgm;

    public Scene() {
        batOne = new Monster(100, 5, 20, true, "batOne");
        batTwo = new Monster(100, 5, 20, true, "batTwo");
        grandfather = new Human();
        yellowBaby = new CalabashBrothers(100, 5, 20, false, "yellow");
        bgm = new Music();
    }

    public void play() {
        beforeFight();
        // 下面开始战斗,一开始黄娃还没有发动技能
        bgm.start();
        fighting();

        if (batTwo.health <= 0) {
            batTwo.dead();
        }
        batOne.afraid();
        batOne.flyAndEscape();
        bgm.stop();
    }

    public void beforeFight() {
        // batOne是黄颜色的蝙蝠精
        // batTwo是红颜色的蝙蝠精
        batOne.appear();
        batTwo.appear();

        // 同时告诉两个小怪，"来吧！"
        yellowBaby.speakTo(new Monster[]{batOne, batTwo}, "来吧！");
        batOne.waitAndThink();
        batTwo.waitAndThink();
        batOne.speakTo(new Creature[]{yellowBaby, grandfather}, "你们跑不了啦！");
        batTwo.say("啊啊啊啊啊啊啊啊...");
        yellowBaby.say("嗨呀呀呀呀呀呀呀呀呀呀！");
    }

    public void fighting() {
        // 黄娃移动到一号蝙蝠精位置
        yellowBaby.move();
        // 这里黄娃连续攻击一号蝙蝠精三次
        // 一号蝙蝠精只剩下40滴血
        for (int i = 0; i < 4; i++) {
            yellowBaby.attack(batOne);
        }
        // 二号蝙蝠精想要偷袭，但是被爷爷发现，爷爷踢石头绊倒二号蝙蝠精。
        // 此时二号蝙蝠精只剩下90滴血
        batTwo.move();
        batTwo.wantToAttack(yellowBaby);
        grandfather.speakTo(yellowBaby, "当心！");
        grandfather.kickStone(batTwo);
        grandfather.stumble(batTwo);

        // 黄娃抢走一号蝙蝠精武器，并且踢走他
        yellowBaby.grabWeapon(batOne);
        yellowBaby.kick(batOne);
        yellowBaby.laugh();

        // 二号蝙蝠精飞上前迎战，大战几回合后逼退黄娃，黄娃摔倒并丢失武器
        batTwo.flyAndMove();
        for (int i = 0; i < 2; i++) {
            // 两人互打两个回合
            yellowBaby.attack(batTwo);
            batTwo.attack(yellowBaby);
        }
        yellowBaby.moveBackward();
        yellowBaby.fallDown();
        yellowBaby.loseWeapon();
        batTwo.laugh();

        // 一号蝙蝠精想要扔石头，被黄娃技能击碎，二号蝙蝠精被石头打中
        batOne.flyAndMove();
        batOne.throwStone();
        grandfather.say("哈....坏了");
        yellowBaby.crushStone();
        batTwo.receiveAttack(10);
        yellowBaby.laugh();

        // 黄娃发动技能，并抢夺武器丢出，二号蝙蝠精死亡
        yellowBaby.activateSkill();
        batTwo.attack(yellowBaby);
        yellowBaby.grabWeapon(batTwo);
        yellowBaby.throwWeapon(batTwo);
    }

    public static void main(String[] args) {
        Scene scene = new Scene();
        scene.play();
    }
}
