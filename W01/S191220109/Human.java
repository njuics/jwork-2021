public class Human extends Creature {
    
    Human(String np, int hp, int ap, int dp) {
        name = np;
        health = hp;
        attack = ap;
        defense = dp;
    }
    public void ready() {
        System.out.println(name + ": Missiles ready.");
        System.out.println(name + ": Fire!");
    }
    public void finish(){
        System.out.println(name + ": "+ down + " bombers were shot down! " + (enemy - down) + " escaped!");
    }
    public void happy(){
        System.out.println(name + ": 哈哈哈哈哈哈哈哈哈哈哈哈哈哈！！！");
    }

    public void warning() {
        System.out.println(name + ": " + enemy + " enemy bombers are taking off! All units, this is not a drill.");
    }
    
}