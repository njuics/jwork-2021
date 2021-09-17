public class Wine extends Being {

    public Wine(String _name) {
        super(_name);
    }

    public void smell() {
        System.out.println(name + " gives off a pleasant smell");
    }
    
}