public class Being {
    public Being(String s) {
        name = s;
    }
    public void shatter() {
        System.out.println(name + "裂开了。\n");
        name = "断裂的" + name;
    }
    public void hole() {
        System.out.println(name + "破了一个洞。\n");
        name = "破了一个洞的" + name;
    }

    public String name;
}
