package Patterns.Structure.Bridge;


public class Client {


    public static void main(String[] args) {

        Device radio = new Radio();

        Remote remote = new Remote(radio);

        remote.On();
        remote.channelRight();
        remote.volumeUp();
        remote.Off();

    }

}
