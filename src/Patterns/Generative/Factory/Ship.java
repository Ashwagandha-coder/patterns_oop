package Patterns.Generative.Factory;

public class Ship implements Product {

    @Override
    public void delivery(Object object) {

        System.out.println("Delivery Sea" + object.toString());

    }
}
