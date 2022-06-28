package Patterns.Generative.Factory;

public class Car implements Product {

    @Override
    public void delivery(Object object) {

        System.out.println("Delivery road" + object.toString());

    }
}
