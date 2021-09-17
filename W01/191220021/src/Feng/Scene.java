package Feng;

public class Scene 
{
    Human grandpa;
    Human seventhCalabasher;
    Bogy snakeWoman;
    Bogy scorpion;
    PurpleGourd purpleGourd;

    Scene()
    {
        grandpa = new Human("爷爷", 50);
        seventhCalabasher = new Human("七娃", 100);
        snakeWoman = new Bogy("蛇精",  100, 10);
        scorpion = new Bogy("蝎子精",  100, 10);
        purpleGourd = new PurpleGourd(seventhCalabasher);
    }

    public void Play()
    {
        purpleGourd.Glitter();
        seventhCalabasher.Speak2("妈妈，爸爸，，，我在哪啊？", null);
        purpleGourd.Release(seventhCalabasher);
        purpleGourd.Glitter();
        seventhCalabasher.Speak2("妈妈！", snakeWoman);
        snakeWoman.Hug(seventhCalabasher);
        snakeWoman.Speak2("诶~乖孩子", seventhCalabasher);
        scorpion.Laugh();
        seventhCalabasher.Speak2("妈妈~", snakeWoman);
        snakeWoman.Speak2("好宝贝儿", seventhCalabasher);
        snakeWoman.Kiss(seventhCalabasher);

        grandpa.Speak2("孩子啊，你糊涂了，怎么跟妖怪打得火热啊，嗯？", 
            seventhCalabasher);
        snakeWoman.Speak2("乖孩子，你看看这老头儿，你认得他吗？", 
            seventhCalabasher);
        seventhCalabasher.Move(grandpa);
        seventhCalabasher.Speak2("从来没有见过", snakeWoman);
        grandpa.Speak2("孩子，我是你爷爷啊", seventhCalabasher);
        seventhCalabasher.Speak2("你胡说，真不害羞", grandpa);
        grandpa.Grieve();
        seventhCalabasher.Move(snakeWoman);
        seventhCalabasher.Speak2("妈妈，我是你的好宝贝儿", snakeWoman);
        snakeWoman.Speak2("oh~真是个乖孩子", seventhCalabasher);
        snakeWoman.Laugh();
        scorpion.Laugh();
        grandpa.Cry();

        snakeWoman.Speak2("孩子，这个老头儿带了一帮蛮小子在这里捣乱，你说该怎么办呢，啊？",
            seventhCalabasher);
        seventhCalabasher.RollTheEyes();
        seventhCalabasher.Speak2("妈，这宝贝可神了，威力无穷。我用它来收拾这帮蛮小子，给爸爸妈妈出气",
            snakeWoman);
        purpleGourd.Glitter();
        snakeWoman.Speak2("oh，太好了，好宝贝儿", seventhCalabasher);
        scorpion.Speak2("好！", seventhCalabasher);
        snakeWoman.Laugh();
        scorpion.Laugh();

    }

    public static void main(String[] args) throws Exception 
    {
        Scene sce = new Scene();
        sce.Play();
    }  
}

