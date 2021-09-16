public class Scene {
    private Human firecalabash;
    private Human watercalsbash;
    private Monster snake;
    private Monster scorpion;
//    private Monster smallrole

    public Scene(){
//        smallrole=new Monster("小蜜蜂",0.5,0.5,0.5)
        firecalabash=new Human("火娃",1.5,1.5,1.0);
        watercalsbash=new Human("水娃",1.5,1.5,20);
        snake=new Monster("蛇精",2.0,2.0,1.5);
        scorpion=new Monster("蝎怪",1.5,2.2,2.0);
    }
    public void play(){
        snake.speakTo(firecalabash,"我给你斟一杯冷泉清凉");
        snake.provideAlcohol(firecalabash,1,"冷泉清凉");
        if(firecalabash.isDruken()) {
            System.out.print(firecalabash.getName()+"倒下去的时候喃喃自语");
            firecalabash.Drukensaying();
        }
        scorpion.sign2();
        watercalsbash.sign1();
        watercalsbash.speakTo(snake,"不要小看人，快拿好酒来");
        scorpion.provideAlcohol(watercalsbash,20,"蝎子的坛坛酒");
        scorpion.sign1();
        snake.sign3();
        snake.provideAlcohol(watercalsbash,1,"大碗酒");
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
