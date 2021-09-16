
public class Rock extends Object {
    
    enum State 
    {
        Rise, Fall;
    }

    Character[] hold;
    int point;
    State state;

    public Rock()
    {
        this.name = "The Rock";
        this.hold = new Character[5];
        this.point = 0;
        this.state = State.Fall;
    }

    public void Bear(Character cha)
    {
        if(this.point == 4)
        {
            System.out.println(this.name + ":" + "I am full!");
        }
        else
        {
            this.hold[this.point] = cha;
            this.point++;
            System.out.println(this.name + ":" + cha.name + " get on me!");
        }
    }

    public void Rise()
    {
        if(this.state == State.Fall)
        { 
            System.out.println(this.name + ":" + "Rise!");
            this.state = State.Rise;
        }
        else
        {
            System.out.println(this.name + ":" + "I am already rise!");
        }
    }

    public void Fall()
    {
        if(this.state == State.Fall)
        { 
            System.out.println(this.name + ":" + "Fall!");
            this.state = State.Fall;
        }
        else
        {
            System.out.println(this.name + ":" + "I am already fall!");
        }
    }
}
