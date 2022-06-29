package Patterns.Behavior.Chain_Responsibility;

public class SmsLogger implements Logger {

    private Logger next;

    @Override
    public void writeMessage(String message) {

        if (message == "Opa")
            System.out.println("Opa");
        else
            next.writeMessage(message);


    }

    public void setNext(Logger next) {
        this.next = next;
    }
}
