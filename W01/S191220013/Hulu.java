

public class Hulu extends Creature {
    Hulu() {
        health = 100;
        attack = 20;
        defense = 1000;
    }

    void beIced(){
        System.out.println("I'm frozen");
    }
    
    void breakFork(Fork fork){
        System.out.println("I break" + fork);
        fork.beAttack();
    }

    @Override
    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense <= ap) {
                health -= (ap-defense);
                System.out.println("I got " + ap + "points attack and it broke my defence ");
            }
            else if (defense > ap){
                defense -= ap;
                System.out.println("I got " + ap + "points attack, but it failed to break my defence");
            }
            if (!isDead())
            beIced();
        }
    }

}



