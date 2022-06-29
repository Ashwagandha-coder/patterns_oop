package Patterns.Generative.Prototype;

public class Button implements Prototype {

    private int id;
    private String color;

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    private int size;


    public Button(int id, String color, int size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    @Override
    public Prototype clone() { return new Button(id, color, size); }
}
