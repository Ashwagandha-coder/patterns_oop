package Patterns.Generative.Factory;

public class RoadLogistic extends Factory {



    @Override
    public Product createProduct() {
        return new Car();
    }
}
