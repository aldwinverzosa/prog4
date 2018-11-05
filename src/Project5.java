
import util.IO;

public class Project5 {

    public static String drawVLine(int n) {
        String result = "";
        int x = 0;
        while (x <= n) {
            result += "*" + "\n";
            x++;
        }
        n++;
        return result;
    }

    public static String drawHLine(int n, String ch) {
        String result = "";
        int i = 0;
        while (i < n) {
            result += ch;
            i++;
        }
        return result;
    }

    public static String drawBox(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String drawDiamond(int n) {
        String result = "";
        int x = 1;
        int spaces = n / 2;
        while (x < n) {
            result += drawHLine((n - x) / 2, " ") + drawHLine(x, "*") + "\n";
            spaces--;
            x += 2;
        }
        while (x >= 1) {
            result += drawHLine((n - x) / 2, " ") + drawHLine(x, "*") + "\n";
            x -= 2;
            spaces++;
        }

        return result;
    }

    public static int getNumber() {
        int x;
        do {
            x = IO.getGuiInput("Enter a positive odd number <20").nextInt();

        } while (!(x > 0 && x % 2 == 1 && x < 20));
        return x;
    }

    public static void main(String[] args) {
        int choice = getNumber();
        switch (choice) {
            case 5:
            case 11:
            case 15:
                IO.showMessage(drawDiamond(choice), "Diamond");
                break;
            case 3:
            case 9:
            case 17:
                IO.showMessage(drawBox(choice), "Box");
                break;
            default:
                IO.showMessage(drawVLine(choice), "V Line");
                break;

        }
    }

}
