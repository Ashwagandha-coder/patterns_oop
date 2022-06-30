package Patterns.Structure.Bridge;

public class Radio implements Device {

    private int volume;
    private int channel;

    @Override
    public void setVolume(int volume) {

        this.volume += volume;

    }

    @Override
    public void setChannel(int channel) {

        this.channel += channel;

    }

    @Override
    public void enable() {

        System.out.println("Radio on");

    }

    @Override
    public void disable() {

        System.out.println("Radio off");

    }
}
