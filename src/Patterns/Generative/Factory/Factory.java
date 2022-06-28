package Patterns.Generative.Factory;

public abstract class Factory {

    public abstract Product createProduct();

    public static Factory init(String parametr) {

        if (parametr == "Car")
            return new RoadLogistic();
        if (parametr == "Tank")
            return new AirLogistic();
        if (parametr == "Container")
            return new SeaLogistic();
        else
            return null;

    }


}
