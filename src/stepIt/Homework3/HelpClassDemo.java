package stepIt.Homework3;

import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {


        Help help = new Help();

        help.showmenu();
        System.out.print("Выбор пункта меню, q выход ");

        while (true) {
            help.helpon();
            if ('q' == help.ch) {
                break;
            }
        }
    }
}