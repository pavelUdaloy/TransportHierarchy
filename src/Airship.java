public class Airship extends AirTransport {
//    public Airship(String name, double weight, String color) {
//        super(name, weight, color);
//    }
    public String powerOfBurner;

    public String getPowerOfBurner() {
        return powerOfBurner;
    }

    public void setPowerOfBurner(String powerOfBurner) {
        this.powerOfBurner = powerOfBurner;
    }

    public Airship(String name, double weight, String color, String powerOfBurner) {
        super(name, weight, color);
        this.powerOfBurner = powerOfBurner;
    }

    @Override
    String forAir() {
        return "(может вообще на любой высоте, кроме \"под космосом\") ";
    }
    public void forAirship(){
        if (getPowerOfBurner()=="high") System.out.print(", да и, к тому же, двигатель сильный и менять высоту будет быстро");
        else System.out.print(", жаль, двигатель слабый, и менять высоту этот дирижабль будет медленно");
    };
}
