
public class Scene {
	CaveTop cave;
	Cup cup;
	CommonMonster monster;
	ScorpionEssence scorpion;
	SnakeEssence snake;
	ShuiWa shui;
	HuoWa huo;
	
	Scene(){
		cave = new CaveTop();
		cup = new Cup();
		monster = new CommonMonster(cave);
		scorpion = new ScorpionEssence();
		snake = new SnakeEssence();
		shui = new ShuiWa();
		huo = new HuoWa();
	}
	
	public void play() {
		snake.speakTo(huo, shui, "请喝");
		scorpion.speakTo(huo, shui, "呵呵呵，来来，咋们干");
		huo.speakTo(scorpion, snake, "这就倒是非常香，可惜太冷了一点，这洞...");
		shui.speakTo(scorpion, snake,"也是又冷又暗，坐在这冷板凳上，屁股都发亮");
		huo.rollEyes();
		huo.disCover(monster);
		scorpion.speakTo(huo,shui,"对对对");
		scorpion.speakTo(monster,  "来啊，快掌灯生火，共庆佳宴");
		huo.speakTo(scorpion, "慢，用不着费那么大力气，看我的");
		huo.fireTo(cave);
		huo.fireTo(monster);
		huo.rollEyes();
		huo.disCover(monster);
		huo.fireTo(cup);
		scorpion.yell();
		snake.yell();
		snake.speakTo(huo, shui, "二位兄弟大驾光临，为洞府增辉啊");
		scorpion.praise();
		scorpion.speakTo(huo, shui, "你们真是神通广大，佩服佩服");
	}
	
	public static void main (String args[]) {
		Scene cur = new Scene();
		cur.play();
	}
}
//scorpion essence
//Snake essence