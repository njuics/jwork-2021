//package W01.S191220057;

public class Scene {

    Manis manis;
    Flayrat flyrat;  
    Scorpion scorpion;   
    Cockroach cockroach;

    public Scene() {
        manis = new Manis();
        flyrat = new Flayrat();
        scorpion = new Scorpion();
        cockroach = new Cockroach();
    }

    public void play() {

        manis.escape();

        scorpion.choke(manis);
        manis.speakTo(scorpion, "放开我！你们这些坏蛋...");

        scorpion.attack(manis, 5);
        flyrat.spear(manis);
        manis.struggle();

        cockroach.speakTo(scorpion, "报告大王！大事不好！老头与瞎眼葫芦逃跑啦！");
        scorpion.bePissed();

        flyrat.attack(manis, 5);
        scorpion.choke(manis);

        manis.speakTo(scorpion, "放开我！你们这些坏蛋！");

        scorpion.speakTo(manis, "fxxk...");

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
