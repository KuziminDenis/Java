package stepIt.Homework3.Vehicle;

public class TruckAndVehicleDemo {
    public static void main(String[] args) {

        Truck man = new Truck("Man",3,50, 21, 40);

        System.out.println(man);
        System.out.println("Man can take " + man.getPassengers() + " passengers");
        man.range();
        int howManyMilesManCanGo = man.rangeInt();
        System.out.println(howManyMilesManCanGo + " miles can go Man");
        int rangeNeeded = 1400;
        double gallons2 = man.fuelNeeded(rangeNeeded);
        System.out.println("Man needs " + gallons2 + " gallons to go for the distance of " + rangeNeeded + " miles");
        man.setCargocap(50);
        System.out.println("Man cargocap is: " + man.getCargo() + "\n");



        Truck scania = new Truck("Scania",4, 55, 15);

        System.out.println(scania);
        System.out.println("Scania can take " + scania.getPassengers() + " passengers");
        scania.range();
        int howManyMilesScaniaCanGo = scania.rangeInt();
        System.out.println(howManyMilesScaniaCanGo + " miles can go Scania");
        double gallons = scania.fuelNeeded(500);
        System.out.println("Scania needs " + gallons + " gallons to go for the distance of 500 miles");
        scania.setCargocap(45);
        System.out.println("Scania cargocap is: " + scania.getCargo());

        //int rangeMan = man.fuelcap * man.mpg;
        //int rangeScania = scania.fuelcap * scania.mpg;


        System.out.println("\n********************************************************************************\n");



        Vehicle mercedes = new Vehicle("mers",5,16, 21);

        System.out.println(mercedes);
        System.out.println("Mercedes can take " + mercedes.getPassengers() + " passengers");
        mercedes.range();
        int howManyMilesMersCanGo = mercedes.rangeInt();
        System.out.println(howManyMilesMersCanGo + " miles can go Mercedes");
        int rangeNeeded2 = 1400;
        double gallonsMers = mercedes.fuelNeeded(rangeNeeded);
        System.out.println("mercedes needs " + gallonsMers + " gallons to go for the distance of " + rangeNeeded2 + " miles\n");

        Vehicle jeep = new Vehicle("jeep",7, 25, 15);

        System.out.println(jeep);
        System.out.println("Jeep can take " + jeep.getPassengers() + " passengers");
        jeep.range();
        int howManyMilesJeepCanGo = jeep.rangeInt();
        System.out.println(howManyMilesJeepCanGo + " miles can go Jeep");
        double gallonsJeep = jeep.fuelNeeded(500);
        System.out.println("jeep needs " + gallonsJeep + " gallons to go for the distance of 500 miles");

        //int range1 = mercedes.getFuelcap() * mercedes.getMpg();
        //int range2 = jeep.getFuelcap() * jeep.getMpg();




    }
}
