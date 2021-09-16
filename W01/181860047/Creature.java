public class Creature {
    private int spirit;
    private int health;
    private int alcoholDefense;
    private String name;

    String[] memory;
    int memoryoffset;

    private void setName(String name) {
        this.name = name;
    }

    public Creature() {
        this.name="not name yet";
        this.health = 100;
        this.spirit = 40;
        this.alcoholDefense = 10;
        this.memory = new String[8];
        this.memoryoffset = 0;
    }

    public Creature(String n,double sp, double he, double ad) {
        this();
        this.setName(n);
        this.setSpirit(sp);
        this.setHealth(he);
        this.setAlcoholDefense(ad);
    }

    private void setHealth(double he) {
        this.health *= he;
    }

    private void setSpirit(double sp) {
        this.spirit *= sp;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getHealth() {
        return health;
    }

    public int getAlcoholDefense() {
        return alcoholDefense;
    }

    public String getName() {
        return name;
    }

    public String[] getMemory() {
        return memory;
    }

    public int getMemoryoffset() {
        return memoryoffset;
    }

    private void setAlcoholDefense(double ad) {
        this.alcoholDefense *= ad;
    }

    public void speakTo(Creature c, String s) {
        System.out.println(this.getName() + "对"+c.getName()+"说: '" + s + "'");
        c.listen(s);
    }

    public void listen(String something) {
        System.out.println(this.getName() + ": 我听到 '" + something + "'");
        memory[memoryoffset % memory.length] = something;
    }

    public void drinkAlcohol(Wine w) {
        int count = 0;
        if(w.getName().equals("蝎子的坛坛酒"))
            System.out.println("快把所有酒给我打开");
        while (w.getCount() > 0) {
            if (!isDruken()) {
                count++;
                w.Countdec();
                this.spirit -= Math.max((w.getAlcoholdegree() - this.alcoholDefense), 0);
            } else break;
        }
        if(w.getCount()==0)
            System.out.println(this.getName()+"喝完了"+count+w.getName());
        if(isDruken())
            System.out.println(this.getName() + "只能喝" + count + " 杯酒，然后倒在椅子上");
        else
            System.out.println(this.getName()+" 大喊 '拿更多酒来'");
    }

    boolean isDruken() {
        if (spirit <= 0)
            return true;
        return false;
    }

}
