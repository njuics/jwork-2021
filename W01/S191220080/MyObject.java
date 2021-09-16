import javax.naming.NameNotFoundException;

public class MyObject {

    protected String m_Name;

    MyObject(String name) {
        m_Name = name;
    }

    String GetName() {
        return m_Name;
    }

}
