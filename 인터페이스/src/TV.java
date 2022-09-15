public interface TV {
    public int MIN_VALUME = 0;
    public int MAX_VALUME = 100;

    public void turnOn();
    public void turnOff();
    public void chanVolume(int volume);
    public void changeChannel(int channel);
}
