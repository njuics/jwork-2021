
public class Creature {
	private String name;

	Creature(){
		name = "ĳһ����";
	}
	
	Creature(String N){
		name = N;
	}
	
	final public String name() {
		return name;
	}
	
	public void speakTo(Creature creature1, Creature creature2, String sentence) {
		System.out.println(name +"��" + creature1.name + "��" + creature2.name + "˵������" + sentence + "��");
		creature1.listenFrom(name, sentence);
		creature2.listenFrom(name, sentence);
	}
	
	public void speakTo(Creature creature, String sentence) {
		System.out.println(name +"��" + creature.name + "˵������" + sentence + "��");
		creature.listenFrom(name, sentence);
	}
	
	public void listenFrom(String HName, String sentence) {
		System.out.println("��" + name + "��" + HName + "˵����" + sentence + "��");
	}
	
	public void fireImpact() {
		
	}
}
