package Patterns.Structure.Decorator;

public class BaseDecorator implements Component {

    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public int sum(int a) {
        return wrappee.sum(a);
    }
}
