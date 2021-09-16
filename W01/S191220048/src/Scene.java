
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
		snake.speakTo(huo, shui, "���");
		scorpion.speakTo(huo, shui, "�ǺǺǣ�������զ�Ǹ�");
		huo.speakTo(scorpion, snake, "��͵��Ƿǳ��㣬��ϧ̫����һ�㣬�ⶴ...");
		shui.speakTo(scorpion, snake,"Ҳ�������ְ��������������ϣ�ƨ�ɶ�����");
		huo.rollEyes();
		huo.disCover(monster);
		scorpion.speakTo(huo,shui,"�ԶԶ�");
		scorpion.speakTo(monster,  "���������Ƶ����𣬹������");
		huo.speakTo(scorpion, "�����ò��ŷ���ô�����������ҵ�");
		huo.fireTo(cave);
		huo.fireTo(monster);
		huo.rollEyes();
		huo.disCover(monster);
		huo.fireTo(cup);
		scorpion.yell();
		snake.yell();
		snake.speakTo(huo, shui, "��λ�ֵܴ�ݹ��٣�Ϊ�������԰�");
		scorpion.praise();
		scorpion.speakTo(huo, shui, "����������ͨ���������");
	}
	
	public static void main (String args[]) {
		Scene cur = new Scene();
		cur.play();
	}
}
//scorpion essence
//Snake essence