package liuwanb;

public class Cobweb extends Entity{
    public Cobweb(){
        health = 250;
        setName("蛛网");
    }

    @Override
    public void beUsed(Creature user, Creature target) {
        super.beUsed(user, target);
        System.out.print(user.getName()+"对"+target.getName()+"使用了"+getName()+",");
        target.clearBuffByName("隐形");
        Buff abuff = new BeCaught(20);
        target.addBuff(abuff);
    }
}
