public class Door extends MyObject {

    protected boolean m_Open;

    Door(String name) {
        super(name);
        m_Open = false;
    }

    public void Open() {
        m_Open = true;
    }

    public void Close() {
        m_Open = false;
    }

}
