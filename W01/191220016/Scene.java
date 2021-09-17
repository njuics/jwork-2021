

public class Scene {

    RockMonster rockMonster;
    CalabashBrother calabashBrother;

    public Scene() {
        rockMonster = new RockMonster("黑吃黑",100,50,100,2,100);
        calabashBrother = new CalabashBrother("葫芦小金刚");
    }

    public void play() {

        rockMonster.speakTo(calabashBrother, "heyheyheyheyheyheyheyheyhey!");
        rockMonster.speakTo(calabashBrother, "Good! Where are you the 小毛孩子 come from 呀?");
        rockMonster.speakTo(calabashBrother, "Your 胆子 is not small! How dare you 闯到 here to look for death?");

        calabashBrother.speakTo(rockMonster, "呔! What kind of 妖魔鬼怪 are you? Tell me your name!");

        rockMonster.speakTo(calabashBrother, "Your 口气 is so big! Do you konw who I am?");
        rockMonster.speakTo(calabashBrother, "I have eyes, mouth and nose, and my name is 黑吃黑!");

        calabashBrother.speakTo(rockMonster, "Whatever black eat black or white eat white, show me all your 本事!");

        rockMonster.attack(calabashBrother, 50, "attack3");

        rockMonster.speakTo(calabashBrother, "For me, whatever rock, or human flesh, or human heart, or human lung, or 狼心狗肺,");
        rockMonster.speakTo(calabashBrother, "is delicious if it's 熏黑了!Hahahahaha!");
        rockMonster.speakTo(calabashBrother, "I eats rock everyday and is enough for them.");
        rockMonster.speakTo(calabashBrother, "Today you 送上门来, so it's a good chance to improve my 口味!");

        rockMonster.attack(calabashBrother, 50, "attack1");

        calabashBrother.attack(rockMonster , 100 , "fireAttack");

        rockMonster.speakTo(calabashBrother, "Hahahahahahaha!");

        rockMonster.attack(calabashBrother, 1000, "attack3");

        calabashBrother.speakTo(rockMonster, "I'll let you eat a 够 and eat a 饱！");
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
