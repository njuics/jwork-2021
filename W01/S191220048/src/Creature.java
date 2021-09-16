
public class Creature {
	private String name;

	Creature(){
		name = "某一生物";
	}
	
	Creature(String N){
		name = N;
	}
	
	final public String name() {
		return name;
	}
	
	public void speakTo(Creature creature1, Creature creature2, String sentence) {
		System.out.println(name +"对" + creature1.name + "和" + creature2.name + "说道：“" + sentence + "”");
		creature1.listenFrom(name, sentence);
		creature2.listenFrom(name, sentence);
	}
	
	public void speakTo(Creature creature, String sentence) {
		System.out.println(name +"对" + creature.name + "说道：“" + sentence + "”");
		creature.listenFrom(name, sentence);
	}
	
	public void listenFrom(String HName, String sentence) {
		System.out.println("：" + name + "听" + HName + "说：“" + sentence + "”");
	}
	
	public void fireImpact() {
		
	}
}
