package IronChild;

public class Sword extends Being {
    public Sword(String n) {
        name = n;
    }

    public void appear() {
        System.out.println(name + ":I appear.");
    }

    public void big() {
        System.out.println(name + ":I get bigger.");
    }

    public void hard() {
        System.out.println(name + ":I am very hard.");
    }

    public void soft() {
        System.out.println(name + ":I am very soft.");
    }
}
