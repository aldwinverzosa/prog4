
import util.IO;
import java.util.*;

/**
 * TEST COMMENT DFKJ:SF:KJFDKJ:FSDKJ
 * @author Aldwin
 */
public class Prog4 {

    public static void main(String[] args) {

        Scanner scan = IO.getGuiInput("Enter 2 real numbers:");
        float a = scan.nextInt();
        float b = scan.nextInt();

        if (a > 0 && b > 0) {
            IO.showMessage(String.format("Sum: %7.2f", a + b, "Results"));

        }

        Scanner scan1;
        scan1 = IO.getGuiInput("Enter 2 real numbers: ");
        float x = scan1.nextFloat();
        float y = scan1.nextFloat();

        if (x > 0 && y > 0) {
            IO.showMessage(String.format("Sum: %7.2f", a + b));
        } else if (x < 0 && y < 0) {
            IO.showMessage(String.format("Quotient: %7.2f", a / b));
        } else if (x > 0 || y > 0) {

            IO.showMessage(String.format("Product: %7.2f", x / y));
        }
        System.exit(0);
    }
}
