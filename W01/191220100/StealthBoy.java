public class StealthBoy extends Creature{
    public StealthBoy(String init_name){
        super(init_name);
    }

    public void stealth(){
        System.out.println(this.getName() + " 隐身了！");
    }

    public void showUp(){
        System.out.println(this.getName() + " 现身了！");
    }

    public void tryCatch(Item thing){
        System.out.println(this.getName() + " 尝试拿到 " + thing.getName() + "!");
    }

    public void thinking() {
        System.out.println(this.getName() + " 转了转眼珠。");
    }

    public void get(Item thing){
        System.out.println(this.getName() + " 拿到了 " + thing.getName() + "!");
    }

    public void scratchHead(){
        System.out.println(this.getName() + " 挠了挠头。");
    }

    public void ridicule(){
        System.out.println(this.getName() + " 做出了嘲讽动作！");
    }

    public void leave(){
        System.out.println(this.getName() + " 离开了！");
    }

    public void tickle(Creature x){
        System.out.println(this.getName() + " 对 " + x.getName() + " 使出了挠氧！");
    }
}