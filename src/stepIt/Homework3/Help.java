package stepIt.Homework3;

import java.io.IOException;
import java.util.Scanner;

public class Help {

     char ch;
        void showmenu(){
            System.out.println("1.if\n" +
                    "2.switch\n" +
                    "3.for\n" +
                    "4.while\n" +
                    "5.do-while" +
                    "6.break\n" +
                    "7.continue");
        }


        char isValid() throws IOException {

            while(-1 != (ch = (char)System.in.read())){
                System.out.println();
                if('q' == ch){
                    break;
                } else {
                    System.out.print("Выбор пункта меню, q выход ");
                    return ch;
                }

            }
            return ch;
        }

    void helpon() throws IOException {
         char c = isValid();
        switch (c){
            case '1': System.out.println("\n1.Oпepaтop if:\n" +
                                         "if (/*проверяемое условие*/)\n" +
                                         "{\n" + "\t/*тело оператора выбора 1*/;\n" + "}" +
                                         " else\n" + "\t  {\n" + "\t\t/*тело оператора выбора 2*/;\n" + "\t  }");break;

            case '2': System.out.println("\n2.Oпepaтop switch:\n" +
                                         "switch(ВыражениеДляСравнения) {\n" +
                                         "\tcase Совпадение1: команда;\n" +
                                         "\t\tbreak;\n" +
                                         "\tcase Совпадение2: команда;\n" +
                                         "\t\tbreak;\n" +
                                         "\tcase Совпадение3: команда;\n" +
                                         "\t\tbreak;\n" +
                                         "\tdefault: оператор;\n" +
                                         "\t\tbreak;");break;

            case '3': System.out.println("\n3.Oпepaтop for:\n" +
                                         "for(инициализация; условие; итерация){\n" +
                                         "\t\t/*операторы*/\n}");break;

            case '4': System.out.println("\n4.Oпepaтop while:\n" +
                                         "while(условие) {\n" +
                                         "/*тело цикла*/\n}");break;

            case '5': System.out.println("\n5.Oпepaтop do-while:\n" +
                                         "do {\n/*тело цикла*/\n" +
                                         "} while(условие-логическое выражение)");break;

            case '6': System.out.println("\n6.Oпepaтop break:\n" +
                                         "break; или break метка;");break;

            case '7': System.out.println("\n7.Oпepaтop continue:\n" +
                                         "continue; или continue метка;");break;
        }

    }

}



