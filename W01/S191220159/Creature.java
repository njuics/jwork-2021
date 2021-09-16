package S191220159;

public class Creature extends Being {

    String[] memory;
    int memoryOffset;

    public Creature(String _name) {
        name =_name;
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void pick(Item item) {
        System.out.println(name + " pick up " + item.name);
    }

    public void drop(Item item) {
        System.out.println(name + " drop " + item.name);
    }

    public void move(Item item) {
        System.out.println(name + " move to " + item.name );
    }
}
