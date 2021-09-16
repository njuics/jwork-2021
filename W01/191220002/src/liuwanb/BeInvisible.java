package liuwanb;

public class BeInvisible extends Buff{
    public BeInvisible(double time){
        super(time);
        setName("隐形");
        isNull = false;
    }

    @Override
    public void showAffect(Creature accepter) {
        System.out.print(","+accepter.getName()+"隐形了！\n");
    }
    @Override
    public void disappear(Creature accepter) {
        System.out.print(accepter.getName()+"显形了！\n");
    }

    @Override
    public void affect(Creature target) {
        target.applyDodgeChance += 1.0;
    }

}
