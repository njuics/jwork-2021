
public class HuoWa extends Creature{
	
	HuoWa(){
		super("����");
	}
	
	public void rollEyes() {
		System.out.println(name() + "ת��ת�۾�");
	}
	
	public void disCover(CommonMonster CM) {
		if(CM.place() != "")
			System.out.println(name() + "����" + CM.place() + "�����" + CM.name());
		else
			System.out.println(name() + "����" + CM.name() + "��ɢ����");
	}
	
	public void fireTo(Creature creature) {
		System.out.println(name() + "������" + creature.name() + "�������");
		creature.fireImpact();
	}
	
	public void fireTo(InertMatter IM) {
		System.out.println(name() + "������" + IM.name() + "�������");
		IM.fireImpact();
	}
	
}
