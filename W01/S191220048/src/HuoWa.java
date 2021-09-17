
public class HuoWa extends Creature{
	
	HuoWa(){
		super("火娃");
	}
	
	public void rollEyes() {
		System.out.println(name() + "转了转眼睛");
	}
	
	public void disCover(CommonMonster CM) {
		if(CM.place() != "")
			System.out.println(name() + "发现" + CM.place() + "埋伏的" + CM.name());
		else
			System.out.println(name() + "发现" + CM.name() + "四散奔逃");
	}
	
	public void fireTo(Creature creature) {
		System.out.println(name() + "嘴中向" + creature.name() + "喷射火焰");
		creature.fireImpact();
	}
	
	public void fireTo(InertMatter IM) {
		System.out.println(name() + "嘴中向" + IM.name() + "喷射火焰");
		IM.fireImpact();
	}
	
}
