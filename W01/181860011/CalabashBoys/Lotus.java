package CalabashBoys;

import java.util.*;

public class Lotus extends Thing{
    protected ArrayList<FlowerWine> wines;
    
    public Lotus(){
        name="Lotus";
        wines=new ArrayList<FlowerWine>();
        for(int i=0;i<4;i++){
            FlowerWine w=new FlowerWine();
            wines.add(w);
        }
    }

    public FlowerWine grabFromLotus(){
        FlowerWine w=wines.get(0);
        wines.remove(0);
        return w;
    }
}
