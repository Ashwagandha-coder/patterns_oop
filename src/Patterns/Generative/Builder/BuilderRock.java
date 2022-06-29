package Patterns.Generative.Builder;

public class BuilderRock implements Builder {

    private HouseRock houseRock;

    @Override
    public void reset() {

        houseRock = new HouseRock();

    }

    @Override
    public void setWall() {

        //houseRock.setWall("Rock");

        System.out.println("Set Rock Wall");

    }

    @Override
    public void setRoof() {

       // houseRock.setRoof("Rock Roof");

        System.out.println("Set Roof");

    }

    @Override
    public void setFundamental() {

       // houseRock.setFundamental(1);

        System.out.println("Set Foundamental");

    }

    @Override
    public void setDoor() {

        //houseRock.setDoor("Rock door");

        System.out.println("Set Door");

    }

    @Override
    public void setWindow() {

        //houseRock.setWindow("Rock window");

        System.out.println("Set Rock Window");

    }

    public HouseRock getResult() { return houseRock; }
}
