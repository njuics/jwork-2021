public class CaveTop extends InertMatter{
	private boolean bright;
	CaveTop(){
		super("ɽ��");
		bright = false;
		System.out.println(name() + "������ʪ");
	}
	public void light() {
		bright = true;
		System.out.println(name() + "����ů������");
	}
	
	@Override
	public void fireImpact() {
		light();
	}
	
}
