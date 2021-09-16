package W01.S181870286;

class Entity {
    // 所有东西都有寿命
    boolean alive;
    int hp;
    int damage;
    String name;

    Entity(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        alive = true;
    }
    
    void getHarm(int damage) {
        System.out.println(name + "受到" + damage + "点伤害。");
        hp -= damage;
        if (hp <= 0) {
            alive = false;
            System.out.println(name + "没了");
        }
    }

    void fallTo(Entity e) {
        System.out.println(name + "摔向" + e.name + "上。");
        e.getHarm(damage);
        getHarm(e.damage);
    }
}
