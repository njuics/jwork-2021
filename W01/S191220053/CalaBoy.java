package W01.S191220053;

import W01.S191220053.GlobalVariables.BeingStatus;

class CalaBoy extends Human{
    public CalaBoy(int hp, String name, BeingStatus status){
        super(hp, name, status);
    }

    public void Brag(String method){
        for (int iter = 0; iter < this.listlen; ++iter)
            if (this.entitylist[iter].Name() == method)
                System.out.println(this.UnitName() + " brag about his " + this.entitylist[iter].Name());
    }

    @Override
    public void ReceiveAttack(Entity en){
        for (int iter = 0; iter < this.listlen; ++iter){
            if (this.entitylist[iter].Name() == "PurpleCalabash" && en.Name() == "Fire"){
                //System.out.println("Fire has been defused by PurpleCalabash\n");
                return;
            }
        }
        if (this.hp <= en.Attribute()){
            this.hp = 0;
            this.status = BeingStatus.dead;
            System.out.println(this.UnitName() + " is dead under the attack of " + en.Name());
        }
        else {
            this.hp -= en.Attribute();
            System.out.println(this.UnitName() + " is injuried by " + en.Name());
        }
    }
}
