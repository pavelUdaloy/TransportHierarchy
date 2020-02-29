public class Truck extends AutomobileTransport {
    public Truck(Integer quantityOfCylindresInEngine, String name, double weight, String color, int quantityOfWheels) {
        super(name, weight, color, quantityOfCylindresInEngine, quantityOfWheels);
    }

    @Override
    void forAuto(double weight) {
        if (weight>9000) System.out.print("это фура");
        else System.out.print("это грузовик");
        if (getQuantityOfCylindresInEngine()>6) System.out.print(" с мощным движком");
        else System.out.print(" со средним по мощности движком");
    }
}
