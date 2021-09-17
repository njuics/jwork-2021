package com.myjava;

public class Scene {
    Calabash yellowCalabash;
    Calabash orangeCalabash;
    Monster pinkMouse;
    Monster yellowMouse;
    Human grandfather;

    public Scene() {
        yellowCalabash = new Calabash("黄色葫芦娃", 1000, 10, 50);
        orangeCalabash = new Calabash("橙色葫芦娃", 1000, 10, 50);
        grandfather = new Human("爷爷", 500, 0, 0);
        pinkMouse = new Monster("粉色老鼠", 100, 10, 10, "叉子", 1);
        yellowMouse = new Monster("黄色老鼠", 300, 10, 10, "叉子", 1);
    }

    void play() {
        // 00:32 - 1:40
        yellowCalabash.speak(pinkMouse, "呵呵，come on!!!");
        yellowMouse.rollEyes();
        pinkMouse.rollEyes();
        grandfather.hug(orangeCalabash);
        yellowMouse.speak(yellowCalabash, "you can not run away");
        pinkMouse.speak(yellowCalabash, "ahhhhhhhhhh");
        yellowCalabash.jump();
        yellowMouse.attack(yellowCalabash);
        yellowCalabash.attack(yellowMouse);
        pinkMouse.jump();
        grandfather.speak(yellowCalabash, "be careful");
        yellowMouse.attack(yellowCalabash);
        yellowCalabash.attack(yellowMouse);
        yellowMouse.weaponFall();
        yellowCalabash.setWeapon("叉子");
        grandfather.kickStone();
        pinkMouse.fallOver();
        yellowMouse.attack(yellowCalabash);
        yellowCalabash.attack(yellowMouse);
        yellowCalabash.speak(pinkMouse, "hahahahahahahaha");
        pinkMouse.attack(yellowCalabash);
        yellowCalabash.attack(pinkMouse);
        yellowCalabash.weaponFall();
        yellowCalabash.fallOver();
        yellowCalabash.speak(pinkMouse, "哎哟");
        pinkMouse.speak(yellowCalabash, "haha");
        pinkMouse.weaponFall();
        yellowCalabash.attack(pinkMouse);
        yellowMouse.attack(yellowCalabash);
        yellowCalabash.attack(yellowMouse);
        yellowMouse.runAway();
    }

    public static void main(String[] args) {
        Scene scene = new Scene();
        scene.play();
    }
}
