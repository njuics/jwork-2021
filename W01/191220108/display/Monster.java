public class Monster extends Creature{

    Monster(int bv, int wn, int le, int LH, int BH,String na){
        blood_volume=bv;
        weapon_num=wn;
        level=le;
        LittleHarm=LH;
        Defense=false;
        BigHarm=BH;
        name=na;
        death=false;
    }
}