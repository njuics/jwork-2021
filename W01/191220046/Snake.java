public class Snake extends Monster{

    Snake() {
        name = "Snake";
    }

    public void laughAt(Creature creature) {
        speakTo(creature,"hahahahaha");
    }

    public void throwSomethingTo(Creature creature, String something) {
        System.out.println(name+" throws "+something+" to "+creature.name);
    }

}