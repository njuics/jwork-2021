public class erwa extends Creatrue {
    erwa(String s) {
        health = 100;
        defense = 1;
        attack = 20;
        name = s;
    }

    public void openEye() {
        System.out.println(name + "睁开千里眼");
    }

}