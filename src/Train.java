public class Train extends RailwayTransport {
    public Train(String name, double weight, String color, Integer quantityOfEngines, boolean workInCity_question) {
        super(name, weight, color,quantityOfEngines, workInCity_question);
    }

    @Override
    void forRailways(boolean workInCity_question) {
        if (workInCity_question) System.out.print(" это метро");
        else System.out.print(" это междугородный поезд");
        if (getQuantityOfCylindresInEngine()==1)System.out.print(" с " + getQuantityOfCylindresInEngine() + " движком");
        else System.out.print(" с " + getQuantityOfCylindresInEngine() + " движками");
    }
}
