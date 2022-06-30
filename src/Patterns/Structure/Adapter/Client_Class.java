package Patterns.Structure.Adapter;

public class Client_Class {


    public static void main(String[] args) {

        String str = "123";

        Adapter adapter = new Adapter();

        Service service = new Service(adapter.map(str));

        System.out.println(service.getCHISLO());


    }
}
