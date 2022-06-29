package Patterns.Structure.LightWeight;

public class Client {


    public static void main(String[] args) {

        LightWeight lightWeight = new LightWeight("Man",183,222);

        Context context = new Context("Alex",16,lightWeight);

        context.giveDocument("Alex",16,lightWeight);


    }
}
