import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import javax.print.DocFlavor.STRING;


public class Subtitle{
    ArrayList<String> contentList = new ArrayList<String>();
    Subtitle(){
        // Path path = Paths.get(DiaglougePath);
        // try{
        //     contentList = Files.readAllLines(path);
        // }
        // catch (IOException e){
        //     e.printStackTrace();
        //     System.exit(-1);
        // }

        // try {
        //     File myObj = new File("Dialogue.txt");
        //     Scanner myReader = new Scanner(myObj);
        //     while (myReader.hasNextLine()) {
        //       String data = myReader.nextLine();
        //       System.out.println(data);
        //     }
        //     myReader.close();
        //   } catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }
        contentList.add("Fairy, return my grandpa to me!");
        contentList.add("Ok, Ok. You are very filial. Your grandpa is here. Your mother is here,too. Kowtow to me!");
        contentList.add("Pooh!Shame on you!");
        contentList.add("Hahahahahaha!");
        contentList.add("If you don't let my grandpa go today, I will smash your home!");
        contentList.add("On? Hahahaha!");
    }

    public Iterator<String> Iterator(){
        return contentList.iterator();
    }

    public static void main(String args[]){
        Subtitle s = new Subtitle();
        Iterator<String> line = s.Iterator();
        while(line.hasNext())
            System.out.println(line.next());
    }
}
