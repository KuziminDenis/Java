package stepIt.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int x = 0;
        int tmp;
       int[] inputMass = new int[5];

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

        for(int i = 0; i < inputMass.length; i++){
            System.out.println(inputMass[i]);
        }


    }
}
