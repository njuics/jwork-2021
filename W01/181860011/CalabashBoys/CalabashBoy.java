package CalabashBoys;

public class CalabashBoy extends Organism {
    public CalabashBoy() {
        name = "CalabashBoy";
        GemStone gemStone = new GemStone();
        possession.add(gemStone);
    }

    public void drink() {
        for (int i = 0; i < possession.size(); i++) {
            if (possession.get(i).getClass() == FlowerWine.class) {
                System.out.println("CalabashBoy drink a FlowerWine.(咕咚咕咚");
                lose(possession.get(i));
            }
        }
    }

    public void drinkFromLotus(){
        System.out.println("CalabashBoy drinks from lotus.");
    }

    public void eyeGlow() {
        System.out.println("CalabashBoy's eye is glowing.* @ * *  @* * @ @");
    }

    public void getDrunk() {
        state = "Drunk";
        System.out.println("CalabashBoy is drunk");
    }

    public void drunkTalk(String content) {
        System.out.println("CalabashBoy unconsciously says:\"" + content + "\".");
    }

    public void blackout() {
        state = "blackout";
        System.out.println("CalabashBoy is blackout");
    }
}
