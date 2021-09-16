
public class Cup extends InertMatter{
	
	boolean hot;
	
	Cup(){
		super("酒杯");
		hot = false;
	}
	
	public void CupHot() {
		hot = true;
		if(hot)
			System.out.println(name() + "里的酒水沸腾起来");
	}
	
	@Override
	public void fireImpact() {
		CupHot();
	}
	
}
