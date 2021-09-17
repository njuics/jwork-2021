//无生命物体
public class InertMatter {
	
	private String name;
	
	InertMatter(){
		name = "某一物体";
	}
	
	InertMatter(String Hname){
		name = Hname;
	}
	
	public final String name() {
		return name;
	}
	
	public void fireImpact() {
		
	}
	
}
