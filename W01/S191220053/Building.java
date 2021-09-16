package W01.S191220053;

import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.BeingStatus;

class Building extends Being{
    
    public Building(int hp, String name, BeingStatus status){
        super(hp, name, status);
    }

    @Override
    public void ReceiveDialog(String dialog){}

    public void ReceiveAttack(Entity en){
        if (en.type == EntityType.weapon){
            System.out.println(this.UnitName() + " receive " + en.Attribute() + " damages by " + en.Name());
            this.hp -= en.Attribute();
        }
        else if (en.type == EntityType.magic){
            switch (en.Name()){
                case "Fire":
                    break;
                case "Water":
                    break;
                case "Lighting":
                    System.out.println(this.UnitName() + " receive " + en.Attribute() + " lighting damage");
                    this.hp -= en.Attribute();
                    break;
            }
        }

    }
}
