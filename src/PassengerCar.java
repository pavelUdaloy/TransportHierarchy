abstract public class PassengerCar extends AutomobileTransport {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PassengerCar(String name, double weight, String color, Integer quantityOfCylindresInEngine, int quantityOfWheels, String type) {
        super(name, weight, color, quantityOfCylindresInEngine, quantityOfWheels);
        this.type = type;
    }

    @Override
    void forAuto(double weight) {
        if (weight>2000) System.out.print("это джип");
        else System.out.print("это легковая");
        if (getQuantityOfCylindresInEngine()>4) System.out.print(" с мощным движком");
        else System.out.print(" со средним по мощности движком");
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "type='" + type + '\'' +
                ", quantityOfWheels=" + quantityOfWheels +
                '}';
    }
}
