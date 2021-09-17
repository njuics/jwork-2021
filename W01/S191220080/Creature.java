public class Creature {

    protected String m_Name;

    public Creature(String name) {
        m_Name = name;
    }

    public void Speak(String word) {
        System.out.println(" - " + this.m_Name + ": \"" + word + "\"");
    }

    protected void Event(String event) {
        System.out.println(this.m_Name + ": " + event);
    }

}
