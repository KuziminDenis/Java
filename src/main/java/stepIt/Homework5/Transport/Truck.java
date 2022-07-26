package stepIt.Homework5.Transport;

public class Truck extends Vehicle {

    private int cargocap;

    public Truck(String name, int passengers, int fuelcap, int mpg, int cargocap){
        super(name,passengers,fuelcap,mpg);
        this.cargocap = cargocap;
    }

    public Truck(String name, int passengers, int fuelcap, int mpg){
        super(name,passengers,fuelcap,mpg);

    }

    public Truck(int cargocap){
        this.cargocap = cargocap;
    }

    public Truck(){

    }

    public Truck(String name){
        super(name);
    }

    public int getCargocap(){
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        if(cargocap > 2000 || cargocap < 1){
            System.out.println("Cargocap cant be more 2000 && less 1");
            cargocap = 2000;
        }
        this.cargocap = cargocap;
    }


}
