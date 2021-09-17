package W01.S191220055;

public class SpiderWeb extends Being {
    SpiderWeb(){
        name = "SpiderWeb";
    }
    public void capture(Creature c) {
        System.out.println(name+" capture "+c.getName());
    };
}
