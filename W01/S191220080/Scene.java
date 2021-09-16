public class Scene {

    private CalabashBrother brother;
    private Scorpion Scorpion;
    private Frog frog;
    private Bat bat;

    private Kettle kettle;
    private Door door;

    public Scene() {
        brother = new CalabashBrother();
        Scorpion = new Scorpion();
        frog = new Frog();
        bat = new Bat();
        kettle = new Kettle("紫色神壶");
        door = new Door("超级大门");
    }

    public void play() {
        brother.Speak("好吧，这回看我的！");
        brother.Jump();
        brother.Speak("弄到宝贝，就马上来救你！");

        brother.BecomeLight();
        brother.Fly();
        brother.Recover();
        brother.Look();

        Scorpion.Speak("喂，你留点神，好好把好这门儿！啊！");
        frog.Speak("害，你算老几，多管闲事！这儿有我把门，谁也进不来！");
        frog.Speak("你还是自己管好自己，别像上回那样再掉进网里了，啊？哈哈哈哈哈……");
        Scorpion.Speak("哼！");

        brother.PickUp(kettle);
        brother.Smile();
        brother.Pour();
        brother.Throw();
        frog.Smile();
        frog.Speak("额啊，好香啊！");
        frog.OpenDoor(door);

        brother.BecomeLight();
        brother.Fly();

        frog.CloseDoor(door);
        brother.Recover();
        frog.Drink(kettle);
        frog.Speak("去你的！");

        Scorpion.Speak("谁？");
        bat.Speak("谁？");
        frog.Speak("哈哈哈哈，我扔了个空酒壶，又惹着你们了！大惊小怪！");
        frog.Yawn();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
