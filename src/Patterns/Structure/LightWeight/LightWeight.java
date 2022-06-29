package Patterns.Structure.LightWeight;

public class LightWeight {

    private String sex;
    private int hight;
    private int id;

    public LightWeight(String sex, int hight, int id) {
        this.sex = sex;
        this.hight = hight;
        this.id = id;
    }

    public void giveDocument(int id, String sex, int hight, int age, String name) {


        System.out.println("Human" + id + " "  + sex + " " + hight + " " + age + " " + name);

    }

    public String getSex() {
        return sex;
    }

    public int getHight() {
        return hight;
    }

    public int getId() {
        return id;
    }
}
