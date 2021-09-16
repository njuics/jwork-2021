public class Scene {
    Monster snack;
    Monster scorpion;
    Monster bats;
    Monster bees;
    Cup cup_one;
    Cup cup_two;
    FireBrother FireBrother;
    Calabash_Brother WaterBrother;
    Stone stone;
    public Scene(){
        snack = new Monster(200,10,20,2);
        snack.name = "蛇精";
        scorpion = new Monster(500,10,20,2);
        scorpion.name = "蝎子精";
        bats = new Monster(50,5,10,1);
        bats.name = "蝙蝠";
        bees = new Monster(20,2,5,1);
        bees.name = "蜜蜂";
        cup_one = new Cup();
        cup_one.name = "杯子1";
        cup_two = new Cup();
        cup_two.name = "杯子2";
        FireBrother = new FireBrother(300,10,30,3);
        FireBrother.name = "火娃";
        WaterBrother = new Calabash_Brother(300,10,25,3);
        WaterBrother.name = "水娃";
        stone = new Stone();
        stone.name = "石头";
    }
    public void play(){
        bees.fillWater(cup_one);
        bees.fillWater(cup_two);
        snack.beHappy();
        snack.speakTo(FireBrother, "Please, please drink it.");
        scorpion.beHappy();
        scorpion.speakTo(FireBrother, "Let's cheer up!");
        FireBrother.speakTo(scorpion, "The wine is very fragrant. But a bit too cold.");
        FireBrother.rolleyes();
        FireBrother.speakTo(scorpion, "The cave was cold and dark.");
        WaterBrother.speakTo(scorpion, "Sitting on a cold bench makes my ass cold.");
        FireBrother.rolleyes();
        scorpion.speakTo(bats, "Yeah, yeah, yeah. Light a fire and celebrate!");
        FireBrother.standUp();
        FireBrother.speakTo(scorpion, "Stop! You don't need that kind of effort. Look at me.");
        FireBrother.fire(stone, bats);
        FireBrother.rolleyes();
        FireBrother.fire(cup_one);
        snack.beSurprised();
        scorpion.beSurprised();
        FireBrother.drinkWater(cup_one);
    }

    public static void main(String[] args){
        new Scene().play();
    }

}