package Patterns.Behavior.Chain_Responsibility;

public class Client {

    public static void main(String[] args) {

        SmsLogger smsLogger = new SmsLogger();

        smsLogger.setNext(new OtherLogger());

        smsLogger.writeMessage("Dopa");

    }

}
