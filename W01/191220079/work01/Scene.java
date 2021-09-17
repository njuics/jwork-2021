package work01;

// P6 3:39-4:36
public class Scene {
	
	Sanwa s;
	Xiezi x;
	
	public Scene(){
		s = new Sanwa("Sanwa");
		x = new Xiezi("Xiezi");
	}
	
	public void play() {
		x.emotion("happy");
		s.emotion("angry");
		
		s.attack(x, 80, false);
		s.emotion("happy");
		
		for(int i = 0; i < 5; i++)
			x.attack(s, 100, true);
		
		for(int i = 0; i < 4; i++)
			s.breakWeapon(x);
		x.emotion("angry");
		s.emotion("happy");
		
		x.checkWeapon();
		x.createWeapon();
		s.speak(x, "Come on");
		x.attack(s, 100, false);
		s.breakWeapon(x);
		
		x.createWeapon();
		s.speak(x, "Come on again");
		x.attack(s, 100, false);
		s.breakWeapon(x);
		x.emotion("painful");
		
		s.emotion("happy");
		x.emotion("angry");
		x.escape();
		s.speak(x, "别想跑！哪里走！");
		s.move();
	}
	
	public static void main(String[] args) {
		new Scene().play();
	}

}
