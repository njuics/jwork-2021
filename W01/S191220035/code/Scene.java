package W01.S191220035.code;

public class Scene {
    ManisPentadactyla manis;       //穿山甲
    Grandfather grandfather;             //爷爷
    KidTwo kidtwo;                //二娃
    BeeGoblin bee;               //黄蜂精
    Stone stone;

    public Scene(){
        manis = new ManisPentadactyla("焦急");
        grandfather = new Grandfather("伤心");
        kidtwo = new KidTwo("伤心");
        bee = new BeeGoblin("豪横");    
        stone = new Stone();    
    }

    public void play(){
        grandfather.heardDamage();
        kidtwo.heardDamage();
        manis.breakStone();
        stone.beDamaged(manis);
        manis.moodChange("开心");
        grandfather.lookAtMp();
        kidtwo.lookAtMp();
        grandfather.speakto("是你！", manis);
        manis.speakto("嘘！",grandfather);
        manis.turnBack(); 
        manis.speakto("爷爷，我救你们来了！",grandfather);
        grandfather.moodChange("开心");
        manis.runToGrandfather();
        grandfather.hugMP();
        kidtwo.moodChange("开心");
        manis.moodChange("认真");
        manis.speakto("老爷爷，赶快把那边的石板推开，我在下边挖了个洞。咱们，赶快逃出去吧！",grandfather);
        manis.moodChange("开心");
        manis.leadOthers();
        grandfather.followMP();
        kidtwo.followMP();
        manis.push(stone);
        grandfather.push(stone);
        kidtwo.push(stone);
        stone.bePush(manis, grandfather, kidtwo);
        System.out.println("石头被推动");//由于石头只是出现了一下，并且没有更多具体行为，所以没有选择封装为一个类
        manis.getOut();
        bee.flyIn();
        grandfather.moodChange("警觉");
        kidtwo.moodChange("警觉");
        bee.speakto("嗯？你们想干什么？", grandfather, kidtwo);
        grandfather.moodChange("虚弱");
        grandfather.speakto("哎呀，腰疼啊。哎呦，哎呦，哎呦。", bee);
        bee.jumpWithAngry();
        bee.speakto("腰疼有什么好哼哼的，再哼哼，我劈了你！",grandfather);
        bee.flyOut();
    }
    public static void main(String[] args) {
        Scene scene = new Scene();
        scene.play();
    }
}
