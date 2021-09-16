public class Scene {
    Tool ruyi = new RuYi();
    Tool spear = new Spear();
    Character shejing = new Character("蛇精", 100, 5, ruyi);
    Character dawang = new Character("大王", 100, 10, spear);
    Character huluwa = new Character("葫芦娃", 100, 7, null);
    Rock rock = new Rock();


    public void play() 
    {
        rock.Bear(shejing);
        rock.Bear(dawang);
        rock.Rise();
        huluwa.Speak("妖精，快还我爷爷！");
        shejing.Speak("嗯~嗯~~，可以，可以。你这娃娃倒是一片孝心。你爷爷就在这，你亲妈也在这，快给我磕头！");
        huluwa.Speak("呸！真不要脸！");
        dawang.Speak("咦哈哈哈哈哈哈哈哈哈！");
        huluwa.Speak("今天，要是不把我爷爷放了，我就把你这妖洞砸的粉碎！");
        dawang.Speak("啊哈哈哈哈哈哈哈哈哈！");
        dawang.Get_Tool(spear);
        dawang.Tool_Attack(huluwa);
        huluwa.Tool_Attack(dawang);
        dawang.Abandon_Tool();
        shejing.Get_Tool(ruyi);
        shejing.Tool_Attack(huluwa);
    }



    public static void main(String[] args) {
        new Scene().play();
    }

}
