public class scene {
    Boss 金刚大王;
    hero 葫芦小金刚;
    animal 刺猬;

    public scene(){
       金刚大王 = new Boss("金刚大王",99999,99999,99999,"navel");
       葫芦小金刚=new hero("葫芦小金刚",10,10,10);
       刺猬 =new animal("刺猬");
    }
    public void play(){
       
        金刚大王.speakTo(葫芦小金刚,"What a Gourd baby！ I've heard your name for a long time. I also know your weakness!");
        金刚大王.laugh();
        金刚大王.speakTo(葫芦小金刚,"Your weakness is that you are afraid of spanking with a stick. Your weakness is on your hip!");
        葫芦小金刚.rolleyes();
        葫芦小金刚.speakTo(金刚大王, "Goblin, don't brag. Don't you have a weakness?");
        金刚大王.show_weakness();
        金刚大王.speakTo(葫芦小金刚,"I have no weakness,What weakness do I have? I am invincible!");
        金刚大王.laugh();
        金刚大王.grab_attack(葫芦小金刚);
        葫芦小金刚.Giant_Mode();
        葫芦小金刚.attack(金刚大王, 葫芦小金刚.attack);
        金刚大王.grab_attack(葫芦小金刚);
        葫芦小金刚.hide_on_bush();
        金刚大王.I_see_dead_people(葫芦小金刚);
        葫芦小金刚.attack(金刚大王, 葫芦小金刚.attack);
        金刚大王.grab_attack(葫芦小金刚);
        金刚大王.speakTo(葫芦小金刚,"HA HA HA!There is no escape for you！");
        刺猬.attack(金刚大王,刺猬.attack );
        刺猬.xijuren();
        金刚大王.laugh();
        葫芦小金刚.angry();
        葫芦小金刚.final_attack(金刚大王);
        葫芦小金刚.laugh();
        葫芦小金刚.Small_Mode();
    }
    public static void main(String[] args) {
        new scene().play();
    }
}
