
public class Scene 
{
    Human oldman;
    Pangolin pangolin;
    Treasure_Gourd gourd;
    Treasure_Gourd_Seed seed;
    Mountain mountain;
    Leaf leaf;

    public Scene()
    {
        oldman = new Human("grandfather");
        pangolin = new Pangolin();
        gourd = new Treasure_Gourd();
        mountain = new Mountain();
    }

    public void play()
    {
        pangolin.speak(oldman, "this is the seed which can surrender devils and demons.");
        oldman.speak(pangolin, "oh...");
        pangolin.speak(oldman, "if we get the seed, it can help us leave the cave.");
        oldman.speak(pangolin, "all right.");
        pangolin.speak(oldman, "dangerous!");
        gourd.spitFire(oldman, pangolin);
        oldman.speak(pangolin, "the fire is so heavy that we can't get the seed.");
        pangolin.speak(oldman, "the seed needs leaf to become inactive.");
        oldman.speak(pangolin, "there are lots of stones and no leaf in the cave.");
        gourd.spitFire(oldman, pangolin);
        oldman.run();
        pangolin.run();
        leaf = new Leaf();
        leaf.appear();
        pangolin.speak(oldman, "grandfather!");
        gourd.getLeaf(leaf);
        seed = gourd.becomeSeed();
        oldman.getTreasure(seed);
        mountain.collapse();
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}


