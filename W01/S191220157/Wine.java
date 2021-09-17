

public class Wine {
    protected int alcohol, rest;
    public Wine() { alcohol = 1; rest = 10;}

    public int get_alcohol() {
        return alcohol;
    }

    public int open() {
        System.out.println("【酒坛子打开了】");
        return alcohol;
    }

    public int drink(int val) {
        rest -= val;
        if(rest <= 0)
            System.out.println("【见底了】");
        return get_alcohol();
    }
}