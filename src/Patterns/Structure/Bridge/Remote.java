package Patterns.Structure.Bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void On() {

        device.enable();

    }

    public void Off() {

        device.disable();

    }

    public void volumeDown() {

        device.setVolume(2);

    }

    public void volumeUp() {

        device.setVolume(3);

    }

    public void channelRight() {

        device.setChannel(5);

    }

    public void channelBack() {

        device.setChannel(4);

    }


}
