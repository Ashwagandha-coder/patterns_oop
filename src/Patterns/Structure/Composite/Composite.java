package Patterns.Structure.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Box {

    private List<Box> list = new ArrayList<>();


    public void addElem(Box box) {

        list.add(box);

    }

    public void removeElem(Box box) {

        list.remove(box);

    }


    @Override
    public void sum() {

        for (Box box : list) {

            box.sum();

        }

    }
}
