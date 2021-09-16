package W01.S191220053;

import W01.S191220053.GlobalVariables.BeingStatus;
import W01.S191220053.GlobalVariables.EntityType;

class SpecialEntity extends Being{
    private Entity entity;

    public SpecialEntity(int hp, BeingStatus status, Entity en){
        super(hp, en.Name(), status);
        this.entity = en;
    }

    public void Attack(Being target){
        switch (this.UnitName()){
            case "Fire":
                if (target.UnitName() == "Water"){
                    if (this.hp > 5){
                        this.hp -= 5;
                        System.out.println(this.UnitName() + " counter the " + target.UnitName());
                    }
                    else {
                        this.hp = 0;
                        System.out.println(this.UnitName() + " was consumed against " + target.UnitName());   
                    }
                }
                break;
            case "Water":
                if (this.hp > 5){
                    this.hp -= 5;
                    System.out.println(this.UnitName() + " counter the " + target.UnitName());
                }
                else {
                    this.hp = 0;
                    System.out.println(this.UnitName() + " was consumed against " + target.UnitName());   
            }
                break;
            case "Lighting":
            
                break;
        }
        //System.out.println(this.UnitName() + " is attacking " + target.UnitName());
        target.ReceiveAttack(entity);
    }

    @Override
    public void Attack(Being target, String method){
        this.Attack(target);
    }
    
    public void ReceiveAttack(Entity en){
        if (en.Type() == EntityType.weapon){
            if (en.name == "PurpleCalabash"){
                this.status = BeingStatus.dead;
                System.out.println(this.UnitName() + " is destroyed");
            }
        }
        else if (en.Type() == EntityType.magic){
            switch (this.UnitName()){
                case "Fire":
                    if (en.Name() == "Water"){
                        if (this.hp > 5){
                            this.hp -= 5;
                            System.out.println(this.UnitName() + " counter the " + en.Name());
                        }
                        else {
                            this.hp = 0;
                            System.out.println(this.UnitName() + " was consumed against " + en.Name());
                        }
                    }
                    break;
                case "Water":
                    if (en.Name() == "Fire"){
                        if (this.hp > 5){
                            this.hp -= 5;
                            System.out.println(this.UnitName() + " counter the " + en.Name());
                        }
                        else {
                            this.hp = 0;
                            System.out.println(this.UnitName() + " was consumed against " + en.Name());
                        }
                    }
                    break;
                case "Lightling":
                    break;
            }

        }
    }

    public void ReceiveDialog(String dialog) {}
}
