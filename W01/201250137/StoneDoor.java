

public class StoneDoor extends Being{
    public void open(){
        System.out.println("石门是开着的");
    }

    public void shutDown(){
        System.out.println("石门关上了");
    }

    public void nip(Creature victim){
        System.out.println("石门夹住了" + victim.toString());
    }
}
