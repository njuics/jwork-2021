package W01.S191220053;

import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.GlobalClassType;

class Entity extends Argument{
    public String name;
    public EntityType type;
    public int attribute;

    public Entity(String name, EntityType type, int attribute){
        this.name = name;
        this.type = type;
        this.attribute = attribute;
    }

    public String Name(){return this.name;}
    public EntityType Type(){return this.type;}
    public int Attribute(){return this.attribute;}
    
    // 方法生效
    public Argument Exert(Argument target, GlobalClassType classtype){return null;}
}
