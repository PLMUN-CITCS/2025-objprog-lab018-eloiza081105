import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        System.out.print("Please enter an integer: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer. Please try again.");
            scanner.next(); 
            System.out.print("Please enter an integer: ");
        }
        
        number = scanner.nextInt();
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {

        int number = getIntegerInput();

        String result = checkEvenOrOdd(number);
        
        System.out.println(result);
    }
}
