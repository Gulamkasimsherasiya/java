import java.util.Scanner;

public class Consonant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line:");
        String line = scanner.nextLine().toLowerCase();
        int v = 0;
        int c = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

          
            if (Character.isLetter(ch)) {
               
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }

        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + c);

        scanner.close();
    }
}