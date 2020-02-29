abstract public class GroundTransport extends  Transport {
    private Integer quantityOfCylindresInEngine;

    public Integer getQuantityOfCylindresInEngine() {
        return quantityOfCylindresInEngine;
    }

    public void setQuantityOfCylindresInEngine(Integer quantityOfCylindresInEngine) {
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    public GroundTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine) {
        super(name, weight, color);
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    @Override
    public void strNamePlusColor() {
        System.out.println(getColor() + " " + getName() + " moves by land");
    }

    abstract String forGround();
}
