import java.util.Scanner;
class Circle{
	int radius;
	public double getAreaOfCircle(double radius){
		return Math.PI*radius*radius;
	}
}
public class Circle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle:");
		double radius= sc.nextDouble();
		Circle c= new Circle();
		double area = c.getAreaOfCircle(radius);
		System.out.println("Area="+area);
		sc.close();
	}
}