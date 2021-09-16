

public class Creature extends Being {
        int health;
        int attack;
        int defense;
        String[] memory;
        int memoryOffset;
        public Creature( ){
            memory = new String[7];
            memoryOffset = 0;
        }

        public void speakTo(Creature creature, String something) {
            System.out.println(name+" tells " + creature.name + " '" + something + "'");
            creature.listen(something);
        }

        public void listen(String something) {
            System.out.println(name+" heard: " + something);
            memory[memoryOffset % memory.length] = something;
        }

        public void attack(Creature creature, int ap) {
            System.out.println(name+" attacks " + creature.name + " of " + ap + " points.");
            creature.receiveAttack(ap);
        }

        public void receiveAttack(int ap) {
            if (!isDead()) {
                if (defense < ap) {
                    health -= ap;
                    System.out.println(name+" got " + ap + " points attack.");
                }
            }
        }
        public void spitBlood(){
        System.out.println(this.name+" spits blood!");
    }
        public void laugh(){
        System.out.println(this.name+" laughs.");
    }
        public boolean isDead() {

            if (health <= 0) {
                System.out.println(name+" is dead.");
                return true;
            }

            return false;
        }

        public void move(String action,String place) {
            System.out.println(name+" "+action+" to the "+place+".");


        }

    }

