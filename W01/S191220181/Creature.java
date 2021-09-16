package S191220181;

public class Creature extends Being {
    int health;
    int attack;
    int defense;
    String[] memory;
    int memoryOffset;

    public Creature(String _name) {
        name =_name;
        memory = new String[15];
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

    public void think(String something) {
        System.out.println(name + " think: " + something);
    }

    public void move(String moveway) {
        System.out.println(name + " " + moveway);
    }


}
