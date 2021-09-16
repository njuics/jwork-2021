public class Monster extends Creature {

    public Monster(String _name, int _hp) {
        super(_name, _hp);
    }

    public void openDoor(Door door) {
        System.out.println(name + " opens the door");
        door.open();
    }

}