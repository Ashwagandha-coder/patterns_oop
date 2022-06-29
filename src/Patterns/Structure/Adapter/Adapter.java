package Patterns.Structure.Adapter;

public class Adapter implements Client {
    @Override
    public int map(String str) {

        return Integer.parseInt(str);

    }
}
