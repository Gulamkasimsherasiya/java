class Obj{
	static int count=0;
	 Obj(){
		count++;
	}
}
public class CountObjects{
	public static void main(String[] args) {
		Obj o1 = new Obj();
		Obj o2 = new Obj();
		Obj o3 = new Obj();
		Obj o4 = new Obj();
		System.out.println(o4.count);
	}
}