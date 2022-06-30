package Patterns.Structure.Decorator;

public class Client {

    public static void main(String[] args) {

        Component component = new ConcComponent();
        BaseDecorator baseDecorator = new ConcDecorator(component);
        System.out.println(baseDecorator.sum(0));

    }

}
