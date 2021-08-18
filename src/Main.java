import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calc();
    }

    /**
     * Input two Double type numbers
     * After input every number press Enter
     * Third input operation what you want to do and press Enter
     */
    public static void calc() {
        Scanner sc = new Scanner(System.in);
        // first number
        double numberOne = sc.nextDouble();
        // second number
        double numberTwo = sc.nextDouble();
        String operation = sc.next();
        switch (operation) {
            case ("+"):
                System.out.printf("%.4f", numberOne + numberTwo);
                break;
            case ("-"):
                System.out.printf("%.4f", numberOne - numberTwo);
                break;
            case ("*"):
                System.out.printf("%.4f", numberOne * numberTwo);
                break;
            case ("/"):
                System.out.printf("%.4f", numberOne / numberTwo);
                break;
        }
    }
}