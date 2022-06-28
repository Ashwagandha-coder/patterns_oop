package Patterns.Generative.Factory;

public class AirLogistic extends Factory {


    @Override
    public Product createProduct() {
        return new Plain();
    }
}
