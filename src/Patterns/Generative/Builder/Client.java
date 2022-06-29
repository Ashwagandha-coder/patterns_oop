package Patterns.Generative.Builder;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        BuilderRock builderRock = new BuilderRock();

        director.makeHouse(builderRock);

        HouseRock houseRock = builderRock.getResult();

        System.out.println(houseRock);

    }

}
