
//TODO better handling of abstract class, use api for currency values, clean switches some are HUGE when I got more time
import java.util.Scanner;

/**
 * The App class contains a main method that displays a menu to the user and
 * performs calculations
 * based on the user's choice.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;

        while (option != 66) {
            option = Menu.mainMenu(in);

            switch (option) {
                case 1: // Currency
                    Currency.menu(in);
                    Currency.calcValue(in);

                case 2: // Temperature
                    Temperature.menu(in);
                    Temperature.calcValue(in);

                case 3: // Distance
                    Distance.menu(in);
                    Distance.calcValue(in);

                case 66: // exit
                    Menu.exit(in);
            }
        }
        in.close(); // Should be safe to remove but just in case I'll leave it
    }
}
