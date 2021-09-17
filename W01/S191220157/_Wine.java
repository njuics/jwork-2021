
public class _Wine extends Wine {
    public _Wine() {alcohol = 10;}
    
    public int drink(int val) {
        rest -= val;
        if(rest <= 0) {
            System.out.println("【见底了】");
            rest = 10;
            System.out.println("【但是没有完全见底】");
        }
        return get_alcohol();
    }
}
