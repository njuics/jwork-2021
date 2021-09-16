

public class RockMonster extends Monster {

    int eatRockLimit;

    RockMonster(String _name , int hp, int ap, int dp, int mp , int _eatRockLimit) {
        super(_name,hp, ap, dp, mp);
        eatRockLimit=_eatRockLimit;
    }

    public void eat_rock(Rock rock){
        if(rock.get_weight()<=eatRockLimit){
            System.out.println(name + " eat " + rock.name + " and raises " + Integer.toString(rock.get_weight()) + " attack!");
            attack+=rock.get_weight();
        }
        else{
            System.out.println(name + " try to eat " + rock.name + ", but it's huge! " + name + " is hurt!");
            receiveAttack(rock.get_weight()+defense);
        }
    }

    @Override
    public void receiveRock(Rock rock , Creature attacker) {
        eat_rock(rock);
    }

    @Override
    public void attack(Creature c, int ap ,String type) {
        if(type=="attack1"){
            System.out.println(name + " attack with 黑雾 " + c.name + " of " + ap + "points");
            c.receiveAttack(ap * magic);
        }
        else if(type=="attack2"){
            if(c.get_name()=="葫芦小金刚"){
                
            }
        }
        else if(type=="attack3"){
            Rock rock=new Rock(ap);
            System.out.println(name + " uses 黑雾 and blows down " + rock.name + " and inhale it! ");
            receiveRock(rock, this);
        }
    }


}
