package Patterns.Generative.Builder;

public class Director {

    public void makeHouse(Builder builder) {

        builder.setFundamental();
        builder.setWall();
        builder.setRoof();
        builder.setDoor();
        builder.setWindow();
        builder.reset();


    }

}
