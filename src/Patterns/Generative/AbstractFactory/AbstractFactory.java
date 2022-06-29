package Patterns.Generative.AbstractFactory;

public abstract class AbstractFactory {

    public abstract Chair createChair();
    public abstract Table createTable();
    public abstract Sofa createSofa();


    public static AbstractFactory initChair(String sofa, String table) {

        if (sofa == "Modern" && table == "Modern")
            return new ModernFactory();
        else if (sofa == "Victorian" && table == "Victorian")
            return new VictorianFactory();
        else
            return new ClassicFactory();


    }
    public static AbstractFactory initTable(String chair, String sofa) {

        if (sofa == "Modern" && chair == "Modern")
            return new ModernFactory();
        else if (sofa == "Victorian" && chair == "Victorian")
            return new VictorianFactory();
        else
            return new ClassicFactory();

    }
    public static AbstractFactory initSofa(String table, String chair) {


        if (table == "Modern" && chair == "Modern")
            return new ModernFactory();
        else if (table == "Victorian" && chair == "Victorian")
            return new VictorianFactory();
        else
            return new ClassicFactory();


    }


}
