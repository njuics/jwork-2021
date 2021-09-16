public class Cup extends Goods {
    int waterCapacity;
    Cup(){
        waterCapacity = 0;
        temperature = 25;
    }
    

    public boolean isHot() {
        if (this.temperature<40 && waterCapacity!=0)
            return false;
        else return true;
    }
}