public class Main {
    public static void main(String[] args) {

        //water transport

        Boat boat=new Boat("boat", 40, "brown", true);
        boat.strNamePlusColor();
        System.out.print(boat.forWater());
        boat.forBoat();
        System.out.println();
        System.out.println();

        Motorship motorship= new Motorship("motorship", 10_000, "white", 10);
        motorship.strNamePlusColor();
        System.out.print(motorship.forWater());
        motorship.forMotorship();
        System.out.println();
        System.out.println();

        Sailboat sailboat=new Sailboat("sailboat", 1000, "brown", 4, true);
        sailboat.strNamePlusColor();
        System.out.print(sailboat.forWater());
        sailboat.forSailboat();
        System.out.println();
        System.out.println();

        //air transport

        Plane plane=new Plane("plane", 10000, "black", 5, true);
        plane.strNamePlusColor();
        System.out.print(plane.forAir());
        plane.forPlane();
        System.out.println();
        System.out.println();

        Helicopter helicopter=new Helicopter("helicopter", 7000, "gray", 8);
        helicopter.strNamePlusColor();
        System.out.print(helicopter.forAir());
        helicopter.forHelicopter();
        System.out.println();
        System.out.println();

        Airship airship=new Airship("airship", 5000, "multicolor", "high");
        airship.strNamePlusColor();
        System.out.print(airship.forAir());
        airship.forAirship();
        System.out.println();
        System.out.println();

        //ground transport

        Train train= new Train("train", 1_000_000, "blue", 2,true);
        train.strNamePlusColor();
        System.out.print(train.forGround());
        train.forRailways(true);
        System.out.println();
        System.out.println();

//        PassengerCar passengerCar=new PassengerCar("passenger car", 4000, "red", 6, 6);
//        passengerCar.strNamePlusColor();
//        System.out.print(passengerCar.forGround());
//        passengerCar.forAuto(passengerCar.getWeight());
//        System.out.println();
//        System.out.println();

        PublicTransport publicTransport= new PublicTransport("public transport", 7000, "yellow", 6,8,30);
        publicTransport.strNamePlusColor();
        System.out.print(publicTransport.forGround());
        publicTransport.forAuto(publicTransport.getWeight());
        System.out.println();
        System.out.println();

        Truck truck=new Truck(8,"truck", 10_000.53, "gray", 12);
        truck.strNamePlusColor();
        System.out.print(truck.forGround());
        truck.forAuto(truck.getWeight());
        System.out.println();
        System.out.println();

        Bmw bmw = new Bmw("bmw", 3000, "black", 6, 4, "passenger", "x5");
        System.out.println(bmw);
    }
}
