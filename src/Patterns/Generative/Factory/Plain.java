package Patterns.Generative.Factory;

public class Plain implements Product {

    @Override
    public void delivery(Object object) {

        System.out.println("Delivery Air" + object.toString());

    }
}
