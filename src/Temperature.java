import java.util.Scanner;

/**
 * The Temperature class provides a menu for converting temperatures between
 * Celsius and Fahrenheit.
 */
public class Temperature {
    private static final String DIVIDER = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    private static final String SEPARATOR = "-------------------------------------";
    private static int selection = 0;
    private static double value = 0;

    /**
     * The menu function displays a menu of temperature conversion options and
     * captures the user's
     * selection.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read input
     *           from the user.
     */
    public static void menu(Scanner in) {
        System.out.println();
        System.out.println(DIVIDER);
        System.out.println("Seleccione una opción  de conversion de temperatura");
        System.out.println("(1) \u00B0C a \u00B0F"); // °C --> °F
        System.out.println("(2) \u00B0F a \u00B0C"); // °F --> °C
        System.out.println(SEPARATOR);
        System.out.println("(0) Regresar");
        System.out.println("(66) Salir");
        System.out.println();

        selection = Menu.captureOption(in);
    }

    /**
     * The function `calcValue` takes user input and performs temperature
     * conversions between Celsius
     * and Fahrenheit.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read input
     *           from the user.
     */
    public static void calcValue(Scanner in) {
        // TODO use objects, clean this code when I get more time.... Im ashamed of it,
        // you should be too because you are reading it
        switch (selection) {
            case 1:
                value = Menu.inputValueMenu("grados Centígrados", "grados Fahrenheit", in);
                Menu.resultMenu((value * 9 / 5) + 32);
            case 2:
                value = Menu.inputValueMenu("grados Fahrenheit", "grados Centígrados", in);
                Menu.resultMenu((value - 32) * 5 / 9);
            case 0:
                // TODO return
            case 66:
                Menu.exit(in);
        }
    }
}