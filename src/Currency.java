import java.util.Scanner;

/**
 * The Currency class provides methods for converting currency values between
 * different currencies.
 */
public class Currency {
    // TODO: Change values to api from https://fixer.io/
    private static final double PESO = 1;
    private static final double DOLLAR = PESO * 16.85;
    private static final double EURO = PESO * 0.053;
    private static final double POUND = PESO * 0.046;
    private static final double YEN = PESO * 8.31;
    private static final double WON = PESO * 75.49;

    private static final String DIVIDER = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    private static final String SEPARATOR = "-------------------------------------";
    private static int selection = 0;
    private static double value = 0;

    /**
     * The menu function displays a list of currency conversion options and allows
     * the user to
     * select an option.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read user
     *           input from the
     *           console.
     */
    public static void menu(Scanner in) {

        System.out.println();
        System.out.println(DIVIDER);
        System.out.println("Elige la moneda a la que deseas convertir tu dinero");
        System.out.println("(1) Peso a Dólar");
        System.out.println("(2) Dólar a Peso");
        System.out.println("(3) Peso a Euros");
        System.out.println("(4) Euros a Peso");
        System.out.println("(5) Peso a Libras Esterlinas");
        System.out.println("(6) Libras Esterlinas a Peso");
        System.out.println("(7) Peso a Yen Japones");
        System.out.println("(8) Yen Japones a Peso");
        System.out.println("(9) Peso a Won surcoreano");
        System.out.println("(10) Won surcoreano a Peso");
        System.out.println(SEPARATOR);
        System.out.println("(0) Regresar");
        System.out.println("(66) Salir");
        System.out.println();

        selection = Menu.captureOption(in);
    }

    /**
     * The function `calcValue` takes user input and performs currency conversions
     * based on the
     * selected option.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read input
     *           from the user.
     */
    public static void calcValue(Scanner in) {
        // TODO use objects, clean this code when I get more time.... Im ashamed of it,
        // you should be too because you are reading it
        switch (selection) {
            case 1:
                value = Menu.inputValueMenu("Peso", "Dólar", in);
                Menu.resultMenu(value * DOLLAR);
            case 2:
                value = Menu.inputValueMenu("Dólar", "Peso", in);
                Menu.resultMenu(value / DOLLAR);
            case 3:
                value = Menu.inputValueMenu("Peso", "Euro", in);
                Menu.resultMenu(value * EURO);
            case 4:
                value = Menu.inputValueMenu("Euro", "Peso", in);
                Menu.resultMenu(value / EURO);
            case 5:
                value = Menu.inputValueMenu("Peso", "Libra Esterlinas", in);
                Menu.resultMenu(value * POUND);
            case 6:
                value = Menu.inputValueMenu("Libra Esterlinas", "Peso", in);
                Menu.resultMenu(value / POUND);
            case 7:
                value = Menu.inputValueMenu("Peso", "Yen Japones", in);
                Menu.resultMenu(value * YEN);
            case 8:
                value = Menu.inputValueMenu("Yen Japones", "Peso", in);
                Menu.resultMenu(value / YEN);
            case 9:
                value = Menu.inputValueMenu("Peso", "Won surcoreano", in);
                Menu.resultMenu(value * WON);
            case 10:
                value = Menu.inputValueMenu("Won surcoreano", "Peso", in);
                Menu.resultMenu(value / WON);
            case 0:
                // TODO return
            case 66:
                Menu.exit(in);
        }
    }
}
