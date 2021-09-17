package liuwanb;

public class Rock extends Entity{
    public Rock(){
        health = 500;
        setName("岩石");
    }

    @Override
    public void beUsed(Creature user, Creature target) {
        super.beUsed(user, target);
        System.out.print(user.getName()+"对"+target.getName()+"使用了"+getName()+",");
        target.hurt(user,120);
    }
}
