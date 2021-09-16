public class Scene {
    Boss 金刚大王;
    Hero 葫芦小金刚;
    Animal 刺猬;

    public Scene(){
       金刚大王 = new Boss("金刚大王",99999,99999,99999,"navel");
       葫芦小金刚=new Hero("葫芦小金刚",10,10,10);
       刺猬 =new Animal("刺猬");
    }
    public void play(){
       
        金刚大王.speakTo(葫芦小金刚,"What a Gourd baby！ I've heard your name for a long time. I also know your weakness!");
        金刚大王.laugh();
        金刚大王.speakTo(葫芦小金刚,"Your weakness is that you are afraid of spanking with a stick. Your weakness is on your hip!");
        葫芦小金刚.rolleyes();
        葫芦小金刚.speakTo(金刚大王, "Goblin, don't brag. Don't you have a weakness?");
        金刚大王.showWeakness();
        金刚大王.speakTo(葫芦小金刚,"I have no weakness,What weakness do I have? I am invincible!");
        金刚大王.laugh();
        金刚大王.grabAttack(葫芦小金刚);
        葫芦小金刚.giantMode();
        葫芦小金刚.attack(金刚大王, 葫芦小金刚.attack);
        金刚大王.grabAttack(葫芦小金刚);
        葫芦小金刚.turnInvisiable();
        金刚大王.seeInvisiable(葫芦小金刚);
        葫芦小金刚.attack(金刚大王, 葫芦小金刚.attack);
        金刚大王.grabAttack(葫芦小金刚);
        金刚大王.speakTo(葫芦小金刚,"HA HA HA!There is no escape for you！");
        刺猬.attack(金刚大王,刺猬.attack );
        刺猬.sacrifice();
        金刚大王.laugh();
        葫芦小金刚.angry();
        葫芦小金刚.finalAttack(金刚大王);
        葫芦小金刚.laugh();
        葫芦小金刚.smallMode();
    }
    public static void main(String[] args) {
        new Scene().play();
    }
}
