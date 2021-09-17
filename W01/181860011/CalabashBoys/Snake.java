package CalabashBoys;

public class Snake extends Organism{
    public Snake(){
        name="Snake";
    }

    @Override
    public void laugh(){
        System.out.println(name+" laugh: 啊哈哈哈哈哈哈！！");
    }
}
