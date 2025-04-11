class  MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    private int preChannel ;
    private int preChannel1 ;


    boolean getPowerOn() { return isPowerOn; }
    boolean setPowerOn() {
        return isPowerOn = !isPowerOn;
    }

    public int getChannel() { return channel; }
    public int setChannel(int channel) {

        preChannel = this.channel;
        return this.channel = channel;
    }

    int getVolume() { return volume; }
    int setVolume(int volume) {
        return this.volume = volume;
    }

    void gotoPrevChannel() {
        setChannel(preChannel);
    }
}
public class E7_10 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

    }
}
