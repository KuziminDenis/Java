package stepIt.Homework;

import java.util.Scanner;

public class PairsFactors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для разбивки на множители: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){

                if(j*i == number && j >= i){
                    System.out.println("Первый множитель " + j + " Второй множитель " + i);
                }
            }
        }

    }
}
