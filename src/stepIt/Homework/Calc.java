package stepIt.Homework;

import java.io.IOException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        int numberOfNumbers = 0;
        double max = 0;

        while(input.hasNextDouble()){
            double x = input.nextDouble();
            sum += x;
            numberOfNumbers +=1;
            avg = sum/numberOfNumbers;
            if(x > max){
                max = x;
            }
        }
        System.out.println("Сумма введенных чисел = " + sum);
        System.out.println("Среднее введенных чисел = " + avg);
        System.out.println("Сравнение введенных чисел = " + max);

    }
}
