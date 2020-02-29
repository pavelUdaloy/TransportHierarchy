public class Motorship extends WaterTransport{
//    public Motorship(String name, double weight, String color) {
//        super(name, weight, color);
//    }
    private Integer quantityOfCylindresInEngine;

    public Integer getQuantityOfCylindresInEngine() {
        return quantityOfCylindresInEngine;
    }

    public void setQuantityOfCylindresInEngine(Integer quantityOfCylindresInEngine) {
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    public Motorship(String name, double weight, String color, Integer quantityOfCylindresInEngine) {
        super(name, weight, color);
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }
    @Override
    String forWater() {
        return "может и по морям, и по океанам";
    }
    public void forMotorship(){
        if (getQuantityOfCylindresInEngine()>10) System.out.print(", жаль, двигатель слабый");
        else System.out.print(", и, к тому же, двигатель сильный");
    };
}
