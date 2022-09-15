public class LedTV implements TV{

    @Override
    public void turnOn(){
        System.out.println("킴");
    }

    @Override
    public void turnOff(){
        System.out.println("끔");
    }

    @Override
    public void chanVolume(int volume) {
        System.out.println("볼륨조절");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널 키기");
    }
}
