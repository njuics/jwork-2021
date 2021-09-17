
public class CommonMonster extends Creature {
	
	private String place;
	
	CommonMonster(){
		super("众妖怪");
		place = "";
	}
	
	CommonMonster(InertMatter IM){
		super("众妖怪");
		place = IM.name();
		System.out.println(name() + "埋伏于" + place);
	}
	
	public final String place() {
		return place;
	}
	
	public void runAway() {
		if(place != "") {
			System.out.println("埋伏于" + place + "的" + name() + "四散奔逃");
			place = "";
		}
		else
			System.out.println(name() + "四散奔逃");
	}
	
	//重写Creature的fireImpact方法
	@Override
	public void fireImpact() {
		runAway();
	}
	
}
