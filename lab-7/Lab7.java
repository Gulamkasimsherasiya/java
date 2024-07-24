interface P{
	public static final int p = 5;
	void methodP();
}
interface P1 extends P{
	public static final int p1 = 10;
	void methodP1();
}
interface P2 extends P{
	public static final int p2 = 15;
	void methodP2();
}
interface P12 extends P1,P2{
	public static final int p12 = 20;
	void methodP12();
}
 class Q implements P12{
 	public void methodP12(){
 		System.out.println("P12 class : "+p12);
 	}public void methodP1(){
 		System.out.println("P1 class : "+p1);
 	}public void methodP2(){
 		System.out.println("P2 class : "+p2);
 	}public void methodP(){
 		System.out.println("P class : "+p);
 	}
 }
 public class Lab7{
 	public static void main(String args[]){
 		Q obj = new Q();
 		obj.methodP12();
 		obj.methodP1();
 		obj.methodP2();
 		obj.methodP();
 	}
 }