package work01;

public class Creature extends Being {
	int health;
	int attack;
	int defence;
	String name;
	String[] memory;
	int memory_index;
	
	public Creature() {
		memory = new String[10];
		memory_index = 0;
	}
	
	public void speak(Creature c, String content) {
		System.out.println("I tell " + c.name + " '" + content + "'");
		c.listen(content);
	}
	
	public void listen(String content) {
		System.out.println("I heard: " + content);
		memory[memory_index % memory.length] = content;
		memory_index++;
	}
	
	public void emotion(String e) {
		String words;
		switch(e) {
			case "happy":
				words = "hahahahahaha";
				break;
			case "angry":
				words = "eneneieiiiii!!!";
				break;
			default: return;
		}
		System.out.println("I am " + e + ": " + words);
	}
	
	public void attack(Creature c, int damage, boolean ismiss) {
		System.out.println("I attack " + c.name + " of " + damage + " points");
		c.receiveattack(damage, ismiss);
	}
	
	public void receiveattack(int damage, boolean ismiss) {
		if(!isdead()) {
			if(ismiss) {
				System.out.println("Miss");
				return;
			}
			if(defence < damage) {
				health -= damage;
				System.out.println("I got " + damage + " points damage");
			}
		}
	}
	
	public boolean isdead() {
		if(health <= 0) {
			System.out.println("I am dead");
			return true;
		}
		return false;
	}
}
