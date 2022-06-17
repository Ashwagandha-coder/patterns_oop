package Patterns.Behavior.Singleton;

public class Start {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.getId());
    }
}