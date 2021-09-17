public class Wine {
    private int count;
    private String name;
    private int alcoholdegree;
    public Wine(String s,int ad, int c){
        name=s;
        alcoholdegree=ad;
        count=c;
    }

    public String getName() {
        return name;
    }

    public int getAlcoholdegree() {
        return alcoholdegree;
    }

    public int getCount() {
        return count;
    }
    public void Countdec(){
        count--;
    }
}
