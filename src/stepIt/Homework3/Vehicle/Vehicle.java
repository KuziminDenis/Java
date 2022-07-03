package stepIt.Homework3.Vehicle;

public class Vehicle {

    String name;
    private int passengers;
    private int fuelcap;
    private int mpg;

    private int cargocap;

    public Vehicle(String name,int passengers, int fuelcap, int mpg){
        this.name = name;
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    void range(){
        System.out.println("Maximum distance with full fuelcap is " + fuelcap * mpg + " miles");
    }

    int rangeInt(){
        return mpg * fuelcap;
    }

    double fuelNeeded(int distance){
        return (double) distance / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", passengers=" + passengers +
                ", fuelcap=" + fuelcap +
                ", mpg=" + mpg +
                ", cargocap=" + cargocap +
                '}';
    }
}
