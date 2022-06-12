package stepIt.Homework;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String x = input.next();

        switch (x){
            case "Russian":
                System.out.println("Привет");break;
            case "English":
                System.out.println("Hello");break;
            case "Spanish":
                System.out.println("Hola");break;
            case "German":
                System.out.println("Guten Morgen");

        }
    }
}
