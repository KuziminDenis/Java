package stepIt.Homework4.Vote;

import java.util.Arrays;
import java.util.Scanner;



public class Vote {

    String[] topic = {"1.Проблемы экологии          ",
                      "2.Проблема бедности          ",
                      "3.Продовольственная проблема ",
                      "4.Демографическая проблема   ",
                      "5.Экономическая проблема     "};

    int[][] answers = new int[5][10];

    //Заполнение массива с клавиатуры
    /*void fillingArrayAnswers(){
        Scanner input = new Scanner(System.in);
        int number;
        for(int i = 0; i < answers.length; i++){
            System.out.println("\nОцените проблему от 0 до 10");
            for(int j = 0; j <answers[i].length; j++){
                while(true){
                    System.out.print(topic[i] + ": ");
                    //int number = Integer.parseInt(input2.readLine());
                    number = input.nextInt();
                    if(number >=0 && number <= 10){
                        answers[i][j] = number;
                        break;
                    }
                    else
                        System.out.println("Не корректный воод, введите значение от 0 до 10 ");
                }
            }
            System.out.println();
        }
    }*/

    int fillArrayMath(){
        int x;
        while(true){
            x = (int)(Math.random() * 10);
            if(!(x < 11 && x > 0)){
                //System.out.println("Не корректный воод, введите значение от 0 до 10 ");
            }
            else break;
        }
        return x;
    }


    void  minMax() {
        int min = 100;
        int max = 0;
        int sum;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < answers.length; i++) {
            sum = 0;
            for (int j = 0; j < answers[i].length; j++) {
                sum += answers[i][j];
            }
            if(sum < min){
                min = sum;
                minIndex = i;
            }
            if(sum > max){
                max = sum;
                maxIndex = i;
            }
        }
        System.out.println("Минимальное количество баллов " + topic[minIndex] + " = " + min);
        System.out.println("Максимальное количество баллов " + topic[maxIndex] + " = " + max);
    }

    void showArrayTopic(){

            for (int i = 0; i < topic.length ; i++) {
                System.out.println(topic[i]);
            }
        System.out.println();
    }




    void showAnswersAndAvg(){
        int sum = 0;
        int avg;
        int count = 0;
        int x = 1;

        for(int i = 0; i < answers.length; i++){
            System.out.print(topic[i] + "\t");
            for(int j = 0; j <answers[i].length; j++){
                answers[i][j] = fillArrayMath();
                sum += answers[i][j];

                System.out.print(answers[i][j] + "\t");
                count++;
                x++;
            }
            avg = sum / answers[i].length;

            System.out.print(" AVG = " + avg + "  SUM = " + sum + "  Count = " + count);
            sum = 0;
            count = 0;
            x =1;

            System.out.println();
        }

    }


}
