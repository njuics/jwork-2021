public abstract class Being{
    int health;
    int attack;
    int defense;
    String name;
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Creature b) {
        attack(b,this.attack);
    }

    public boolean isDead() {
        if(health <= 0){
            logForDead();
            return true;
        }
        return false;
    }

    protected abstract void logForDead();
    protected abstract void logForReceiveAttack(int harm);

    public void receiveAttack(int ap) {
        if(isDead()){
            return;
        }
        int harm = ap - defense;
        if (harm > 0) {
            health -= harm;
        }
        logForReceiveAttack(harm);
        //check for the Being if dead after attacking
        isDead();
    }



    public void attack(Creature b, int ap) {
        logForAttack(b,ap);
        b.receiveAttack(ap);
    }

    protected void logForAttack(Creature b,int ap) {
        System.out.println(name +": I attack " + b.getName() + " of " + ap + " points");
    }
}
