package Patterns.Structure.LightWeight;

public class Context {

    private String name;
    private int age;

    private LightWeight lightWeight;

    public Context(String name, int age, LightWeight lightWeight) {
        this.name = name;
        this.age = age;
        this.lightWeight = lightWeight;
    }

    public void giveDocument(String name, int age, LightWeight lightWeight) {

        lightWeight.giveDocument(lightWeight.getId(), lightWeight.getSex(), lightWeight.getHight(), age, name);

    }

}
