package stepIt.Homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int x = 0;
        int tmp;

        Scanner inputMassSize = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int massSize = inputMassSize.nextInt();
       int[] inputMass = new int[massSize];
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < inputMass.length ; i++){
            x = input.nextInt();
            inputMass[i] = x;
        }

        for(int i = 0; i < inputMass.length - 1; i++) {
            for (int j = 0; j < inputMass.length - 1; j++){
                if (inputMass[j] > inputMass[j + 1]) {
                    tmp = inputMass[j];
                    inputMass[j] = inputMass[j + 1];
                    inputMass[j + 1] = tmp;
                }

            }


        }
        System.out.print("Отсортированный массив по возрастанию: ");
        for(int i = 0; i < inputMass.length; i++){
            System.out.print(" " + inputMass[i]);
        }


    }
}
