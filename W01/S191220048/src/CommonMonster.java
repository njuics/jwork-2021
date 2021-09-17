
public class CommonMonster extends Creature {
	
	private String place;
	
	CommonMonster(){
		super("������");
		place = "";
	}
	
	CommonMonster(InertMatter IM){
		super("������");
		place = IM.name();
		System.out.println(name() + "�����" + place);
	}
	
	public final String place() {
		return place;
	}
	
	public void runAway() {
		if(place != "") {
			System.out.println("�����" + place + "��" + name() + "��ɢ����");
			place = "";
		}
		else
			System.out.println(name() + "��ɢ����");
	}
	
	//��дCreature��fireImpact����
	@Override
	public void fireImpact() {
		runAway();
	}
	
}
