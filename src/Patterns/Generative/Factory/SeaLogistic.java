package Patterns.Generative.Factory;

public class SeaLogistic extends Factory {


    @Override
    public Product createProduct() {
        return new Ship();
    }
}
