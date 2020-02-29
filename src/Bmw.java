public class Bmw extends PassengerCar {
    public String series;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Bmw(String name, double weight, String color, Integer quantityOfCylindresInEngine, int quantityOfWheels, String type, String series) {
        super(name, weight, color, quantityOfCylindresInEngine, quantityOfWheels, type);
        this.series = series;
    }

//    @Override
//    public String toString() {
//        return "Bmw{" +
//                "series='" + series + '\'' +
//                ", type='" + type + '\'' +
//                ", quantityOfWheels=" + quantityOfWheels +
//                '}';
//    }
}
