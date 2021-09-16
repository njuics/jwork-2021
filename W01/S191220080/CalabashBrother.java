public class CalabashBrother extends Creature {

    public static final int STATUS_CALABASHBROTHER = 0, STATUS_LIGHT = 1;

    protected int m_Status;
    protected Kettle m_PickingUp;

    CalabashBrother() {
        super("葫芦娃");
        m_Status = STATUS_CALABASHBROTHER;
        m_PickingUp = null;
    }

    public void BecomeLight() {
        // 我要成为光！技能
        if (m_Status == STATUS_CALABASHBROTHER)
            Event("变成了光！");
        m_Status = STATUS_LIGHT;
    }

    public void Recover() {
        // 还原成葫芦娃
        if (m_Status == STATUS_LIGHT)
            Event("还原成了葫芦兄弟");
        m_Status = STATUS_CALABASHBROTHER;
    }

    public void Jump() {
        // 跳跃动作
        if (m_Status == STATUS_CALABASHBROTHER)
            Event("跳了一下");
        else
            Event("想跳一下，但跳不起来");
    }

    public void Fly() {
        // 飞翔动作
        if (m_Status == STATUS_LIGHT)
            Event("在空中游荡");
        else
            Event("想在空中游荡，但形态不对");
    }

    public void Look() {
        Event("向门内偷窥");
    }

    public void Smile() {
        Event("想到了什么，笑了笑");
    }

    public void PickUp(Kettle kettle) {
        // 拿起水壶
        m_PickingUp = kettle;
        Event("拿起了 " + kettle.GetName());
    }

    public void Throw() {
        m_PickingUp = null;
        Event("放下了水壶");
    }

    public void Pour() {
        if (m_PickingUp != null) {
            m_PickingUp.Pour();
            Event("倒出了 " + m_PickingUp.GetName() + " 里的液体");
        } else {
            Event("手里没有水壶");
        }
    }
}
