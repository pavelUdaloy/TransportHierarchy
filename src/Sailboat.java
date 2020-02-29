public class Sailboat extends WaterTransport {
//    public Sailboat(String name, double weight, String color) {
//        super(name, weight, color);
//    }
    private Integer quantityOfMastsWithSails;

    public Integer getquantityOfMastsWithSails() {
        return quantityOfMastsWithSails;
    }

    public void setquantityOfMastsWithSails(Integer quantityOfMastsWithSails) {
        this.quantityOfMastsWithSails = quantityOfMastsWithSails;
    }

    private boolean isOars_question;

    public boolean getisOars_question() {
        return isOars_question;
    }

    public void setquantityOfSails(boolean isOars_question) {
        this.isOars_question = isOars_question;
    }

    public Sailboat(String name, double weight, String color, Integer quantityOfMastsWithSails, boolean isOars_question) {
        super(name, weight, color);
        this.quantityOfMastsWithSails = quantityOfMastsWithSails;
        this.isOars_question = isOars_question;
    }

    @Override
    String forWater() {
        return "может только по океанам";
    }
    public void forSailboat(){
        if (!getisOars_question()){
            if (getquantityOfMastsWithSails()>3) System.out.print(" и будет плыть нормально");
            else System.out.print(", но будет плыть очень медленно");
        }
        else {
            if (getquantityOfMastsWithSails()>3) System.out.print(", и будет плыть как чорт");
            else System.out.print(" и будет плыть нормально");
        }

    };
}
