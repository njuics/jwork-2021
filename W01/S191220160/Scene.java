package W01.S191220160;

public class Scene {
    Calabash dawa; //大娃
    Monster snake,scorpion;//,centipede; //蛇精 蝎子精 蜈蚣精
    Weapon spear,ruyi,iceberg;
    Scene(){
        dawa=new Calabash("DaWa",500,100,200);
        snake=new Monster("Snake",300,100,50);
        scorpion=new Monster("Scorpion",500,100,150);
        //centipede=new Monster("Centipede",400,80,100);
        spear=new Weapon("Spear",150,"我弯了！");
        ruyi=new Weapon("Ruyi",100,"I'm broken!");
        iceberg=new Weapon("Iceberg",100,"我裂开来！");
    }
    public void play(){
        dawa.speakTo(snake,"妖精！还我爷爷！还我爷爷！");
        snake.rolleyes();
        snake.speakTo(dawa,"OK,OK. 你这娃娃倒是一片孝心。Your grandpa is here,so is your mom. Come on,给我磕头!");
        dawa.spit();
        scorpion.laughOutLoud();
        dawa.speakTo(scorpion,"If you don't release my grandpa,I will smash your cave!");
        scorpion.laughOutLoud();        

        scorpion.getWeapon(spear);
        scorpion.attackWithWeapon(dawa);  //scorpion throw the spear at dawa
        dawa.getWeapon(spear);      //dawa get the spear 
        dawa.breakWeapon(spear);     //dawa bend the spear                      
        dawa.attackWithWeapon(scorpion);   //dawa throw the bent spear back
        dawa.laughOutLoud();

        snake.getWeapon(ruyi);
        snake.getWeapon(iceberg);
        snake.attackWithWeapon(dawa);
        dawa.breakWeapon(iceberg);

    }
    public static void main(String[] args) {
        new Scene().play();
    }
}
