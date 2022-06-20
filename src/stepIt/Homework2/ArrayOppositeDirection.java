package stepIt.Homework2;

import java.util.Scanner;

public class ArrayOppositeDirection {
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

        System.out.print("Введенный массив: ");
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i]+ " ");
        }

        System.out.print("\nМассив в обратном направлении: ");
        for(int i = Array.length - 1; i >= 0; i--){
            System.out.print(Array[i] +" ");
        }

    }
}
