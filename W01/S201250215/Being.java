package W01.S201250215;

public class Being {
    String name;
    int positionX;
    int positionY;

    public Being(String name, int x,int y){
        this.name = name;
        this.positionX = x;
        this.positionY = y;
    }

    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}