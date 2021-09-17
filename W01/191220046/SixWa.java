public class SixWa extends HuLuWa{

    SixWa() {
        name = "SixWa";
    }

    public void hideFromAttack() {
        System.out.println(name+" hide from attack");
    }

    @Override
    public void useSkill() {
        super.useSkill();
        System.out.println(name+" became invisible");
    }

    public void beInsertedByGrass() {
        System.out.println(name+" is inserted by grass");
    }

    public void beTrapped() {
        System.out.println(name+" is trapped");
    }

}
