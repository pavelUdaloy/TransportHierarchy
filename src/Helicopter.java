public class Helicopter extends AirTransport {
    private Integer quantityOfCylindresInEngine;

    public Integer getQuantityOfCylindresInEngine() {
        return quantityOfCylindresInEngine;
    }

    public void setQuantityOfCylindresInEngine(Integer quantityOfCylindresInEngine) {
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    public Helicopter(String name, double weight, String color, Integer quantityOfCylindresInEngine) {
        super(name, weight, color);
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    @Override
    String forAir() {
        return "(может только на низкой высоте) ";
    }

    public void forHelicopter(){
        if (getQuantityOfCylindresInEngine()>7) System.out.print(", но двигатель сильный и перемещаться будет быстро");
        else System.out.print(", да и, к тому же, двигатель слабый, поэтому перемещаться будет медленно");
    };
}
