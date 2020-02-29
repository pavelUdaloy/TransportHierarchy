public class Plane extends AirTransport {
//    public Plane(String name, double weight, String color) {
//        super(name, weight, color);
//    }
    private Integer quantityOfCylindresInEngine;

    public Integer getQuantityOfCylindresInEngine() {
        return quantityOfCylindresInEngine;
    }

    public void setQuantityOfCylindresInEngine(Integer quantityOfCylindresInEngine) {
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
    }

    public boolean isWeaponsOnTheBoard_question;

    public boolean getisWeaponsOnTheBoard_question() {
        return isWeaponsOnTheBoard_question;
    }

    public void setWeaponsOnTheBoard_question(boolean weaponsOnTheBoard_question) {
        isWeaponsOnTheBoard_question = weaponsOnTheBoard_question;
    }

    public Plane(String name, double weight, String color, Integer quantityOfCylindresInEngine, boolean isWeaponsOnTheBoard_question) {
        super(name, weight, color);
        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
        this.isWeaponsOnTheBoard_question = isWeaponsOnTheBoard_question;
    }

    //    public Plane(String name, double weight, String color, Integer quantityOfCylindresInEngine) {
//        super(name, weight, color);
//        this.quantityOfCylindresInEngine = quantityOfCylindresInEngine;
//    }

    @Override
    String forAir() {
        return "(может вообще на любой высоте) ";
    }

    public void forPlane(){
        if (getisWeaponsOnTheBoard_question()) System.out.print(" это боевой самолёт");
        else System.out.print(" это гражданский самолёт");
        if (getQuantityOfCylindresInEngine()>4)System.out.print(" с крутым движком");
        else System.out.print(" с не очень крутым движком");
    };
}
