
public class ScorpionEssence extends Creature{
	
	ScorpionEssence(){
		super("蝎子精");
	}
	
	public void yell() {
		System.out.println(name() + "Σ(っ °Д °;)っ，“啊”了一声");
	}
	
	public void praise() {
		System.out.println(name() + "竖起大拇指赞叹");
	}
	
}
