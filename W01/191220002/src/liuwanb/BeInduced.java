package liuwanb;

public class BeInduced extends Buff{
    public BeInduced(double time){
        super(time);
        setName("被诱导");
        isNull = false;
    }
    @Override
    public void showAffect(Creature accepter) {
        System.out.print(","+accepter.getName()+"被骗了！\n");
    }

    @Override
    public void disappear(Creature accepter) {
        System.out.print(accepter.getName()+"意识到受骗了！\n");
    }

    @Override
    public void affect(Creature target) {
        target.applyHitChance -= 1.0;
    }
}
