package W01.S191220160;

public class Being { 
    String name;

    public String getName(){
        return name;
    }
    /*public Being(String name){
        this.name=name;
    }*/
    public void speak(String something) {   //Assuming all things can talk(拟人化手法)
        System.out.println(name + " say " + "\"" + something + "\"");
    }

    public void speakTo(Being being, String something) {
        System.out.println(name + " tell " + being.name + " :\"" + something + "\"");
        being.listen(something);
    }

    public void listen(String something) {
        System.out.println(name+" heard: " + " :\"" + something + "\"");
    }
    

}
