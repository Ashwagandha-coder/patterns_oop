package Patterns.Generative.Prototype;

import java.util.ArrayList;
import java.util.List;

public class RegistryPrototype {

    private List<Prototype> list = new ArrayList<>();

    public void addItem(Prototype prototype) {

        list.add(prototype);

    }

    public Prototype getItem(int index) {

        return list.get(index);

    }
}
