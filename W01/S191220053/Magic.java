package W01.S191220053;

import W01.S191220053.GlobalVariables.BeingStatus;
import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.GlobalClassType;
import W01.S191220053.GlobalVariables.MagicStatus;

class Magic extends Entity{
    private MagicStatus status;

    public Magic(String name, EntityType type, int attribute, MagicStatus status){
        super(name, type, attribute);
        this.status = status;
    }

    public MagicStatus Status(){return this.status;}
    public void StatusTransition(MagicStatus newstatus){
        this.status = newstatus;
    }

    @Override
    // Should be more specific
    public Argument Exert(Argument target, GlobalClassType classtype){
        // 无参数类型(召唤类法术不需要target)
        if (classtype == GlobalClassType.None){
            // 没被关
            if (this.status != MagicStatus.shutted){
                SpecialEntity result = null;
                switch (this.Name()){
                    case "Fire":
                        result = new SpecialEntity(10, BeingStatus.alive, this);
                        System.out.println("Fire was released");
                        break;
                    case "Water":
                        result = new SpecialEntity(10, BeingStatus.alive, this);
                        System.out.println("Water was released");
                        break;
                    case "Lighting":
                        result = new SpecialEntity(10, BeingStatus.alive, this);
                        System.out.println("Lighting was released");
                        break;
                }
                return result;
            }
        }
        return null;
    }
}
