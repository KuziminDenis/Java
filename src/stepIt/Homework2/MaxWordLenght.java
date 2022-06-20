package stepIt.Homework2;

import java.util.Scanner;

public class MaxWordLenght {
    public static void main(String[] args) {


        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] strArray = str.split(" ");

        int maxLong = strArray[0].length();
        int index = 0;

        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                index = i;
            }

        }
        System.out.println("Самое длинное слово: "+ strArray[index] + " состоящее из " + maxLong + " букв");



    }

}

