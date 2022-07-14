package stepIt.Homework4.Phone;

public class InheritanceMain {

    public static void main(String[] args) {


        Phone ph1 = new Phone(234365465, "iPhone 13", 0.200);
        Phone ph2 = new Phone(034365465, "Samsung S10", 0.400);
        Phone ph3 = new Phone(243434355, "Xiaomi RN 10", 0.300);

        Phone sendMessage = new Phone();

        System.out.println(ph1 + "\n" + ph2 + "\n" + ph3);

        ph1.receiveCall("Denis");
        System.out.println(ph1.getNumber(2353));
        ph2.receiveCall("Denis2");
        System.out.println(ph2.getNumber(2453));
        ph3.receiveCall("Deni3");
        System.out.println(ph3.getNumber(5475686));
        ph3.receiveCall("Denis", 23435);

        sendMessage.sendMessage(35345,455675,45657,4565);
    }
}
