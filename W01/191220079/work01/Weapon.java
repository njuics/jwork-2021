package work01;

public class Weapon extends Being {
	int power;
	int health;
	
	public Weapon(int p, int h){
		power = p;
		health = h;
	}
	
	public void broken() {
		health--;
		if(health <= 0) {
			power = 0;
			System.out.println("I am destroyed");
		}
		else {
			power /= 2;
			if(power == 0)
				health = 0;
			System.out.println("I am broken");
		}
	}
}
