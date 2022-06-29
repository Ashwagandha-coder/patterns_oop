package Patterns.Generative.Prototype;

public class Client {


    public static void main(String[] args) {

        Button button = new Button(1,"Red",23);

        Button button2 = (Button) button.clone();

        RegistryPrototype registryPrototype = new RegistryPrototype();

        registryPrototype.addItem(button2);

        Button button3 = (Button) registryPrototype.getItem(0).clone();

        System.out.println(button3.getColor());

    }
}
