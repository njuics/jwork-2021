public class Kettle extends MyObject {

    protected int m_Liquid;

    Kettle(String name) {
        super(name);
        m_Liquid = 2;
    }

    public void Pour() {
        m_Liquid -= 1;
    }

    public int GetLiquid() {
        return m_Liquid;
    }

}
