package Patterns.Generative.Factory;

public class Client {

    public static void main(String[] args) {

        Factory factory = Factory.init("Car");
        Product product = factory.createProduct();

        product.delivery(new TestObject());


    }


}
