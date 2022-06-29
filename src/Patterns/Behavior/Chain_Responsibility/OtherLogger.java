package Patterns.Behavior.Chain_Responsibility;

public class OtherLogger implements Logger {

    private Logger next;
    @Override
    public void writeMessage(String message) {

        if (message == "Dopa")
            System.out.println("Dopa");
        else
            next.writeMessage(message);


    }
}
