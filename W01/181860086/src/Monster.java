public class Monster extends Creature {
    public Monster(String s) {
        super(s);
        isHands = true;
        pliers = null;
    }
    public void changeHandPart() {
        if(isHands) {
            System.out.println(name + "的手变成了钳子。\n");
            pliers = new Being(name + "的钳子");
            isHands = false;
        }
        else {
            System.out.println(name + "的钳子变成了手。\n");
            pliers = null;
            isHands = true;
        }
    }
    public void regeneration() {
        System.out.println(name + "的钳子再生了。\n");
        pliers = new Being(name + "的钳子");
    }
    public void toWind() {
        System.out.println(name + "化作了一阵黑风。\n");
    }

    public Being pliers;
    boolean isHands;
}
