import java.util.Scanner;

public class Half {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Print the second half of the string
        int secondHalfStartIndex = length / 2;
        String secondHalf = inputString.substring(secondHalfStartIndex);
        System.out.println("Second half of the string: " + secondHalf);

        scanner.close();
    }
}