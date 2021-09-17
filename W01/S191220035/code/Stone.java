package W01.S191220035.code;

public class Stone extends Thing{
    public Stone(){
        this.name = "石头";
    }

    public void beDamaged(Character breaker){
        System.out.println(name + "被" + breaker.getName() + "破坏");
    }

    public void bePush(Character...pusher){
        System.out.print(name + "被 ");
        for(Character p :pusher){
            System.out.print(p.getName() + " ");
        }
        System.out.print("推\n");
    }
}
