package stepIt.Homework5.Transport;

public class Vehicle {

    String name;
    private int passengers;
    private int fuelcap;
    private int mpg;

    private int cargocap;

    public Vehicle(String name, int passengers, int fuelcap, int mpg){
        this.name = name;
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }


    public Vehicle(String name) {
        this.name = name;
    }
    public Vehicle() {

    }

    public void range(){
        System.out.println("Maximum distance with full fuelcap is " + fuelcap * mpg + " miles");
    }

    public int rangeInt(){
        return mpg * fuelcap;
    }

    public String getName() {
        return name;
    }

    public double fuelNeeded(int distance){
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPassengers(int passengers) {
            this.passengers = passengers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
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
