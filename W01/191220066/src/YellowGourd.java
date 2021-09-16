public class YellowGourd extends Gourd{
    public YellowGourd(){
        name = "yellow gourd";
        health = 100;
        attack = 20;
        defense = Integer.MAX_VALUE;
    }

    @Override
    public void receiveAttack(int ap) {
        System.out.println(name +": defend the attack!");
    }
}
