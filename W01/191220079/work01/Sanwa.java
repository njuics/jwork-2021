package work01;

public class Sanwa extends Creature {
	
	public Sanwa(String n){
		health = 100;
		attack = 80;
		defence = 200;
		name = n;
	}
	
	@Override
	public void receiveattack(int damage, boolean ismiss) {
		if(!isdead()) {
			if(ismiss) {
				System.out.println("Miss");
				return;
			}
			System.out.println("No damage");
		}
	}
	
	public void breakWeapon(Monster m) {
		if(m.weapon.health > 0) {
			System.out.println("I break your weapon: hei");
			m.weapon.broken();
		}
	}
	
	public void move() {
		System.out.println("I run after");
	}
}
