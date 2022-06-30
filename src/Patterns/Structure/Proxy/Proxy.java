package Patterns.Structure.Proxy;

public class Proxy implements AbstractInterface {

    private Director director = new Director();


    @Override
    public void doSome() {

        director.doSome();
    }

    public void check(int id) throws Exception {

        if (id > 0) {

            doSome();

        }

        else
            throw new Exception("Error");


    }
}
