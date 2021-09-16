public class Creature extends Being {

    int health;
    int defense;

    public void say(String str){
        System.out.println(name + ": I say '" + str + "'");
    }

    public void talkTo(Creature cre, String str){
        System.out.println(name + ": I say to " + cre.name + " that '" + str + "'");
        cre.litsen(this, str);
    }

    public void litsen(Creature cre, String str){
        System.out.println(name + ": I hear " + cre.name + " tell me that '" + str + "'");
    }

    public void attack(Creature cre){
        int damage = strength - cre.defense;
        System.out.println(name + ": I attack " + cre.name + ".");
        cre.underAttack(damage);
    }

    public void attack(Creature cre, Being object){
        int damage = strength - cre.defense;
        System.out.println(name + ": I attack " + cre.name + " with my " + object.name + ".");
        cre.underAttack(damage);
    }

    public void underAttack(int damage){
        health -= damage;
        if(damage == 0){
            System.out.println(name + ": Haha! I am unharmed!");
            return;
        }
        else{
            System.out.println(name + ": I took " + damage + " attack damage..");
        }
        beDead();
    }
    public int beDead(){
        if(health < 0){
            System.out.println(name + ": I am dead...");
            //live = false;
            return -1;
        }
        if(health == 0){
            System.out.println(name + ": I am dying... Help! Help!");
            return 0;
        }
        else{
            System.out.println(name + ": What can't kill me can make me stronger!");
            return 1;
        }
    }

    public void act(String action){
        System.out.println(name + ":I " + action + ".");
    }

    public void act(String action, Being object){
        System.out.println(name + ":I " + action + " " + object.name + ".");
    }

    public void act(String action, Creature cre, Being object){
        System.out.println(name + ":I " + action + " " + cre.name + " with " + object.name + ".");
    }

    public void act(String action, Being object, Creature cre){
        System.out.println(name + ":I " + action + " " + object.name + " with " + cre.name + ".");
    }

    public void see(String scene){
        System.out.println(name + ":I see that" + scene + ".");
    }

    public void see(Being object, String scene){
        System.out.println(name + ":I see " + object.name + " " + scene + ".");
    }
}
