package work01;

public class Monster extends Creature {
	
	Weapon weapon;
	
	public Monster(int h, int a, int d, Weapon w){
		health = h;
		attack = a;
		defence = d;
		weapon = w;
	}
	
	public void getWeapon(Weapon w) {
		weapon = w;
	}
	
	@Override
	public void attack(Creature c, int damage, boolean ismiss) {
		System.out.println("I attack " + c.name + " of " + damage + " points");
		c.receiveattack(damage + weapon.power, ismiss);
	}
	
	@Override
	public void emotion(String e) {
		String words;
		switch(e) {
			case "happy":
				words = "hahahahahaha";
				break;
			case "angry":
				words = "aaaaayaaaaa!!!";
				break;
			case "painful":
				words = "eiya--wuhu--";
				break;
			default: return;
		}
		System.out.println("I am " + e + ": " + words);
	}
}
