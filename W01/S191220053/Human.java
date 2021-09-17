package W01.S191220053;

import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.GlobalClassType;
import W01.S191220053.GlobalVariables.BeingStatus;

class Human extends Being{
    public int listlen;
    public Entity[] entitylist;

    public Human(int hp, String name, BeingStatus status){
        super(hp, name, status);
        listlen = 1;
        entitylist = new Entity[5];
        entitylist[0] = new Entity("BareHand", EntityType.weapon, 1);
    }

    public void ObtainEntity(Entity newentity){
        if (listlen == this.entitylist.length)
            return;
        this.entitylist[listlen] = newentity;
        ++listlen;
    }

    public void DiscardEntity(String entityname){
        for (int iter = 0; iter < listlen; ++iter){
            if (this.entitylist[iter].Name() == entityname){
                for (int succ = iter + 1; succ < listlen; ++succ)
                    this.entitylist[succ - 1] = this.entitylist[succ];
                --listlen;
            }
        }
    }

    public Argument ExertEntity(String method, Argument target, GlobalClassType classtype){
        // if fail or doesn't have a ret val, then ret null
        for (int iter = 0; iter < listlen; ++iter)
            if (this.entitylist[iter].Name() == method)
                return this.entitylist[iter].Exert(target, classtype);
        return null;
    }
    
    @Override
    public void Attack(Being be, String method){
        for (int iter = 0; iter < this.listlen; ++iter){
            if (this.entitylist[iter].Name() == method){
                be.ReceiveAttack(this.entitylist[iter]);
            }
        }
    }

    public void ReceiveAttack(Entity en){}
}
