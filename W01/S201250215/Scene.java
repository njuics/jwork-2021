package W01.S201250215;

public class Scene {

        Calabashbrothers sixbaby;
        Monster snake;
        Monster scorpion;
        Monster slave;
        Weapon hammer;
        Weapon fork;

        public Scene() {
            sixbaby = new Calabashbrothers("六孩",300, 45,30,5,10,50,0);
            snake = new Monster("蛇精",200, 10, 20, 5,5,4,0,2);
            scorpion = new Monster("蝎子精",150, 40, 30,21 ,15,5,50,2);
            slave = new Monster("小怪",20,10,5,5,3,3,0,1);
            hammer = new Weapon("锤子",20,scorpion);
            fork = new Weapon("叉子",10,slave);
        }

        public void play() {

            sixbaby.CrowFliesbyPlane(scorpion);
            scorpion.judgeLife();
            sixbaby.cloaking();
            sixbaby.Expelliarmus(scorpion, hammer);
            slave.attackByWeapon(sixbaby, fork);
            sixbaby.speakTo(slave, "fxxk you, eat me!");
            sixbaby.attackByWeapon(slave, 1, hammer);
            //回血
            if(slave.judgeLife()){
                scorpion.increaseHealth(slave.shock*3);
            }

            scorpion.move(-45,0);
            scorpion.speakTo(sixbaby,"woc,tqltql. Invisibility is foul! 嘤嘤嘤");
            sixbaby.move(-45,0);
            sixbaby.speakTo(scorpion, "You fxxking shit, I'm not a primary school student! I'm very nb!");
            sixbaby.attackByWeapon(scorpion,1,hammer);
            scorpion.hugHead();
            if(scorpion.relativeDistance(snake)<10){
                System.out.println("Scorpion enters the door and sees his beautiful wife with his funny look.");
            }
            if(sixbaby.relativeDistance(snake)<10){
                System.out.println("Sixbaby enters the door ands sees the shit taking away his grandpa.");
            }

            sixbaby.attackByWeapon(snake,2,hammer);
            snake.hugHead();

            scorpion.attack(sixbaby);
            sixbaby.attackByWeapon(scorpion,3,hammer);
        }

        public static void main(String[] args) {
            new Scene().play();
        }



}
