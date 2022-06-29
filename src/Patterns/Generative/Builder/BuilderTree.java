package Patterns.Generative.Builder;

public class BuilderTree implements Builder {

    private HouseTree houseTree;

    @Override
    public void reset() {
        houseTree = new HouseTree();
    }

    @Override
    public void setWall() {

        houseTree.setWall("Tree Wall");

        System.out.println("Set Tree Wall");

    }

    @Override
    public void setRoof() {

        houseTree.setRoof("Tree Roof");

        System.out.println("Set Roof");

    }

    @Override
    public void setFundamental() {

        houseTree.setFundamental(1);

        System.out.println("Set Fundamental");

    }

    @Override
    public void setDoor() {

        houseTree.setDoor("Tree Door");

        System.out.println("Set Door");

    }

    @Override
    public void setWindow() {

        houseTree.setWindow("Tree Window");

        System.out.println("Set Window");


    }

    public HouseTree getResult() { return houseTree; }
}
