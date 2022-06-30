package Patterns.Structure.Bridge;

public class Tv implements Device {

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

    }

    @Override
    public void disable() {

    }
}
