package W01.S191220053;

import W01.S191220053.GlobalVariables.BeingStatus;
import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.GlobalClassType;
import W01.S191220053.GlobalVariables.WeaponStatus;

class Weapon extends Entity{
    private int duribility;
    private WeaponStatus status;

    public Weapon(String name, EntityType type, int attribute, int duribility, WeaponStatus status){
        super(name, type, attribute);
        this.duribility = duribility;
        this.status = status;
    }

    public int Duribility(){return this.duribility;}
    public void DuribilityChange(int newvalue){this.duribility = newvalue;}
    public WeaponStatus Status(){return this.status;}
    public void WeaponStatusChange(WeaponStatus newstatus){this.status = newstatus;}

    @Override
    public Argument Exert(Argument target, GlobalClassType classtype){
        switch (classtype){
            // 对召唤物进行攻击
            case SpecialEntity:
                if (this.Name() == "PurpleCalabash"){
                    SpecialEntity temp =(SpecialEntity)target;
                    System.out.println(this.Name() + " has defused the " + temp.UnitName());
                    temp.StatusTransition(BeingStatus.dead);
                }
                break;
            case CalaBoy:
                if (this.Name() == "PurpleCalabash"){
                    CalaBoy temp = (CalaBoy)target;
                    System.out.println(this.Name() + " has made " + temp.UnitName() + " " + BeingStatus.inchaos);
                    temp.StatusTransition(BeingStatus.inchaos);
                }
                break;
            // 攻击敌人的武器
            case Weapon:
                break;
            default:
                break;
        }
        return null;
    }
}
