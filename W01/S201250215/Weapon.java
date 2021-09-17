package W01.S201250215;

import java.util.ArrayList;

public class Weapon {
    String name;
    int attack;
    ArrayList<String> users = new ArrayList<>();

    Weapon(String name, int ap, Creature creature){
        this.name = name;
        attack = ap;
        users.add(creature.getName());
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void addUser(String name){
        users.add(name);
    }
    public void deleteUser(String name){
        users.remove(users.indexOf(name));
    }
    public boolean hasUser(String name){
        return users.contains(name);
    }
}
