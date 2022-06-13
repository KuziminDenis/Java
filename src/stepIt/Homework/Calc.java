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
        System.out.println("Ввод числовых значений, выход нажатие буквенного значения: ");
        while(input.hasNextDouble()){
            double n = input.nextDouble();
            sum += n;
            numberOfNumbers +=1;
            avg = sum/numberOfNumbers;
            if(n > max){
                max = n;
            }
        }
        System.out.println("Сумма введенных чисел = " + sum);
        System.out.println("Среднее введенных чисел = " + avg);
        System.out.println("Сравнение введенных чисел = " + max);

    }
}
