
public class Monster extends Creature {
    int satisfaction = 10;
    Ruyi ruyi = new Ruyi();
    public Monster(String n) {
        name = n;
    }

    public Wine prepare_wine(int type) {
        if (type == 1)
            return new Wine();
        speak("好香啊");
        return ruyi.prepare();
    }

    public void get_satisfied() {
        satisfaction += 10;
        if(satisfaction >= 100)
            speak("哈哈，果然上了套了！");
    }
}
