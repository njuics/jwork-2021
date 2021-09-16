public class Character extends Object {

    enum State
    {
        Normal, Frozen, Dizziness, Burn, Dead;
    }

    int hp;
    int ap;
    Tool tool;
    State state;
    
    public Character(String name, int hp, int ap, Tool tool)
    {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.tool = tool;
        this.state = State.Normal;
    } 

    public void Speak(String str)
    {
        System.out.println(this.name + ":" + str);
    }
    
    public void Get_Tool(Tool tool)
    {
        this.tool = tool;
        System.out.println(this.name + ":" + "I got a " + this.tool.name + "!");
    }

    public void Normal_Attack(Character character)
    {
        System.out.println(this.name + ":" + "I attack " + character.name + "!");
        character.Be_Attacked(this.ap);
    }
    
    public void Tool_Attack(Character character)
    {
        if(this.tool == null)
        {
            System.out.println(this.name + ":" + "I haven't got a tool!");
        }
        else
        {
            switch(this.tool.Get_Name())
            {
                case "RuYi":
                    System.out.println(this.name + ":" + "I use RuYi to attack " + character.name + "!");
                    character.Be_Attacked(this.ap + this.tool.Damage());
                    character.Be_Frozen();
                    break;
                case "Spear":
                    System.out.println(this.name + ":" + "I use Spear to attack " + character.name + "!");
                    character.Be_Attacked(this.ap + this.tool.Damage());
                    character.Get_Tool(this.tool);
                    this.tool = null;
                    break;
                default:
                    break;
            }
        }
    }

    public void Abandon_Tool()
    {
        if(this.tool == null)
        {
            System.out.println(this.name + ":" + "I haven't got a tool!");
        }
        else
        {
            System.out.println(this.name + ":" + "I abandon my " + this.tool.name);
            this.tool = null;
        }
    }

    public void Be_Attacked(int damage)
    {
        if(damage >= this.hp)
        {
            this.state = State.Dead;
            System.out.println(this.name + ":" + "I am dead!");
        }
        else
        {
            this.hp -= damage;
            System.out.println(this.name + ":" + "I lose " + damage + " HP!");
        }
    }

    public void Be_Frozen()
    {
        this.state = State.Frozen;
        System.out.println(this.name + ":" + "I am frozen!");
    }

}
