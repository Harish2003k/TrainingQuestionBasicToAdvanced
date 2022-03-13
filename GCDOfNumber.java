import java.util.*;
public class GCDOfNumber {
	public static void main(String args[]) {
		int i,gcd;
		System.out.println("Enter the number1:");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter the number2:");
		int n2=sc.nextInt();
		for(int i=1;i<=n1 && i<=n2;++i) {
			if(n1%i && n2%i) {
				gcd=i;
			}
		}
		System.out.println("Gcd of"+n1+ "and"+n2+"is "+n1);
	}

}
