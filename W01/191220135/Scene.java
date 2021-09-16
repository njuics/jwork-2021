public class Scene {
    
    Monster frog;
    Monster centipede;
    SixthBro sixthBro;
    Door door;
    Wine wine;

    public Scene() {
        frog = new Monster("frog", 100);
        centipede = new Monster("centipede", 100);
        sixthBro = new SixthBro("sixthBro", 200);
        door = new Door("door");
        wine = new Wine("wine");
    }

    public void play() {
        centipede.speakTo(frog, "Guard the door carefully!");
        frog.speakTo(centipede, "No one can come in! Mind your own business. Don't fall into the net like before.");
        frog.laugh();

        sixthBro.gotIdea();
        wine.smell();

        frog.speak("So fragrant!");
        frog.openDoor(door);

        sixthBro.hideSelf();
        sixthBro.enter();

        door.close();
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}