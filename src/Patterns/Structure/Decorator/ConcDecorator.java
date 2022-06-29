package Patterns.Structure.Decorator;

public class ConcDecorator extends BaseDecorator {


    public ConcDecorator(Component wrappee) {
        super(wrappee);
    }

    @Override
    public int sum(int a) {
        return super.sum(a + 1);
    }
}
