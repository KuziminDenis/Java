package stepIt.Homework4.Phone;

public class Phone {

    int number;
    String model;
    double weight;

    Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(){

    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " " + number);
    }


    int getNumber(int number){
        return number ;
    }

    void sendMessage(int... number){
        for (int i : number) {
            System.out.print(i + " " + "Сообщение" + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
