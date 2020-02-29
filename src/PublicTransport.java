public class PublicTransport extends AutomobileTransport {

    public Integer quantityOfSeats;

//    public PublicTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine, int quantityOfWheels) {
//        super(name, weight, color, quantityOfCylindresInEngine, quantityOfWheels);
//    }


    public Integer getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public void setQuantityOfSeats(Integer quantityOfSeats) {
        this.quantityOfSeats = quantityOfSeats;
    }

    public PublicTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine, int quantityOfWheels, Integer quantityOfSeats) {
        super(name, weight, color, quantityOfCylindresInEngine, quantityOfWheels);
        this.quantityOfSeats = quantityOfSeats;
    }

    @Override
    void forAuto(double weight) {
        if (getQuantityOfSeats()>=8) System.out.print("это автобус");
        else System.out.print("это маршрутка");
        if (weight>7000) System.out.print(" и тут много людей");
        else System.out.print(" и тут мало людей");
    }
}
