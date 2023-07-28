import java.util.Scanner;

/**
 * The Menu class provides methods for displaying menus, capturing user input,
 * and handling program
 * exit.
 */
public class Menu {
    private static final String DIVIDER = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    private static final String SEPARATOR = "-------------------------------------";

    // TODO exceptions
    /**
     * The function prompts the user to input a value to convert and returns the
     * input as a double.
     * 
     * @param originType The originType parameter represents the type of the value
     *                   that the user wants
     *                   to convert. It is a string that describes the type of the
     *                   value, such as "temperature" or
     *                   "length".
     * @param returnType The returnType parameter is a String that represents the
     *                   type of value that
     *                   the user wants the input to be converted to.
     * @param in         The "in" parameter is a Scanner object that is used to read
     *                   input from the user. It is
     *                   passed as an argument to the method so that the method can
     *                   read the user's input.
     * @return The method is returning a double value.
     */
    public static double inputValueMenu(String originType, String returnType, Scanner in) {
        System.out.println(originType + " ==> " + returnType);
        System.out.println("Inserta el valor a convertir");
        return in.nextDouble();
    }

    /**
     * The mainMenu function displays a menu with options for currency, temperature,
     * and distance
     * conversions, and returns the user's selected option.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read input
     *           from the user.
     * @return The method is returning an integer value.
     */
    public static int mainMenu(Scanner in) {
        System.out.println();
        System.out.println(DIVIDER);
        System.out.println("Seleccione una opción de conversion");
        System.out.println("(1) Moneda");
        System.out.println("(2) Temperatura");
        System.out.println("(3) Distancia");
        System.out.println(SEPARATOR);
        System.out.println("(66) Salir");
        System.out.println();
        return Menu.captureOption(in);
    }

    /**
     * The function "resultMenu" prints a formatted result value to the console.
     * 
     * @param value The value parameter is a double data type, which represents a
     *              decimal number.
     */
    public static void resultMenu(double value) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("Resultado: " + value);
        System.out.println("------------------");
        System.out.println();
    }

    /**
     * The function captures an integer input from the user using a Scanner object
     * and handles any
     * exceptions by displaying an error message and exiting the program.
     * 
     * @param in The "in" parameter is a Scanner object that is used to read input
     *           from the user.
     * @return The method is returning an integer value.
     */
    public static int captureOption(Scanner in) {
        // TODO set valid options as argument captureOption(Scanner in, String
        // validOptions) to limit from valid numbers
        try {
            return in.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Solo una opcion valida");
            System.out.println();
            System.exit(0);
            return 0; // TODO clean logic of this return since you shouldn't need it
        }
    }

    /**
     * The function "exit" prints a message, closes the scanner, and terminates the
     * program.
     * 
     * @param in The "in" parameter is a Scanner object that is used to read input
     *           from the user. It is
     *           being closed before the program exits to ensure that any resources
     *           associated with it are
     *           properly released.
     */
    public static void exit(Scanner in) {
        System.out.println("Execute order 66");
        in.close();
        System.exit(0);
    }
}
