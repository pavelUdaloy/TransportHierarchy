public class Boat extends WaterTransport{
//    public Boat(String name, double weight, String color) {
//        super(name, weight, color);
//    }
    private boolean isOars_question;

    public boolean getisOars_question() {
        return isOars_question;
    }

    public void setquantityOfSails(boolean isOars_question) {
        this.isOars_question = isOars_question;
    }

    public Boat(String name, double weight, String color, boolean isOars_question) {
        super(name, weight, color);
        this.isOars_question = isOars_question;
    }
    @Override
    String forWater() {
        return "может и по рекам, и по морям, и по океанам";
    }
    public void forBoat(){
        if (!getisOars_question()) System.out.print("; но будет стоять на месте");
        else System.out.print("; и, кстати, вёсла есть, так что, как говорится, лодка ОГРЕБАЕТ)))))");
    };
}
