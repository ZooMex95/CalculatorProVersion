import java.util.Scanner;

public class Main {
    /**
     * Choose what you want to do
     * input 1 for use calculator
     * input 2 for look for a biggest word
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case ("1"):
                calc();
                break;
            case ("2"):
                lookForBiggestWord();
                break;
            default:
                System.out.println("Wrong number");
        }

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

    /**
     * Input count of words and press Enter,
     * then input words, press Enter after every one.
     * You'll see a word with biggest length.
     */
    public static void lookForBiggestWord() {
        Scanner sc = new Scanner(System.in);
        int arraysLength = sc.nextInt();
        int maxLengthOfWord = 0;
        String[] arrayOfWords = new String[arraysLength];
        for (int i = 0; i < arraysLength; i++) {
            arrayOfWords[i] = sc.next();
            if (arrayOfWords[i].length() > maxLengthOfWord) {
                maxLengthOfWord = arrayOfWords[i].length();
            }
        }
        for (int i = 0; i < arraysLength; i++) {
            if (arrayOfWords[i].length() == maxLengthOfWord) {
                System.out.println(arrayOfWords[i]);
            }
        }
    }
}