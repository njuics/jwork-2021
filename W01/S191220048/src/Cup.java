
public class Cup extends InertMatter{
	
	boolean hot;
	
	Cup(){
		super("�Ʊ�");
		hot = false;
	}
	
	public void CupHot() {
		hot = true;
		if(hot)
			System.out.println(name() + "��ľ�ˮ��������");
	}
	
	@Override
	public void fireImpact() {
		CupHot();
	}
	
}
