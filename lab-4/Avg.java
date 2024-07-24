import java.util.Scanner;
public class Avg  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1;
		System.out.print("enter size of arrar");
		n1=sc.nextInt();
		int i=0;
		int sum=0;
		int[] n =new int[n1];
		for(i=0;i<n1;i++){
			n[i]=sc.nextInt();
			sum=sum+n[i];
		}
		
		double avg=(double)sum/n1;
		System.out.print("avg="+avg);
	}
}