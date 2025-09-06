package Practicals;

public class p5_inheritance {
    public static void main(String[] args) {
        samsung s = new samsung();
        samsingh si = new samsingh();
        Xiaomi x = new Xiaomi();
        Google g = new Google();
        s.feature();
        si.feature();
        x.requirements();
        g.requirements();
    }
}
class SmartPhones{
    int camera = 300;
    int battery = 5000;
    int refresh_rate = 144;
}
class samsung extends SmartPhones{
    String Brand = "Samsung";
    String Source = "Korea";
    void feature(){
        System.out.println("Camera of our phone is : "+camera+" megapixels");
        System.out.println("Battery of our phone is : "+battery+" mah" );
    }
}
class samsingh extends samsung{
    void feature(){
        System.out.println("Camera of our phone is : "+camera+" megapixels and better than "+Brand);
        System.out.println("Refresh rate of our phone is "+refresh_rate+" and the source is "+Source);
    }
}
class Xiaomi extends SmartPhones{
    void requirements(){
        System.out.println("Our phone have "+camera+" mpx camera and "+battery+" mah of battery and also "+refresh_rate+" Refresh rate ");
    }
}
class Google extends SmartPhones{
    void requirements(){
        camera = 2000;
        battery = 50000;
        refresh_rate = 300;

        System.out.println("our phone has "+camera+" mpx camera and "+battery+" mah of battery and also "+refresh_rate+" Refresh rate");
    }
}

