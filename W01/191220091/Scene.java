public class Scene
{
  
    Monster snake; //蛇精
    Monster scorpion; //蝎子精
    Monster frog; //蛤蟆统领

    CalabashBrothers secondBoy; //二娃

    Calabash otherGuard_1; //其他五个葫芦
    Calabash otherGuard_2;
    Calabash otherGuard_3;
    Calabash otherGuard_4;
    Calabash otherGuard_5;

    public Scene()
    {
        snake = new Monster("Snake", 200, 10, 20, 2);
        scorpion = new Monster("Scorpion", 500, 50, 50, 2);
        frog = new Monster("Frog", 100, 5, 10, 2);

        secondBoy = new CalabashBrothers("SecondBoy", 2);

        otherGuard_1 = new Calabash("otherGuard_1");
        otherGuard_2 = new Calabash("otherGuard_2");
        otherGuard_3 = new Calabash("otherGuard_3");
        otherGuard_4 = new Calabash("otherGuard_4");
        otherGuard_5 = new Calabash("otherGuard_5");
    }

    public void play() 
    {
        snake.speakTo(scorpion, "这第二个葫芦娃莫非就是顺风耳、千里眼？");
        snake.rolleyes();
        snake.speakTo(scorpion, "这二娃子本领奇特，必定上门来找我们麻烦！");
        scorpion.yell("蛤蟆统领！");
        frog.yell("在！");
        scorpion.speakTo(frog, "洞里洞外给我严加防守，把那老头儿和葫芦娃...");
        snake.speakTo(scorpion, "哎！嘘...轻点儿！");
        scorpion.stretchOut();
        frog.jumpUp();
        scorpion.speakTo(frog, "把他们关到十八层地洞里去！");
        frog.speakTo(scorpion, "是！");

        secondBoy.useClairaudience();
        secondBoy.somersault();
        secondBoy.yell("兄弟们，不好啦！大哥中了魔，被妖怪抓到了！现在，妖怪把爷爷和大哥都关到十八层地洞中去了！");
        otherGuard_1.speakTo(secondBoy,"大哥本领高强、力大无穷，怎么会被妖怪抓住呢！");
        otherGuard_2.speakTo(secondBoy, "你再看看清楚！");
        secondBoy.yell("我这千里眼还会看错？妖怪有一个如意和一块魔镜，我得前去砸了他们的宝贝，才能救出爷爷和大哥！");
        otherGuard_1.yell("二哥二哥，路上小心！");
        otherGuard_2.yell("二哥二哥，多加小心！");
        otherGuard_3.yell("二哥二哥，路上小心！");
        otherGuard_4.yell("二哥二哥，多加小心！");
        otherGuard_5.yell("二哥二哥，路上小心！");
    }

    public static void main(String[] args) 
    {
        new Scene().play();
    }
    
}