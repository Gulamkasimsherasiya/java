import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radious:");
		double radious = sc.nextDouble();
		double area = Math.PI*radious*radious;
		System.out.println("area="+area);
	}
	
}