
public class Scene {
    Rock rock;
    StretchHandMonster StretchHandMonster;
    HuluKingKong HuluKingKong;
    Monster Hedgehog;
    public Scene(){
        rock=new Rock(1000,"extremely sharp");
        rock.name="rock";
        StretchHandMonster=new StretchHandMonster(100,500,10);
        StretchHandMonster.name="StretchHandMonster";
        HuluKingKong=new HuluKingKong(500,1000,100);
        HuluKingKong.name="HuluKingKong";
        Hedgehog=new Monster(50,100,20);
        Hedgehog.name="Hedgehog";
    }
    public void play(){
        StretchHandMonster.speakTo(HuluKingKong,"I'm streching hand King！My hand is so long！Even if you are 天王老子，leave your money and life!");
        HuluKingKong.speakTo(StretchHandMonster,"You are shameless!I only have the thing which is in my stomach!");
        StretchHandMonster.speakTo(HuluKingKong,"what?");
        HuluKingKong.speakTo(StretchHandMonster,"you want my wind?");
        HuluKingKong.laugh();
        Hedgehog.laugh();
        StretchHandMonster.speakTo(HuluKingKong,"You have many good things! All of them must be left! Even your little chicken chicken！hhhhhhhh....");
        HuluKingKong.spit();
        HuluKingKong.speakTo(StretchHandMonster,"you lose face!");
        StretchHandMonster.speakTo(HuluKingKong,"Or, give me your heart there!");
        HuluKingKong.angry();
        HuluKingKong.fireAttack(StretchHandMonster,10);
        StretchHandMonster.isDead();
        StretchHandMonster.laugh();
        StretchHandMonster.speakTo(HuluKingKong,"hhhhhh,I don't scare fire and water! I only scare that things are not enough!");
        StretchHandMonster.catchAttack(Hedgehog,45);
        Hedgehog.spitBlood();
        Hedgehog.isDead();
        HuluKingKong.evade();
        HuluKingKong.move("jumps","cliff");
        HuluKingKong.rockAttack(StretchHandMonster,1000,rock,true);
        StretchHandMonster.isDead();
    }
    public static void main(String[] args){
        new Scene().play();
    }
}
