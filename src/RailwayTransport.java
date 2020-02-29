abstract public class RailwayTransport extends  GroundTransport{

    public boolean workInCity_question;

    public RailwayTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine) {
        super(name, weight, color, quantityOfCylindresInEngine);
    }

    public boolean isWorkInCity_question() {
        return workInCity_question;
    }

    public void setWorkInCity_question(boolean workInCity_question) {
        this.workInCity_question = workInCity_question;
    }

    public RailwayTransport(String name, double weight, String color, Integer quantityOfCylindresInEngine, boolean workInCity_question) {
        super(name, weight, color, quantityOfCylindresInEngine);
        this.workInCity_question = workInCity_question;
    }

    @Override
    String forGround() {
        return "(может только по жел.дороге)";
    }

    abstract void forRailways(boolean workInCity_question);
}

