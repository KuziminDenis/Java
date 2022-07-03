package stepIt.Homework3.Vehicle;

public class Truck extends Vehicle{

    private int cargocap;

    Truck(String name,int passengers, int fuelcap, int mpg, int cargocap){
        super(name,passengers,fuelcap,mpg);
        this.cargocap = cargocap;
    }
    Truck(String name,int passengers, int fuelcap, int mpg){
        super(name,passengers,fuelcap,mpg);

    }


    int getCargo(){
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }


}
