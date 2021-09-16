public class Scorpion extends Goblin{
    int tickle_time;

    public Scorpion(String init_name){
        super(init_name);
        tickle_time = 0;
    }

    public void lickLips() {
        System.out.println(this.getName() + " 舔了舔嘴唇。");
    }

    public void humph() {
        System.out.println(this.getName() + " 哼了哼声。");
    }

    public void sneeze() {
        System.out.println(this.getName() + " 打了喷嚏！");
    }

    public void scratchNose() {
        System.out.println(this.getName() + " 挠了挠鼻子。");
    }

    public void leaveHold() {
        System.out.println(this.getName() + " 松开了双手！");
    }

    public void hold(Item thing) {
        System.out.println(this.getName() + " 抓紧了 " + thing.getName() + "！");
    }

    public boolean beTickled(Creature caster){
        tickle_time++;
        if (tickle_time == 3){
            System.out.println(caster.getName() + " 的挠氧成功了！");
            this.sneeze();
            this.leaveHold();
            return true;
        }
        else{
            System.out.println(caster.getName() + " 的挠氧失败了！");
            if(tickle_time == 1){
                this.humph();
            }
            else if (tickle_time == 2){
                this.lickLips();
                this.scratchNose();
            }
            return false;
        }
    }

}