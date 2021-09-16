package W01.S201250136;

import W01.S201250136.HuLuWa;
import W01.S201250136.Magic;
import W01.S201250136.Monster;

/**
 * @author ljh
 * @create 2021-09-12 19:36
 */
public class Scene
{
    public static void main(String[] args)
    {
        go();
    }
    public static void go()
    {
        HuLuWa kingKong = new HuLuWa("金刚葫芦娃", 9999999, 999999, 1000, true);
        kingKong.addMagic("喷火", new Magic("喷火", 999));
        NormalCreature littleHedgehog = new NormalCreature("小刺猬", 100, 1, 1);
        Rock rock = new Rock("大岩石", 9999999);
        Monster handKing = new Monster("伸手大王", 9999, 1000, 10);
        handKing.addMagic("变长", new Magic("变长", 0));
        kingKong.run();
        kingKong.stop();
        kingKong.speakTo(handKing, "什么东西这么硬，真像一块铁疙瘩。");
        handKing.speakTo(kingKong, "噢~\n" +
                "原来是个小毛孩，\n" +
                "你到我这来不带点礼物，\n" +
                "不带点东西，\n" +
                "就想闯过去，\n" +
                "没那么容易吧。");
        kingKong.speakTo(handKing, "呔，\n" +
                "你是什么妖精，\n" +
                "敢挡我的去路，\n" +
                "你可知我葫芦小金刚的厉害。");
        handKing.speakTo(kingKong, "桀桀桀，\n" +
                "什么金刚葫芦，\n" +
                "金刚葫芦的，\n" +
                "我乃伸手大王，\n" +
                "我的手可长着呢，\n" +
                "不管什么人，\n" +
                "就算天王老子从我这过，\n" +
                "也得留下买路钱。");
        kingKong.speakTo(handKing, "你可真是处处伸手死不要脸，\n" +
                "嗯~，");
        kingKong.think();
        kingKong.speakTo(handKing, "我除了肚子里的那个东西，\n" +
                "什么也没有带。");
        handKing.speakTo(kingKong, "什么东西？");
        kingKong.speakTo(handKing, "屁你要不要啊。");
        littleHedgehog.laugh();
        kingKong.laugh();
        handKing.speakTo(kingKong, "好你个小东西，\n" +
                "哈哈，\n" +
                "我看你身上的宝贝可多着呢，\n" +
                "那眼睛，\n" +
                "鼻子，\n" +
                "你的手你的脚，\n" +
                "你的小屁股，\n" +
                "还有你那小计基，\n" +
                "都得给我留下。\n");
        handKing.laugh();
        kingKong.beingPissed(handKing);
        kingKong.speakTo(handKing, "呸，\n" +
                "你痴心妄想、白日做梦，\n" +
                "你——真不要脸。");
        handKing.speakTo(kingKong, "要不把你胸脯里那颗\n" +
                "热乎乎的红心送给我，\n" +
                "我就放你过去。");
        kingKong.beingPissed(handKing);
        kingKong.attack(handKing, kingKong.myMagics.get("喷火"));
        handKing.speakTo(kingKong, "哈哈哈，\n" +
                "我不怕火，\n" +
                "也不怕水，\n" +
                "就怕给我的东西太少了，\n" +
                "哈哈哈。");
        handKing.attack(kingKong, handKing.myMagics.get("变长"));
        kingKong.jump();
        handKing.attack(littleHedgehog);
        kingKong.attack(handKing, rock);
        System.out.println("全剧终");
    }
}
