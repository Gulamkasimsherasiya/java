import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fahrenheit:");
		double f = sc.nextDouble();
		double calcus = (5.0/9.0)*(f-32);
		System.out.println("calcus="+calcus);
	}
	
}