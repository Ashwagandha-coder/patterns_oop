package Patterns.Generative.AbstractFactory;

public class Client {


    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactory.initChair("Modern","Modern");
        Chair chair = abstractFactory.createChair();

        chair.seed();

    }
}
