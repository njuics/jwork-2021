public class Scene {
    Grandpa gdpa;
    Gourd grda;
    Gourd grdb;
    Gourd grdc;
    Gourd grdd;
    Gourd grde;
    Gourd grdf;
    Gourd grdg;
    Rainbow rainbow;
    Vine vine;

    public Scene()
    {
        rainbow = new Rainbow();
        vine = new Vine();
        gdpa = new Grandpa();
        grda = new Gourd("a");
        grdb = new Gourd("b");
        grdc = new Gourd("c");
        grdd = new Gourd("d");
        grde = new Gourd("e");
        grdf = new Gourd("f");
        grdg = new Gourd("g");
    }

    void play()
    {
        gdpa.name = "Grandpa";
        gdpa.generate();
        
        rainbow.generate(); 
        vine.generate();
        
        grda.generate();
        grdb.generate();
        grdc.generate();
        grdd.generate();
        grde.generate();
        grdf.generate();
        grdg.generate();

        grda.talk(grda.name+": Gramdpa!");
        grdb.talk(grdb.name+": Gramdpa!");
        grdc.talk(grdc.name+": Gramdpa!");
        grdd.talk(grdd.name+": Gramdpa!");
        grde.talk(grde.name+": Gramdpa!");
        grdf.talk(grdf.name+": Gramdpa!");
        grdg.talk(grdg.name+": Gramdpa!");

        gdpa.touch(grda);
        gdpa.talk("My dear kids! My dear kids!");
        gdpa.sob();

        gdpa.talk("This poor village is all surrouded by stone.");
        gdpa.talk("Water and nutrition are rare here.");

        gdpa.touch(grdb);
        gdpa.talk("But I will try every means to let my dear kids have enough water and nutrition.");
    
        gdpa.touch(grdb);
        gdpa.touch(grdc);

        gdpa.talk("To get my dear kids grow up quickly!");

        grda.talk(grda.name+": Gramdpa!");
        grdb.talk(grdb.name+": Gramdpa!");
        grdc.talk(grdc.name+": Gramdpa!");
        grdd.talk(grdd.name+": Gramdpa!");
        grde.talk(grde.name+": Gramdpa!");
        grdf.talk(grdf.name+": Gramdpa!");
        grdg.talk(grdg.name+": Gramdpa!");

        gdpa.hug(grdc);

        vine.close();
        rainbow.close();
    }
    public static void main(String[] args)
    {
        new Scene().play();
    } 
}
