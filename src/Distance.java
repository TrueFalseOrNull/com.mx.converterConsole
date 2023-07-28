import java.util.Scanner;

/**
 * The Distance class is used to calculate the conversion of distance between
 * different systems.
 */
public class Distance {
    private static final double METER = 1;
    private static final double FEET = METER * 3.281;
    private static final double INCH = METER * 39.3701;
    private static final double KILOMETER = (METER * 1000);
    private static final double MILE = KILOMETER / 1.609;

    private static final String DIVIDER = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    private static final String SEPARATOR = "-------------------------------------";
    private static int selection = 0;
    private static double value = 0;

    /**
     * The menu function displays a menu of distance conversion options and captures
     * the user's
     * selection.
     * 
     * @param in The parameter "in" is of type Scanner. It is used to read input
     *           from the user.
     */
    public static void menu(Scanner in) {
        System.out.println();
        System.out.println(DIVIDER);
        System.out.println("Seleccione una opción  de conversion de distancia");
        System.out.println("(1) Metros a Pies");
        System.out.println("(2) Pies a Metros");
        System.out.println("(3) Metros a Pulgadas");
        System.out.println("(4) Pulgadas a Metros");
        System.out.println("(5) Kilómetros a Millas");
        System.out.println("(6) Millas a Kilómetros");
        System.out.println(SEPARATOR);
        System.out.println("(0) Regresar");
        System.out.println("(66) Salir");
        System.out.println();

        selection = Menu.captureOption(in);
    }

    /**
     * The function `calcValue` takes user input and performs various calculations
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
                value = Menu.inputValueMenu("Metros", "Pies", in);
                Menu.resultMenu(value * FEET);
            case 2:
                value = Menu.inputValueMenu("Pies", "Metros", in);
                Menu.resultMenu(value / FEET);
            case 3:
                value = Menu.inputValueMenu("Metros", "Pulgadas", in);
                Menu.resultMenu(value * INCH);
            case 4:
                value = Menu.inputValueMenu("Pulgadas", "Metros", in);
                Menu.resultMenu(value / INCH);
            case 5:
                value = Menu.inputValueMenu("Kilómetros", "Millas", in);
                Menu.resultMenu(value / MILE);
            case 6:
                value = Menu.inputValueMenu("Millas", "Kilómetros", in);
                Menu.resultMenu(value * MILE);
            case 0:
                // TODO return
            case 66:
                Menu.exit(in);
        }
    }
}
