package liuwanb;

public class BeCaught extends Buff{
    public BeCaught(double time){
        super(time);
        setName("禁锢");
        isNull = false;
    }

    @Override
    public void showAffect(Creature accepter) {
        System.out.print(accepter.getName()+"被禁锢了！\n");
    }

    @Override
    public void disappear(Creature accepter) {
        System.out.print(accepter.getName()+"不再被禁锢了！\n");
    }

    @Override
    public void affect(Creature target) {
        target.applyDodgeChance -= 1;
    }

}

