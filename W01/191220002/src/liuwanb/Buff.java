package liuwanb;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Buff extends Being{
    boolean isNull;
    double duration;
    public Buff(double time){isNull = true;duration = time;}
    public void showAffect(Creature target){}
    public void affect(Creature target){}
    public void disappear(Creature target){}
}
