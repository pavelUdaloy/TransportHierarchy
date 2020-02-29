abstract public class AirTransport extends  Transport {
    public AirTransport(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void strNamePlusColor() {
        System.out.println(getColor() + " " + getName() + " moves by air");
    }
    abstract String forAir();
}
