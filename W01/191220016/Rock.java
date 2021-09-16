



public class Rock extends Being{
    int weight=0; 
    Rock(int _weight){
        weight=_weight;
        name="rock"+Integer.toString(weight) + "kg";
    }

    public int get_weight(){
        return weight;
    }
}