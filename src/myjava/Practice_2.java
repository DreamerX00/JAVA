package myjava;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class smartPhone extends TelePhone{
    void ring(){
        System.out.println("Phone is Ringing");
    }
    void lift(){
        System.out.println("Picked-Up The Phone");
    }
    void disconnect(){
        System.out.println("Call Ended");
    }
    void scanNetwork(){
        System.out.println("Scanning for Networks.....");
    }
    void wifiList(){
        System.out.println("""
                List of Available Networks are...
                1. Chandan_5g
                2. pandit_2.4g
                3. Gamer Brother 5g
                """);
    }
}
public class Practice_2{
    public static void main(String[] args) {
        TelePhone tp = new smartPhone();
        tp.ring();
        tp.lift();
        tp.disconnect();
        smartPhone sm = new smartPhone();
        sm.scanNetwork();
        sm.wifiList();
    }
}
