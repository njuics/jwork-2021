public class Being {
    String name;

    public Being(String s) {
        name = s;
    }

    public void tellName() {
        System.out.printf("(%s)", name);
    }

    public String getName() {
        return name;
    }
}