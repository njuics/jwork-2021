import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Scene{
    HashMap<String,Monster> monsters;
    CalabashBrother ironKid;
    ArrayList<String> line;
    
    public void init(){
        
        initCharacters();
        initLine();
    }

    public void initCharacters(){
        Sword sword = new Sword(100);
        Monster snake = new Monster(200, 20, "snake", sword);
        Hammer hammer = new Hammer(20);
        Monster beast = new Monster(100, 10, "beast", hammer);
        Chain chain = new Chain(30);
        Monster rat = new Monster(70, 5,"rat",chain);
        Monster frog = new Monster(70, 5, "frog", chain);
        monsters = new HashMap<>();
        monsters.put("snake",snake);
        monsters.put("rat",rat);
        monsters.put("frog",frog);
        monsters.put("beast",beast);
        ironKid = new CalabashBrother(200, 30, "ironKid");
    }

    public void initLine(){
        line = new ArrayList<>();
        line.add("你这断了头的宝剑有什么好怕的，还有什么招快使出来，平头剑又不会长个。");
        line.add("铁娃子，别着急啊,我这宝剑就是会长个~ 这下，看你能砍的断吗？");
        line.add("哦？");
        line.add("啊哈哈哈哈~");
        line.add("啊啊啊！");
        line.add("啊哈哈哈~");
        line.add("嘿！");
        line.add("啊啊~");
        line.add("嗯？起来，快起来啊？这小子，这下完蛋了吧！");
        line.add("鳄鱼头领真是厉害啊！躲在暗处这么给他一锤！");
        line.add("这混小子，这回总算栽在我手里了");
        line.add("难道靠你这么一槌，这铁娃子就完蛋了吗？（轻蔑地笑）");
    }
    
    public void play(){
        Monster snake = monsters.get("snake");
        Monster rat = monsters.get("rat");
        Monster frog = monsters.get("frog");
        Monster beast = monsters.get("beast");
        Iterator<String> lineIt = line.iterator();
        String curWord = lineIt.next();
        ironKid.talk(curWord,snake);
        curWord = lineIt.next();
        snake.talk(curWord,ironKid);
        for(int i = 0; i < 5; i ++)snake.weapon.wear(50);
        curWord = lineIt.next();
        ironKid.talk(curWord,snake);
        curWord = lineIt.next();
        snake.talk(curWord,ironKid);
        snake.attackOtherCreature(ironKid);
        rat.weapon.playSkill(ironKid);
        rat.weapon.wear(100);
        ironKid.attackOtherCreature(rat);
        ironKid.attackOtherCreature(frog);
        curWord = lineIt.next();
        frog.talk(curWord,ironKid);
        rat.talk(curWord,ironKid);
        curWord = lineIt.next();
        ironKid.talk(curWord,rat);
        ironKid.talk(curWord,frog);
        curWord = lineIt.next();
        beast.attackOtherCreature(ironKid);
        beast.weapon.playSkill(ironKid);
        beast.talk(curWord,ironKid);
        curWord = lineIt.next();
        ironKid.talk(curWord,beast);
        curWord = lineIt.next();
        beast.talk(curWord,ironKid);
        curWord = lineIt.next();
        rat.talk(curWord,beast);
        curWord = lineIt.next();
        beast.talk(curWord,rat);
        curWord = lineIt.next();
        snake.talk(curWord,beast);
        ironKid.attackOtherCreature(rat);
        ironKid.attackOtherCreature(frog);
        beast.weapon.playSkill(ironKid);
        beast.weapon.wear(10000);
    }

    public static void main(String[] args){
        Scene aScene = new Scene();
        aScene.init();
        aScene.play();
    }
}

