public class Boss extends Creature{
    

    Boss(String na){
        name=na;
    }


    public void Escape(){
        if(name=="蝎子精"){
            System.out.println("蝎子精挟持着爷爷跑出了洞穴");
        }
        else{
            System.out.println("蛇精紧随其后跑出了洞穴");
        }

    }

}