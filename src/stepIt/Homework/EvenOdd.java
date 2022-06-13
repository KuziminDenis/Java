package stepIt.Homework;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число, выход из программы ввод буквенного значения: ");
        while(input.hasNextInt()){
            int x = input.nextInt();
            if(x%2 == 0)
                System.out.println(x + " - четное");
           else
                System.out.println(x + " - нечетное");
            System.out.print("Введите число: ");
        }
    }
}
