package W01.S191220053;

import W01.S191220053.GlobalVariables.BeingStatus;

class Being extends Argument{
    public int hp;
    public String name;
    public BeingStatus status;
    
    public Being(int hp, String name, BeingStatus status){
        this.hp = hp;
        this.name = name;
        this.status = status;
    }

    public int UnitHP(){return this.hp;}
    public String UnitName(){return this.name;}
    public BeingStatus UnitStatus(){return this.status;}

    public void SpeakTo(Being be, String dialog){
        System.out.println(this.UnitName() + ": " + dialog);
        be.ReceiveDialog(dialog);
    }
    public void ReceiveDialog(String dialog){
        System.out.println(this.UnitName() + ": I hear \"" + dialog + "\"");
    }
    public void BroadCast(String dialog){
        System.out.println(this.UnitName() + ": " + dialog);
        Scene.BroadCastMessage(this, dialog);
    }
    public void GroupBroadCast(Being[] target, String dialog){
        System.out.println(this.UnitName() + ": " + dialog);
        Scene.GroupBroadCastMessage(target, dialog);
    }

    public void Attack(Being be, String method){}
    public void ReceiveAttack(Entity en){}

    public void StatusTransition(BeingStatus newstatus){
        this.status = newstatus;
        System.out.println(this.UnitName() + " is " + newstatus);
    }
}
