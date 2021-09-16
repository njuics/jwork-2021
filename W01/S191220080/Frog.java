public class Frog extends Creature {

    Frog() {
        super("青蛙");
    }

    public void Smile() {
        Event("闻到了什么，很开心");
    }

    public void OpenDoor(Door door) {
        if (door == null) {
            Event("想开门但是没有门");
        } else {
            door.Open();
            Event("打开了 " + door.GetName());
        }
    }

    public void CloseDoor(Door door) {
        if (door == null) {
            Event("想关门但是没有门");
        } else {
            door.Close();
            Event("关上了 " + door.GetName());
        }
    }

    public void Drink(Kettle kettle) {
        if (kettle.GetLiquid() <= 0) {
            Event("想从水壶 " + kettle.GetName() + " 里喝水，但没水了");
        } else {
            kettle.Pour();
            Event("从水壶 " + kettle.GetName() + " 里喝了一滴水");
        }
    }

    public void Yawn() {
        Event("打了个哈欠");
    }

}
