import java.util.Scanner;

public class Student {
     int idNo;
     int noOfSubjectsRegistered;
     int[] subjectCode;
     int[] subjectCredits;
     char[] gradeObtained;
     double spi;

    
    public Student(int idNo, int noOfSubjectsRegistered, int[] subjectCode, int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        this.spi = calculateSPI();
    }


    double calculateSPI() {
        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            totalGradePoints += getGradePoint(gradeObtained[i]) * subjectCredits[i];
            totalCredits += subjectCredits[i];
        }

        return totalGradePoints / totalCredits;
    }

   
    double getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 8.0;
            case 'C':
                return 6.0;
            case 'D':
                return 4.0;
            case 'E':
                return 2.0;
            default:
                return 0.0; 
        }
    }

    public double getSpi() {
        return spi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID Number: ");
            int idNo = scanner.nextInt();
            System.out.print("Number of subjects registered: ");
            int noOfSubjectsRegistered = scanner.nextInt();
            scanner.nextLine(); // consume newline

            int[] subjectCode = new int[noOfSubjectsRegistered];
            int[] subjectCredits = new int[noOfSubjectsRegistered];
            char[] gradeObtained = new char[noOfSubjectsRegistered];

            
            for (int j = 0; j < noOfSubjectsRegistered; j++) {
                System.out.println("Enter details for subject " + (j + 1) + ":");
                System.out.print("Subject Code: ");
                subjectCode[j] = scanner.nextInt();
                System.out.print("Subject Credits: ");
                subjectCredits[j] = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Grade Obtained: ");
                gradeObtained[j] = scanner.nextLine().charAt(0);
            }

            students[i] = new Student(idNo, noOfSubjectsRegistered, subjectCode, subjectCredits, gradeObtained);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + students[i].idNo + " SPI: " + students[i].getSpi());
        }

        scanner.close();
    }
}