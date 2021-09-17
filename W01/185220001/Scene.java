package W01;

public class Scene {

    Shuiwa shuiwa;
    Huowa huowa;
    Human oldman;
    Item groud;
    Item bucket;
    Item kettle;

    public Scene() {
        shuiwa = new Shuiwa();
        huowa = new Huowa();
        oldman = new Human("Oldman");
        groud = new Item("Groud");
        bucket = new Bucket();
        kettle = new Kettle();
    }


    public void play() {
        shuiwa.water(groud);
        shuiwa.water(bucket);
        shuiwa.water(groud);

        huowa.speakTo(shuiwa, "够了够了"); 
        huowa.speakTo(shuiwa, "弟弟，别再喷水了");
        huowa.speakTo(oldman, "爷爷，看我的");
        oldman.speakTo(huowa, "哦，好");

        huowa.attack(oldman, 1);
        oldman.speakTo(huowa, "诶呦");
        huowa.fire(kettle);
        
        shuiwa.speakTo(huowa, "好!好!");
        
    }

    public static void main(String[] args) throws Exception {
        new Scene().play();       
        
    }

}
