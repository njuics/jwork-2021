

public class Rock extends Being {
    String sharpDegree;
    int weight;
    public Rock(int weight_,String sharpDegree_){
        weight=weight_;
        sharpDegree=sharpDegree_;
    }
    public void beThrownAt(Being b){
            System.out.print("The "+name+" is thrown at "+b.name+",");
    }
}
