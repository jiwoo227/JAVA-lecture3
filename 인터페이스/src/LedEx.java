public class LedEx {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeChannel(1);
        tv.chanVolume(2);
        tv.turnOff();
    }
}
