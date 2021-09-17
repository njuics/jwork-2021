package work01;

public class Xiezi extends Monster {
	
	boolean isbody;
	
	public Xiezi(String n){
		super(500, 50, 50, new Weapon(50, 4));
		isbody = false;
		name = n;
	}
	
	public void createWeapon() {
		weapon = new Weapon(10, 1);
		isbody = true;
		System.out.println("I use my pincers to attack");
	}
	
	public void checkWeapon() {
		if(weapon.health <= 0) {
			if(isbody) {
				health -= 10;
			}
			else
				System.out.println("I throw away the weapon");
		}
	}
	
	public void escape() {
		System.out.println("I run");
	}
}
