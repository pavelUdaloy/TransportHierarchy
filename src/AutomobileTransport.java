abstract public class AutomobileTransport extends GroundTransport{
    public AutomobileTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine, int quantityOfWheels) {
        super(name, weight, color, quantityOfCylindresInEngine);
        this.quantityOfWheels = quantityOfWheels;
    }

    public int quantityOfWheels;

    public int getQuantityOfWheels() {
        return quantityOfWheels;
    }

    public void setQuantityOfWheels(int quantityOfWheels) {
        this.quantityOfWheels = quantityOfWheels;
    }

    @Override
    String forGround() {
        return "(может только по обыч.дороге) ";
    }

    abstract void forAuto(double weight);
}
