abstract public class WaterTransport extends  Transport{
    public WaterTransport(String name, double weight, String color) {
        super(name, weight, color);
    }
    @Override
    public void strNamePlusColor() {
        System.out.println(getColor() + " " +  getName() + " moves by water");
    }
    abstract String forWater();
}
