package stepIt.Homework2;

import java.util.Scanner;

public class MinArrayElement {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner ArraySizeInput = new Scanner(System.in);
        int MassSizeInput = ArraySizeInput.nextInt();
        int[] Array = new int[MassSizeInput];


        System.out.println("Введите массив: ");
        Scanner inputArray = new Scanner(System.in);

        for(int i = 0; i < Array.length; i++){
            Array[i] = inputArray.nextInt();
        }

        int Min = 0;

        for(int i = 0; i < Array.length - 1; i++){
                if(Array[i] < Array[i + 1]){
                    Min = Array[i];
                }
                else
                    Min = Array[i + 1];
        }

        System.out.print("Введенный массив: ");
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i]+ " ");
        }
        System.out.print("\nМинимальный элемент массива: " + Min);

    }
}
