package Homework5;

import org.junit.Test;
import stepIt.Homework5.Transport.Truck;
import stepIt.Homework5.Transport.Vehicle;

import static org.junit.Assert.assertEquals;

public class TransportTest {


    Truck man = new Truck("Man",3,50, 21, 40);

    @Test
    public void getCargoCapTypeInt(){
        assertEquals("The entered value type int = 40", 40, man.getCargocap());
    }

    @Test
    public void setCargoCapTypeIntMax(){
        man.setCargocap(2_147_483_647);
        assertEquals("The entered value type int = 2 147 483 647", 2_147_483_647, man.getCargocap());
    }
    @Test
    public void setCargoCapTypeIntMax2(){
        man.setCargocap(-2_147_483_648);
        assertEquals("The entered value type int = -2 147 483 648", -2_147_483_648, man.getCargocap());
    }

    @Test
    public void setCargoCapTypeInt(){
        man.setCargocap(50);
        assertEquals("The entered value type int = 50", 50, man.getCargocap());
    }

    @Test
    public void getMpgInt(){
        assertEquals("The entered value type int = 21", 21, man.getMpg());
    }
    @Test
    public void setMpgInt(){
        man.setMpg(30);
        assertEquals("The entered value type int = 30", 30, man.getMpg());
    }


    @Test
    public void getFuelcapInt(){
        assertEquals("The entered value type int = 50", 50, man.getFuelcap());
    }
    @Test
    public void setFuelcapInt(){
        man.setFuelcap(60);
        assertEquals("The entered value type int = 60", 60, man.getFuelcap());
    }

    @Test
    public void getPassengersInt(){
        assertEquals("The entered value type int = 3", 3, man.getPassengers());
    }
    @Test
    public void setPassengersInt(){
        man.setPassengers(5);
        assertEquals("The entered value type int = 5", 5, man.getPassengers());
    }

    @Test
    public void getNameString(){
        assertEquals("The entered value type String = Man", "Man", man.getName());
    }
    @Test
    public void setNameString(){
        man.setName("ManVL");
        assertEquals("The entered value type String = ManVL", "ManVL", man.getName());
    }


    @Test
    public void multiplicationFromMethodRangeIntTypeInt(){
        assertEquals("The entered value type int. fuelcap(50) * mpg(21) = 1050", 1050, man.rangeInt());
    }
    /*@Test
    public void multiplicationFromMethodRangeTypeInt(){
        //assertEquals("The entered value type int. fuelcap(50) * mpg(21) = 1050", 1050, man.range());
        verify(man, times(1));
    }*/

    @Test
    public void divisionFromMethodFuelNeededTypeDouble(){
        assertEquals("The entered value type int. distance(500) / mpg(21) = 1050",  23.809, man.fuelNeeded(500), 0.02);
    }

    @Test
    public void getNotEmptyTruck(){
        Truck volvo = new Truck("Volvo",3,50, 21, 40);
        assertEquals("Constructor truck(volvo) not empty",  volvo, volvo);
    }
    @Test
    public void getEmptyTruck(){
        Truck volvo = new Truck();
        assertEquals("Constructor truck(volvo)",  volvo, volvo);
    }
    @Test
    public void getTruckWithName(){
        Truck volvo = new Truck("Volvo");
        assertEquals("Constructor truck(volvo)",  volvo, volvo);
    }

    @Test
    public void setCargoCapTypeIntBoundaryValue2(){
        man.setCargocap(2000);
        assertEquals("The entered value type int = 2000", 2000, man.getCargocap());
    }

    @Test
    public void setCargoCapTypeIntBoundaryValue3(){
        man.setCargocap(2001);
        assertEquals("The entered value type int = 2001", 2001, man.getCargocap());
    }
    @Test
    public void setCargoCapTypeIntBoundaryValue4(){
        man.setCargocap(1);
        assertEquals("The entered value type int = 1", 1, man.getCargocap());
    }
    @Test
    public void setCargoCapTypeIntBoundaryValue5(){
        man.setCargocap(2);
        assertEquals("The entered value type int = 2", 2, man.getCargocap());
    }
    @Test
    public void setCargoCapTypeIntBoundaryValue6(){
        man.setCargocap(0);
        assertEquals("The entered value type int = 0", 0, man.getCargocap());
    }

}
