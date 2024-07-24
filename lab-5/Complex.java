import java.util.Scanner;

class ComplexNo {
    int realNo;
    int imgNo;

    ComplexNo() {
        realNo = 0;
        imgNo = 0;
    }

    ComplexNo(int realNo, int imgNo) {
        this.realNo = realNo;
        this.imgNo = imgNo;
    }

    void addComplexNo(ComplexNo c1, ComplexNo c2) {
        this.realNo = c1.realNo + c2.realNo;
        this.imgNo = c1.imgNo + c2.imgNo;
    }
}

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value For 1st Complex No. :");
        System.out.println("=======================================");
        System.out.println("Enter Real Part of Complex No. :");
        int rr = sc.nextInt();
        System.out.println("Enter Imagenary Part of Complex No. :");
        int ii = sc.nextInt();
        ComplexNo c1 = new ComplexNo(rr, ii);

        System.out.println("Enter Value For 2nd Complex No. :");
        System.out.println("=======================================");
        System.out.println("Enter Real Part of Complex No. :");
        rr = sc.nextInt();
        System.out.println("Enter Imagenary Part of Complex No. :");
        ii = sc.nextInt();
        ComplexNo c2 = new ComplexNo(rr, ii);

        ComplexNo c3 = new ComplexNo();
        c3.addComplexNo(c1, c2);

        System.out.println("Sum of Given Complex Number is :");
        System.out.println(+c3.realNo+" "+c3.imgNo+" + * i");

        sc.close();

    }

}