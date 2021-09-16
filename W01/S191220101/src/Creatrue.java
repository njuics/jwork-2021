public class Creatrue extends Being{
    int health;
    int attack;
    int defense;

    // String[] memory;
    // int memoryOffset;
    String name;

    public Creatrue() {

    }
    public void speakTo(Creatrue creatrue, String something) {
        System.out.println(name + " tell " + creatrue + "'" + something + "'");
        creatrue.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + something);
    }

    public void attack(Creatrue creatrue, int ap) {
        System.out.println(name + " attack " + creatrue + " of " + ap + "points");
        creatrue.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if(!isDead()) {
            if(defense < ap) {
                health -= ap;
                System.out.println(name + " got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {
        if (health <= 0) {
            System.out.println(name+" is dead");
            return true;
        }
        return false;
    }


}
