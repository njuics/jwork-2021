public class Scene {

    Human calabash_bro;
    Monster snake;
    Monster scorpion;
    Bee_Bomber[] bee;

    public Scene() {
        calabash_bro = new Human("葫芦藤", 300, 30, 100);
        snake = new Monster("蛇精", 200, 10, 20, 2);
        scorpion = new Monster("蜘蛛精", 500, 50, 50, 2);
        bee = new Bee_Bomber[5];
        bee[0]=new Bee_Bomber("bee_bomber1");
        bee[1]=new Bee_Bomber("bee_bomber2");
        bee[2]=new Bee_Bomber("bee_bomber3");
        bee[3]=new Bee_Bomber("bee_bomber4");
        bee[4]=new Bee_Bomber("leader_bee_bomber");
    }

    public void play() {
        snake.surprise();
        snake.speakTo(scorpion, "啊？这些该死的葫芦！是从什么地方冒出来的！");
        scorpion.surprise();
        scorpion.speakTo(snake, "咦？这这这这这这这......这怎么回事！");
        
        snake.angry();
        snake.speakTo(scorpion, "好啊！嗯！原来是这个家伙在跟我们捣乱！");
        scorpion.speakTo(snake, "哈！夫人，这葫芦枝叶又嫩，果实不坚，趁现在前去斩除，为时不晚！");
        snake.speakTo(scorpion, "嗯，你可不能小看了这神葫芦，我们吃了它多少苦头！如今穿山甲和老头儿，把葫芦籽弄了出去，一旦瓜熟蒂落，我们就全完了！");
        scorpion.speakTo(snake, "哎，夫人！三日之内，我必挖其根，断其藤，这群嫩葫芦送予夫人斟酒！啊哈哈哈哈哈哈哈哈......");
        scorpion.speakTo(bee[4], "准备起飞，目标：摧毁葫芦藤");
        bee[4].speakTo(scorpion, "Copy. Ready to take off.");
        for(int i=0;i<5;++i){
            bee[i].launch(calabash_bro);
            bee[i].detect();
        }
        calabash_bro.warning();
        
        for(int i=0;i<5;++i)
            bee[i].attack(calabash_bro);

        calabash_bro.ready();
        for(int i=0;i<4;++i)
            calabash_bro.attack(bee[i]);
        calabash_bro.finish();
        bee[4].surprise();
        bee[4].speakTo(scorpion, "Mission failed! Heading back.");
        calabash_bro.happy();
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
