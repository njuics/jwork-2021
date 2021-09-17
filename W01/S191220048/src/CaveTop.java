public class CaveTop extends InertMatter{
	private boolean bright;
	CaveTop(){
		super("山洞");
		bright = false;
		System.out.println(name() + "阴暗潮湿");
	}
	public void light() {
		bright = true;
		System.out.println(name() + "明亮暖和起来");
	}
	
	@Override
	public void fireImpact() {
		light();
	}
	
}
